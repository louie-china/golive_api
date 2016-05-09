package com.golive.base.api.service.impl;


import com.golive.base.api.mapper.BaseDataMapper;
import com.golive.base.api.mapper.FeedbackDefaultMapper;
import com.golive.base.api.memcache.BaseCacheApi;
import com.golive.base.api.model.ClientType;
import com.golive.base.api.model.FeedbackDefault;
import com.golive.base.api.service.CommonService;
import com.golive.base.util.Constants;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * 公共查询信息
 *
 * @author wuzhping
 */
@Service
public class CommonServiceImpl implements CommonService {

    @Autowired
    private BaseCacheApi baseCacheApi;
    @Resource
    private BaseDataMapper baseDataMapper;
    @Resource
    private FeedbackDefaultMapper feedbackDefaultMapper;

    @SuppressWarnings("unchecked")

    public List<ClientType> findClientTypeList() throws Exception {
        List<ClientType> list = null;
        Object object = baseCacheApi.get(Constants.Golive_Base_ClientType);
        if (object != null) {
            list = (List<ClientType>) object;
        } else {
            list = baseDataMapper.findClientTypeList();
        }
        return list;
    }


    public ClientType findClientTypeByCode(String code) throws Exception {
        ClientType model = null;
        Object object = baseCacheApi.get(Constants.Golive_Base_ClientType_ + code);
        if (object != null) {
            model = (ClientType) object;
        } else {
            model = baseDataMapper.findClientTypeByCode(code);
        }
        return model;
    }

    @SuppressWarnings("unchecked")

    public List<FeedbackDefault> findFeedbackDefaultList() throws Exception {
        List<FeedbackDefault> list = null;
        Object object = baseCacheApi.get(Constants.Golive_Base_FeedbackDefault);
        if (object != null) {
            list = (List<FeedbackDefault>) object;
        } else {
            list = feedbackDefaultMapper.findFeedbackDefaultList();
        }
        return list;
    }

    @SuppressWarnings("unchecked")

    public List<FeedbackDefault> findFeedbackDefaultByClientType(String clientType)
            throws Exception {
        List<FeedbackDefault> list = null;
        Object object = baseCacheApi.get(Constants.Golive_Base_FeedbackDefault_ + clientType);
        if (object != null) {
            list = (List<FeedbackDefault>) object;
        } else {
            list = feedbackDefaultMapper.findFeedbackDefaultByClientType(clientType);
        }
        return list;
    }


}
