package com.yenan.cn.domain;

public class Permission {
    private String userId;

    public Permission(String userId) {
        this.userId = userId;
    }

    public Permission() {
        super();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }
}