package com.golive.base.bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

@XStreamAlias("response")
public class ResponseBean {

    @XStreamAsAttribute
    private RespData data;

    public RespData getData() {
        return data;
    }

    public void setData(RespData data) {
        this.data = data;
    }

}
