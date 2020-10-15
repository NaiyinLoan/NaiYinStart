package com.naiyin.loan.entity;

import java.util.Date;
import java.util.Set;

public class UserLoginApp {
    private Long id;
    private Long loginNumber;
    private Long identyNumber;
    private Date date;
    private App app;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getLoginNumber() {
        return loginNumber;
    }

    public void setLoginNumber(Long loginNumber) {
        this.loginNumber = loginNumber;
    }

    public Long getIdentyNumber() {
        return identyNumber;
    }

    public void setIdentyNumber(Long identyNumber) {
        this.identyNumber = identyNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public App getApp() {
        return app;
    }

    public void setApp(App app) {
        this.app = app;
    }
}
