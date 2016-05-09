package com.golive.base.api.service;



import com.golive.base.api.model.ClientType;
import com.golive.base.api.model.FeedbackDefault;

import java.util.List;

public interface CommonService {

    /**
     * 查找所有的设备型号信息
     *
     * @return
     * @throws Exception
     */
    List<ClientType> findClientTypeList() throws Exception;

    /**
     * 根据编码查找设备型号信息
     *
     * @param code
     * @return
     * @throws Exception
     */
    ClientType findClientTypeByCode(String code) throws Exception;

    /**
     * 查找所有的系统默认反馈信息
     *
     * @return
     * @throws Exception
     */
    List<FeedbackDefault> findFeedbackDefaultList() throws Exception;

    /**
     * 根据设备型号查找系统默认反馈信息
     *
     * @param clientType
     * @return
     * @throws Exception
     */
    List<FeedbackDefault> findFeedbackDefaultByClientType(String clientType) throws Exception;

}
