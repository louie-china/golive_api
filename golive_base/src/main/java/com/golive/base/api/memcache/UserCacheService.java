package com.golive.base.api.memcache;

/**
 * 用户模块缓存信息
 *
 * @author wuzhping
 */
public interface UserCacheService {

    /**
     * 加载设备型号信息
     *
     * @return
     * @throws Exception
     */
    void loadClientType() throws Exception;

    /**
     * 刷新设备型号信息
     *
     * @param code
     * @return
     * @throws Exception
     */
    void refreshClientType(String code) throws Exception;

    /**
     * 加载系统默认反馈信息
     *
     * @throws Exception
     */
    void loadFeedbackDefault() throws Exception;

    /**
     * 刷新系统默认反馈信息
     *
     * @param code
     * @throws Exception
     */
    void refreshFeedbackDefault(String code) throws Exception;

}
