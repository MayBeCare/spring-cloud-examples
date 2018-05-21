package com.client.cn.dao;

import com.client.cn.entity.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author : asus
 * @version : 1.0
 * @Description :
 * @Date : 2018/5/21 13:28
 * @Copyright : Copyright (c) 2018 All Rights Reserved
 */
public interface UserInfoDao extends JpaRepository<UserInfo,Integer> {

    UserInfo findByUserId(int userId);

}
