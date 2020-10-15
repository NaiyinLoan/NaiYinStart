package com.naiyin.loan.entity;

public class User {
    private Long uid;
    private Integer phone;
    private UserBankInformation userBankInformation;
    private UserBasicInformation userBasicInformation;
    private UserWorkInformation userWorkInformation;
    private App app;
    private OrderApp orderApp;

    public Long getUid() {
        return uid;
    }

    public void setUid(Long uid) {
        this.uid = uid;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public UserBankInformation getUserBankInformation() {
        return userBankInformation;
    }

    public void setUserBankInformation(UserBankInformation userBankInformation) {
        this.userBankInformation = userBankInformation;
    }

    public UserBasicInformation getUserBasicInformation() {
        return userBasicInformation;
    }

    public void setUserBasicInformation(UserBasicInformation userBasicInformation) {
        this.userBasicInformation = userBasicInformation;
    }

    public UserWorkInformation getUserWorkInformation() {
        return userWorkInformation;
    }

    public void setUserWorkInformation(UserWorkInformation userWorkInformation) {
        this.userWorkInformation = userWorkInformation;
    }

    public App getApp() {
        return app;
    }

    public void setApp(App app) {
        this.app = app;
    }

    public OrderApp getOrderApp() {
        return orderApp;
    }

    public void setOrderApp(OrderApp orderApp) {
        this.orderApp = orderApp;
    }
}
