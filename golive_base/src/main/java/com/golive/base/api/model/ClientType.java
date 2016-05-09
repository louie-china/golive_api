package com.golive.base.api.model;

import java.io.Serializable;

public class ClientType implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;
    private long id;
    private String instalmentCode;
    private String instalmentName;
    private String manufacturerCode;
    private String presentVersion;
    private String launcherSwitch;
    private Short play;
    private Short speedLimit;
    private String hardwarePlatformCode;
    private Short lockSwitch;
    private Short adSwitch;
    private Short signCoin;
    private String kdmServerAddressID;
    private Long partnerID;
    private String currency;
    private Short payType;
    private Short kdmSwitch;
    private String licenseProviderCode;
    private Short useSdcard;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getInstalmentCode() {
        return instalmentCode;
    }

    public void setInstalmentCode(String instalmentCode) {
        this.instalmentCode = instalmentCode;
    }

    public String getInstalmentName() {
        return instalmentName;
    }

    public void setInstalmentName(String instalmentName) {
        this.instalmentName = instalmentName;
    }

    public String getManufacturerCode() {
        return manufacturerCode;
    }

    public void setManufacturerCode(String manufacturerCode) {
        this.manufacturerCode = manufacturerCode;
    }

    public String getPresentVersion() {
        return presentVersion;
    }

    public void setPresentVersion(String presentVersion) {
        this.presentVersion = presentVersion;
    }

    public String getLauncherSwitch() {
        return launcherSwitch;
    }

    public void setLauncherSwitch(String launcherSwitch) {
        this.launcherSwitch = launcherSwitch;
    }

    public Short getPlay() {
        return play;
    }

    public void setPlay(Short play) {
        this.play = play;
    }

    public Short getSpeedLimit() {
        return speedLimit;
    }

    public void setSpeedLimit(Short speedLimit) {
        this.speedLimit = speedLimit;
    }

    public String getHardwarePlatformCode() {
        return hardwarePlatformCode;
    }

    public void setHardwarePlatformCode(String hardwarePlatformCode) {
        this.hardwarePlatformCode = hardwarePlatformCode;
    }

    public Short getLockSwitch() {
        return lockSwitch;
    }

    public void setLockSwitch(Short lockSwitch) {
        this.lockSwitch = lockSwitch;
    }

    public Short getAdSwitch() {
        return adSwitch;
    }

    public void setAdSwitch(Short adSwitch) {
        this.adSwitch = adSwitch;
    }

    public Short getSignCoin() {
        return signCoin;
    }

    public void setSignCoin(Short signCoin) {
        this.signCoin = signCoin;
    }

    public String getKdmServerAddressID() {
        return kdmServerAddressID;
    }

    public void setKdmServerAddressID(String kdmServerAddressID) {
        this.kdmServerAddressID = kdmServerAddressID;
    }

    public Long getPartnerID() {
        return partnerID;
    }

    public void setPartnerID(Long partnerID) {
        this.partnerID = partnerID;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Short getPayType() {
        return payType;
    }

    public void setPayType(Short payType) {
        this.payType = payType;
    }

    public Short getKdmSwitch() {
        return kdmSwitch;
    }

    public void setKdmSwitch(Short kdmSwitch) {
        this.kdmSwitch = kdmSwitch;
    }

    public String getLicenseProviderCode() {
        return licenseProviderCode;
    }

    public void setLicenseProviderCode(String licenseProviderCode) {
        this.licenseProviderCode = licenseProviderCode;
    }

    public Short getUseSdcard() {
        return useSdcard;
    }

    public void setUseSdcard(Short useSdcard) {
        this.useSdcard = useSdcard;
    }

}
