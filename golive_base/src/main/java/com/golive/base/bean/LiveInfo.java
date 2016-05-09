package com.golive.base.bean;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class LiveInfo {
    @XStreamAsAttribute
    private String mac;                //终端mac地址，12位字符
    @XStreamAsAttribute
    private String deviceid;        //加密后的deviceid(DES加密)，对于第3方设备，deviceid为空，则此字段为空，
    @XStreamAsAttribute
    private String livetoken;        //livetoken=md5(deviceid+livekey)，deviceid加密后的32位，livetoken长度为32位。livekey初始值为8位0。对于第3方设备，deviceid为空，则直接用livekey加密
    @XStreamAsAttribute
    private String livever;            //直播App的版本
    @XStreamAsAttribute
    private String clientkey;       //DES key，用于报文交互间的加密与解密

    public String getClientkey() {
        return clientkey;
    }

    public void setClientkey(String clientkey) {
        this.clientkey = clientkey;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid;
    }

    public String getLivetoken() {
        return livetoken;
    }

    public void setLivetoken(String livetoken) {
        this.livetoken = livetoken;
    }

    public String getLivever() {
        return livever;
    }

    public void setLivever(String livever) {
        this.livever = livever;
    }
}
