package com.golive.base.util;

import org.apache.commons.lang.StringUtils;
import org.dom4j.Document;
import org.dom4j.DocumentHelper;
import org.dom4j.Element;
import org.dom4j.dom.DOMElement;

/**
 * Created by Administrator on 2016/5/4.
 */
public class DomHelper {
    public static Element create(Document document,int status, String code) {
        Element response = document.addElement("response");
        Element element=response.addElement("result");
        element.addAttribute("type", status==0?"false":"true");
        element.addAttribute("note", StringUtils.isEmpty(code) ? " " : code);
        element.addAttribute("servertime", DateHelper.getNow());
        return response;
    }
}
