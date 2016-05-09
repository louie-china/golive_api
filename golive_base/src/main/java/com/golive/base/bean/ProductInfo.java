package com.golive.base.bean;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class ProductInfo {

    @XStreamAsAttribute
    private String id;//产品ID
    @XStreamAsAttribute
    private String name;//产品名称
    @XStreamAsAttribute
    private String price;//产品价格
    @XStreamAsAttribute
    private String beginTime;//生效时间（UTC时间）
    @XStreamAsAttribute
    private String dueTime;//失效时间（UTC时间）
    @XStreamAsAttribute
    private String quantity;//购买数量
    @XStreamAsAttribute
    private String currency;//币种
    @XStreamAsAttribute
    private String promotion;//优惠活动（有活动时，必填）
    @XStreamAsAttribute
    private String cpData;//与product相关的数据，预留参数数据
    @XStreamAsAttribute
    private String contentId;//TCL内容ID，即产品类型为单点时有意义
    @XStreamAsAttribute
    private String cpContentId;//爱奇艺内容ID，产品类型为单点时有意义

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getBeginTime() {
        return beginTime;
    }

    public void setBeginTime(String beginTime) {
        this.beginTime = beginTime;
    }

    public String getDueTime() {
        return dueTime;
    }

    public void setDueTime(String dueTime) {
        this.dueTime = dueTime;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPromotion() {
        return promotion;
    }

    public void setPromotion(String promotion) {
        this.promotion = promotion;
    }

    public String getCpData() {
        return cpData;
    }

    public void setCpData(String cpData) {
        this.cpData = cpData;
    }

    public String getContentId() {
        return contentId;
    }

    public void setContentId(String contentId) {
        this.contentId = contentId;
    }

    public String getCpContentId() {
        return cpContentId;
    }

    public void setCpContentId(String cpContentId) {
        this.cpContentId = cpContentId;
    }

}
