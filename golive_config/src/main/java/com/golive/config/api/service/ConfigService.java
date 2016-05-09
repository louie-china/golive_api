package com.golive.config.api.service;

import com.golive.base.bean.RequestBean;
import com.golive.base.util.DomHelper;
import com.golive.config.api.dao.ConfigDao;
import com.golive.config.api.mapper.PublishMapper;
import com.golive.config.api.model.PublishNumber;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * Created by Administrator on 2016/5/4.
 */
@Service
public class ConfigService {
    @Autowired
    private ConfigDao configDao;
    @Autowired
    private PublishMapper publishMapper;

    /**
     * 获取公众号信息
     *
     * @param requestBean
     * @return
     */
    public String getPublicNumber(RequestBean requestBean) {
        Document document = DocumentHelper.createDocument();
        String lan = requestBean.getParameter().getLanguage();
        String type = requestBean.getParameter().getType();
        if (StringUtils.isEmpty(type) || StringUtils.isEmpty(lan)) {
            DomHelper.create(document, 1, "5001");
            return document.asXML();
        } else {
            List<PublishNumber> publishNumbers = null;//configDao.getPublishNumberByTypeLanguage(type,lan);
            publishNumbers = configDao.getPublishNumberByTypeLanguage(type, lan);
            if (CollectionUtils.isEmpty(publishNumbers)) {
                DomHelper.create(document, 1, "5001");
                return document.asXML();
            }
            Element response = DomHelper.create(document, 0, null);
            Element data = response.addElement("data");
            Element infos = data.addElement("infos");
            infos.addAttribute("records", publishNumbers.size() + "");
            Element info = null;
            for (PublishNumber publishNumber : publishNumbers) {
                info = infos.addElement("info");
                info.addAttribute("name", publishNumber.getName());
                info.addAttribute("logo", publishNumber.getLogo());
                info.addAttribute("barcode", publishNumber.getBarCode());
                info.addAttribute("description", publishNumber.getDescription());
            }
            return document.asXML();
        }
    }
}
