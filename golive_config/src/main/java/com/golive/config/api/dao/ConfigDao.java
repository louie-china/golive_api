package com.golive.config.api.dao;

import com.golive.config.api.model.PublishNumber;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by Administrator on 2016/5/4.
 */
@Component
public class ConfigDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 根据类型和语言获取公众号信息
     * @param type
     * @param lancode
     * @return
     */
    public List<PublishNumber> getPublishNumberByTypeLanguage(String type, String lancode)  {
        PublishNumber publishNumber = new PublishNumber();
        List<PublishNumber> publishNumbers = jdbcTemplate.query(publishNumber.selectSQL("Type=? and LanguageCode=?"), new Object[]{Integer.parseInt(type), lancode},publishNumber);
        return publishNumbers;
    }


    public static void main(String[] args) {
        PublishNumber publishNumber=new PublishNumber();
        publishNumber.setBarCode("xx");
        publishNumber.setDescription("xx'x'");
        publishNumber.setID(11l);
        System.out.println(publishNumber.updateSQL(null));
        System.out.println(new PublishNumber().selectSQL("Type=? and LanguageCode=?"));
    }
}
