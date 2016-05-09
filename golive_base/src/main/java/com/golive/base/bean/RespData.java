package com.golive.base.bean;


import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class RespData {
    // 用户登录信息
    @XStreamAsAttribute
    private String loginoutid;
    @XStreamAsAttribute
    private String goliveid;
    @XStreamAsAttribute
    private String instalmentcode;
    @XStreamAsAttribute
    private String manufacturercode;
    @XStreamAsAttribute
    private String deviceid;
    @XStreamAsAttribute
    private String macaddress;
    @XStreamAsAttribute
    private String areacode;
    @XStreamAsAttribute
    private String ipaddress;
    @XStreamAsAttribute
    private String versiontype;    //终端版本类型
    @XStreamAsAttribute
    private String version;    //终端版本编号
    @XStreamAsAttribute
    private String platform;    //设备平台
    @XStreamAsAttribute
    private String partnerid;    //合作方信息ID
    @XStreamAsAttribute
    private String logintime;
    @XStreamAsAttribute
    private String logouttime;

    public String getLoginoutid() {
        return loginoutid;
    }

    public void setLoginoutid(String loginoutid) {
        this.loginoutid = loginoutid;
    }

    public String getGoliveid() {
        return goliveid;
    }

    public void setGoliveid(String goliveid) {
        this.goliveid = goliveid;
    }

    public String getInstalmentcode() {
        return instalmentcode;
    }

    public void setInstalmentcode(String instalmentcode) {
        this.instalmentcode = instalmentcode;
    }

    public String getManufacturercode() {
        return manufacturercode;
    }

    public void setManufacturercode(String manufacturercode) {
        this.manufacturercode = manufacturercode;
    }

    public String getDeviceid() {
        return deviceid;
    }

    public void setDeviceid(String deviceid) {
        this.deviceid = deviceid;
    }

    public String getMacaddress() {
        return macaddress;
    }

    public void setMacaddress(String macaddress) {
        this.macaddress = macaddress;
    }

    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    public String getIpaddress() {
        return ipaddress;
    }

    public void setIpaddress(String ipaddress) {
        this.ipaddress = ipaddress;
    }

    public String getVersiontype() {
        return versiontype;
    }

    public void setVersiontype(String versiontype) {
        this.versiontype = versiontype;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getPlatform() {
        return platform;
    }

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getPartnerid() {
        return partnerid;
    }

    public void setPartnerid(String partnerid) {
        this.partnerid = partnerid;
    }

    public String getLogintime() {
        return logintime;
    }

    public void setLogintime(String logintime) {
        this.logintime = logintime;
    }

    public String getLogouttime() {
        return logouttime;
    }

    public void setLogouttime(String logouttime) {
        this.logouttime = logouttime;
    }
}
