package com.golive.base.bean;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;


public class Parameter {
    @XStreamAsAttribute
    private String iname;            //接口名称
    @XStreamAsAttribute
    private String type;            //接口类型，1表示直播电视，2表示直播剧场
    @XStreamAsAttribute
    private String language;        //语言
    @XStreamAsAttribute
    private String region;        //地区代码
    @XStreamAsAttribute
    @XStreamAlias("device")
    private DeviceInfo device;      //设备信息
    @XStreamAsAttribute
    @XStreamAlias("live")
    private LiveInfo live;//验证信息
    @XStreamAsAttribute
    @XStreamAlias("user")
    private UserInfo user;//用户信息
    @XStreamAsAttribute
    @XStreamAlias("data")
    private ParaData data;          //请求参数
    @XStreamAsAttribute
    @XStreamAlias("order")
    private OrderInfo order;//定单参数

    public OrderInfo getOrder() {
        return order;
    }

    public void setOrder(OrderInfo order) {
        this.order = order;
    }

    public String getIname() {
        return iname;
    }

    public void setIname(String iname) {
        this.iname = iname;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public DeviceInfo getDevice() {
        return device;
    }

    public void setDevice(DeviceInfo device) {
        this.device = device;
    }

    public LiveInfo getLive() {
        return live;
    }

    public void setLive(LiveInfo live) {
        this.live = live;
    }

    public UserInfo getUser() {
        return user;
    }

    public void setUser(UserInfo user) {
        this.user = user;
    }

    public ParaData getData() {
        return data;
    }

    public void setData(ParaData data) {
        this.data = data;
    }
}
