package com.client.cn.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author : asus
 * @version : 1.0
 * @Description :
 * @Date : 2018/5/21 13:29
 * @Copyright : Copyright (c) 2018 All Rights Reserved
 */
@Entity
@Table(name = "user_info")
public class UserInfo {

    @Id
    private Integer userId;

    private String userName;

    private Integer userAge;

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getUserAge() {
        return userAge;
    }

    public void setUserAge(Integer userAge) {
        this.userAge = userAge;
    }
}
