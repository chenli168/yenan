package com.yenan.cn.domain;

public class Role {
    private String userId;

    private String userPhoneNumber;

    private String role;

    public Role(String userId, String userPhoneNumber, String role) {
        this.userId = userId;
        this.userPhoneNumber = userPhoneNumber;
        this.role = role;
    }

    public Role() {
        super();
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getUserPhoneNumber() {
        return userPhoneNumber;
    }

    public void setUserPhoneNumber(String userPhoneNumber) {
        this.userPhoneNumber = userPhoneNumber;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}