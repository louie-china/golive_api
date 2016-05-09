package com.golive.config.api.controller;

import com.golive.base.bean.RequestBean;
import com.golive.base.bean.ResponseDTO;
import com.golive.config.api.service.ConfigService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;

/**
 * Created by Administrator on 2016/5/4.
 */
@RestController
@RequestMapping(value = "/config")
public class ConfigWebservice {
    @Autowired
    private ConfigService configService;

    @RequestMapping(value = "/mainConfig")
    private ResponseDTO getMainConfig(@RequestBody RequestBean requestBean, HttpServletRequest request, HttpServletResponse response) throws UnsupportedEncodingException {
        request.setCharacterEncoding("UTF-8");
        response.setCharacterEncoding("UTF-8");
        response.setContentType("text/html;charset=UTF-8");


        return null;
    }

    /**
     * 公众号信息入口
     *
     * @param requestBean
     * @return
     */
    @RequestMapping(value = "/publicNumber")
    private String getPublishNumber(@RequestBody RequestBean requestBean) {
        return configService.getPublicNumber(requestBean);
    }

    /**
     * 消息入口
     * @param requestBean
     * @return
     */
    @RequestMapping(value = "/messages")
    private String getMessage(@RequestBody RequestBean requestBean){


        return null;
    }
}
