import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.golive.config.api.dao.ConfigDao;
import com.golive.config.api.model.PublishNumber;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * Created by Administrator on 2016/5/4.
 */
//@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"classpath:spring-mybatis.xml","classpath:spring-mvc.xml"})
//public class TestConfig {
//    @Autowired
//    private ConfigDao configDao;
//    @Test
//    public void testConfig() throws JsonProcessingException {
//        List<PublishNumber> publishNumbers=configDao.getPublishNumberByTypeLanguage("3","zh");
//        System.out.println("==============================================="+new ObjectMapper().writeValueAsString(publishNumbers)+"");
//
//    }
//
//}
