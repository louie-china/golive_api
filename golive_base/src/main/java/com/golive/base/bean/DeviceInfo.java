package com.golive.base.bean;


import com.thoughtworks.xstream.annotations.XStreamAsAttribute;


public class DeviceInfo {
    @XStreamAsAttribute
    private String devmodel;        //终端型号，对于第3方设备，此字段为空
    @XStreamAsAttribute
    private String dnum;            //用户系统的dnum，对于第3方设备，此字段为空
    @XStreamAsAttribute
    private String didtoken;        //用户系统的didtoken，对于第3方设备，此字段为空
    @XStreamAsAttribute
    private String dver;            //终端软件版本，对于第3方设备，此字段为空
    @XStreamAsAttribute
    private String devtype;        //设备类型（1-电视；2-OTT；3-手机；4-PAD；5-其他）
    @XStreamAsAttribute
    private String clienttype;      //设备型号

    public String getDevmodel() {
        return devmodel;
    }

    public void setDevmodel(String devmodel) {
        this.devmodel = devmodel;
    }

    public String getDnum() {
        return dnum;
    }

    public void setDnum(String dnum) {
        this.dnum = dnum;
    }

    public String getDidtoken() {
        return didtoken;
    }

    public void setDidtoken(String didtoken) {
        this.didtoken = didtoken;
    }

    public String getDver() {
        return dver;
    }

    public void setDver(String dver) {
        this.dver = dver;
    }

    public String getDevtype() {
        return devtype;
    }

    public void setDevtype(String devtype) {
        this.devtype = devtype;
    }

    public String getClienttype() {
//        if (clienttype == null || "".equals(clienttype) || "000".equals(clienttype)) {
//            clienttype = Constants.GOLIVETV_SYSTEM_CLIENTTYPE_DEFAULT;
//        }
        return clienttype;
    }

    public void setClienttype(String clienttype) {
        this.clienttype = clienttype;
    }
}
