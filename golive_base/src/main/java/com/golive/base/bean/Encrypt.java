package com.golive.base.bean;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;


public class Encrypt {

    @XStreamAsAttribute
    private String etype;//加密类型：1-RSA; 2-DES
    @XStreamAsAttribute
    private String datatype; //数据类型：1-XML; 2-JSON
    @XStreamAsAttribute
    private String cleartext; //明文
    @XStreamAsAttribute
    private String ciphertext; //密文
    @XStreamAsAttribute
    private String resultcode; //加密或解密结果编码
    @XStreamAsAttribute
    private String desKey;

    public String getDesKey() {
        return desKey;
    }

    public void setDesKey(String desKey) {
        this.desKey = desKey;
    }

    public String getEtype() {
        return etype;
    }

    public void setEtype(String etype) {
        this.etype = etype;
    }

    public String getDatatype() {
        return datatype;
    }

    public void setDatatype(String datatype) {
        this.datatype = datatype;
    }

    public String getCleartext() {
        return cleartext;
    }

    public void setCleartext(String cleartext) {
        this.cleartext = cleartext;
    }

    public String getCiphertext() {
        return ciphertext;
    }

    public void setCiphertext(String ciphertext) {
        this.ciphertext = ciphertext;
    }

    public String getResultcode() {
        return resultcode;
    }

    public void setResultcode(String resultcode) {
        this.resultcode = resultcode;
    }

}
