package com.golive.base.bean;

import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

public class OrderInfo {

    @XStreamAsAttribute
    private String id;//定单ID
    @XStreamAsAttribute
    private String price;//定单价格
    @XStreamAsAttribute
    private String payTime;//支付时间
    @XStreamAsAttribute
    private String currency;//币种
    @XStreamAsAttribute
    private ProductInfo product;//产品

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public ProductInfo getProduct() {
        return product;
    }

    public void setProduct(ProductInfo product) {
        this.product = product;
    }

}
