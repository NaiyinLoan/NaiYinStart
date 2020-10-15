package com.naiyin.loan.entity;

import java.util.Set;

public class App {
    private  Long aid;
    private String appName;
    private String appCode;
    private Set<UserLoginApp> userLoginAppSet;

    public Long getAid() {
        return aid;
    }

    public void setAid(Long aid) {
        this.aid = aid;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getAppCode() {
        return appCode;
    }

    public void setAppCode(String appCode) {
        this.appCode = appCode;
    }

    public Set<UserLoginApp> getUserLoginAppSet() {
        return userLoginAppSet;
    }

    public void setUserLoginAppSet(Set<UserLoginApp> userLoginAppSet) {
        this.userLoginAppSet = userLoginAppSet;
    }
}
