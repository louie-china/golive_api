package com.golive.base.bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

import java.io.Serializable;

@XStreamAlias("request")
public class RequestBean implements Serializable {
    /**
     *
     */
    private static final long serialVersionUID = 1L;
    //request
    @XStreamAlias("website")
    @XStreamAsAttribute
    private String website;
    @XStreamAsAttribute
    private Parameter parameter;
    @XStreamAsAttribute
    private Encrypt encrypt;

    public Encrypt getEncrypt() {
        return encrypt;
    }

    public void setEncrypt(Encrypt encrypt) {
        this.encrypt = encrypt;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public Parameter getParameter() {
        return parameter;
    }

    public void setParameter(Parameter parameter) {
        this.parameter = parameter;
    }
}
