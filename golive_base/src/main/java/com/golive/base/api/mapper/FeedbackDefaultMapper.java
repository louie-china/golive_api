package com.golive.base.api.mapper;

import com.golive.base.api.model.FeedbackDefault;

import java.util.List;

public interface FeedbackDefaultMapper {

    List<FeedbackDefault> findFeedbackDefaultList() throws Exception;

    List<FeedbackDefault> findFeedbackDefaultByClientType(String clientType) throws Exception;

}
