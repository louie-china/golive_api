package com.golive.base.bean;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;


public class UserInfo {
    @XStreamAsAttribute
    private String userid;            //用户系统的huanid,第3方第一次访问是空的，需要生成一个给终端
    @XStreamAsAttribute
    private String token;            //用户系统的token
    @XStreamAsAttribute
    private String uver;            //用户系统版本，当前为2，对于第3方设备，此字段为空

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUVer() {
        return uver;
    }

    public void setUVer(String uver) {
        this.uver = uver;
    }
}
