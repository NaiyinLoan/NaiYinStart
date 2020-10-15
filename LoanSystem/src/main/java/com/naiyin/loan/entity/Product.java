package com.naiyin.loan.entity;

import java.util.Date;

public class Product {
    private Integer productSort;//产品顺序
    private String logo;//产品logo
    private String lendInstitutions;//借贷机构
    private String dailyRate;//日利率
    private String quota;//额度
    private String productUrl;//产品链接
    private String moneyModel;//收费模式
    private String shelf;//上架状态
    private Double money;//收费价格
    private Date shelfTime;//上架时间
    private Integer delete;//删除状态, 0删除,1删除

    public Integer getProductSort() {
        return productSort;
    }

    public void setProductSort(Integer productSort) {
        this.productSort = productSort;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public String getLendInstitutions() {
        return lendInstitutions;
    }

    public void setLendInstitutions(String lendInstitutions) {
        this.lendInstitutions = lendInstitutions;
    }

    public String getDailyRate() {
        return dailyRate;
    }

    public void setDailyRate(String dailyRate) {
        this.dailyRate = dailyRate;
    }

    public String getQuota() {
        return quota;
    }

    public void setQuota(String quota) {
        this.quota = quota;
    }

    public String getProductUrl() {
        return productUrl;
    }

    public void setProductUrl(String productUrl) {
        this.productUrl = productUrl;
    }

    public String getMoneyModel() {
        return moneyModel;
    }

    public void setMoneyModel(String moneyModel) {
        this.moneyModel = moneyModel;
    }

    public String getShelf() {
        return shelf;
    }

    public void setShelf(String shelf) {
        this.shelf = shelf;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public Date getShelfTime() {
        return shelfTime;
    }

    public void setShelfTime(Date shelfTime) {
        this.shelfTime = shelfTime;
    }

    public Integer getDelete() {
        return delete;
    }

    public void setDelete(Integer delete) {
        this.delete = delete;
    }
}
