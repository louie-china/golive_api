package com.golive.base.api.memcache.impl;


import com.golive.base.api.mapper.BaseDataMapper;
import com.golive.base.api.mapper.FeedbackDefaultMapper;
import com.golive.base.api.memcache.BaseCacheApi;
import com.golive.base.api.memcache.UserCacheService;
import com.golive.base.api.model.ClientType;
import com.golive.base.api.model.FeedbackDefault;
import com.golive.base.api.service.CommonService;
import com.golive.base.util.Constants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.Collections;
import java.util.List;

@Service
public class UserCacheServiceImpl implements UserCacheService {

    @Autowired
    private BaseCacheApi baseCacheApi;
    @Autowired
    private CommonService commonService;
    @Resource
    private BaseDataMapper baseDataMapper;
    @Resource
    private FeedbackDefaultMapper feedbackDefaultMapper;

    @SuppressWarnings("unchecked")

    public void loadClientType() throws Exception {
        List<ClientType> list = (List<ClientType>) baseCacheApi.get(Constants.Golive_Base_ClientType);
        if (list == null || list.size() <= 0) {
            list = baseDataMapper.findClientTypeList();
            if (list != null && list.size() > 0) {
                baseCacheApi.add(Constants.Golive_Base_ClientType, 0, list);
                for (ClientType clientType : list) {
                    baseCacheApi.add(Constants.Golive_Base_ClientType_ + clientType.getInstalmentCode(), 0, clientType);
                }
            }
        }
    }


    public void refreshClientType(String code) throws Exception {
        if (code != null && !"".equals(code)) {
            ClientType model = baseDataMapper.findClientTypeByCode(code);
            if (model != null) {
                baseCacheApi.add(Constants.Golive_Base_ClientType_ + code, 0, model);
            } else {
                baseCacheApi.delete(Constants.Golive_Base_ClientType_ + code);
            }
        } else {
            List<ClientType> list = baseDataMapper.findClientTypeList();
            baseCacheApi.add(Constants.Golive_Base_ClientType, 0, null == list ? Collections.emptyList() : list);
            if (list != null && list.size() > 0) {
                for (ClientType clientType : list) {
                    baseCacheApi.add(Constants.Golive_Base_ClientType_ + clientType.getInstalmentCode(), 0, clientType);
                }
            }
        }
    }

    @SuppressWarnings("unchecked")

    public void loadFeedbackDefault() throws Exception {
        List<FeedbackDefault> list = (List<FeedbackDefault>) baseCacheApi.get(Constants.Golive_Base_FeedbackDefault);
        if (list == null || list.size() <= 0) {
            list = feedbackDefaultMapper.findFeedbackDefaultList();
            if (list != null && list.size() > 0) {
                baseCacheApi.add(Constants.Golive_Base_FeedbackDefault, 0, list);
                List<ClientType> clientTypeList = commonService.findClientTypeList();
                if (null == clientTypeList || clientTypeList.size() == 0) {
                    clientTypeList = baseDataMapper.findClientTypeList();
                }
                if (clientTypeList != null && clientTypeList.size() > 0) {
                    for (ClientType clientType : clientTypeList) {
                        list = null;
                        list = feedbackDefaultMapper.findFeedbackDefaultByClientType(clientType.getInstalmentCode());
                        baseCacheApi.add(Constants.Golive_Base_FeedbackDefault_ + clientType.getInstalmentCode(), 0, null == list ? Collections.emptyList() : list);
                    }
                }
            }
        }
    }


    public void refreshFeedbackDefault(String clientType) throws Exception {
        if (clientType != null && !"".equals(clientType)) {
            List<FeedbackDefault> list = feedbackDefaultMapper.findFeedbackDefaultByClientType(clientType);
            if (list != null && list.size() > 0) {
                baseCacheApi.add(Constants.Golive_Base_FeedbackDefault_ + clientType, 0, null == list ? Collections.emptyList() : list);
            } else {
                baseCacheApi.delete(Constants.Golive_Base_FeedbackDefault_ + clientType);
            }
        } else {
            List<FeedbackDefault> list = feedbackDefaultMapper.findFeedbackDefaultList();
            baseCacheApi.add(Constants.Golive_Base_FeedbackDefault, 0, null == list ? Collections.emptyList() : list);
            if (list != null && list.size() > 0) {
                List<ClientType> clientTypeList = commonService.findClientTypeList();
                if (null == clientTypeList || clientTypeList.size() == 0) {
                    clientTypeList = baseDataMapper.findClientTypeList();
                }
                if (clientTypeList != null && clientTypeList.size() > 0) {
                    for (ClientType ct : clientTypeList) {
                        list = null;
                        list = feedbackDefaultMapper.findFeedbackDefaultByClientType(ct.getInstalmentCode());
                        baseCacheApi.add(Constants.Golive_Base_FeedbackDefault_ + ct.getInstalmentCode(), 0, null == list ? Collections.emptyList() : list);
                    }
                }
            }
        }
    }

}
