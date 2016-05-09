package com.golive.base.api.controller;


import com.golive.base.api.memcache.UserCacheService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 缓存信息管理
 *
 * @author wuzhping
 */
@Controller
@RequestMapping("base/cache")
public class CacheController {

    Logger logger = Logger.getLogger(CacheController.class);
    @Autowired
    private UserCacheService userCacheService;

    /**
     * 刷新设备型号信息
     *
     * @throws Exception
     */
    @RequestMapping("/clientType")
    public ModelAndView clientType(HttpServletRequest request, HttpServletResponse response) throws Exception {
        try {
            String code = request.getParameter("code") == null ? "" : request.getParameter("code").toString();
            userCacheService.refreshClientType(code);
        } catch (Exception e) {
            logger.error("refresh clientType in cache fail", e);
            return new ModelAndView("failure");
        }
        return new ModelAndView("success");
    }
}
