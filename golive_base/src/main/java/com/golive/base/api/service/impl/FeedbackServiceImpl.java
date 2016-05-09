package com.golive.base.api.service.impl;


import com.golive.base.api.model.FeedbackDefault;
import com.golive.base.api.service.CommonService;
import com.golive.base.api.service.FeedbackService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackServiceImpl implements FeedbackService {

    Logger logger = Logger.getLogger(FeedbackServiceImpl.class);

    @Autowired
    private CommonService commonService;


    public List<FeedbackDefault> findFeedbackDefaultList(String clientType)
            throws Exception {
        //获取设备型号信息
        //ClientType ct = commonService.findClientTypeByCode(clientType) ;
        List<FeedbackDefault> list = commonService.findFeedbackDefaultByClientType(clientType);
        return list;
    }

}
