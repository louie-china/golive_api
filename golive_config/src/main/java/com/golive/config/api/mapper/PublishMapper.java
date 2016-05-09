package com.golive.config.api.mapper;

import com.golive.config.api.model.PublishNumber;

import java.util.List;

/**
 * Created by Administrator on 2016/5/5.
 */
public interface PublishMapper {
    List<PublishNumber> getPublishNumberByTypeLanguage(String type);

    List<PublishNumber> getPublishNumberByTypeLanguage2(String type);
}
