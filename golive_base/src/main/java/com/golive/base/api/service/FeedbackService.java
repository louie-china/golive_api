package com.golive.base.api.service;



import com.golive.base.api.model.FeedbackDefault;

import java.util.List;

public interface FeedbackService {

    List<FeedbackDefault> findFeedbackDefaultList(String clientType) throws Exception;

}
