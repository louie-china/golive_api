package com.golive.base.api.controller;


import com.golive.base.api.model.FeedbackDefault;
import com.golive.base.api.service.FeedbackService;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.List;

/**
 * 反馈信息
 *
 * @author wuzhping
 */
@Controller
@RequestMapping("feedback")
public class FeedbackController {

    Logger logger = Logger.getLogger(FeedbackController.class);

    @Autowired
    private FeedbackService feedbackService;

    @RequestMapping("/list")
    @ResponseBody
    public List<FeedbackDefault> list(HttpServletRequest request, HttpServletResponse response, String id) throws Exception {
        String clientType = "OTHER";
        List<FeedbackDefault> list = feedbackService.findFeedbackDefaultList(clientType);
        return list;
    }

}
