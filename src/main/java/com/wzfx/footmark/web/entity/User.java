package com.wzfx.footmark.web.entity;

/**
 * Created by wangweizhen on 2020/11/23.
 */
public class User extends BusinessObject {

    /**
     * 名称
     */
    private String name;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 状态
     */
    private String status;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
