package com.client.cn.dao;

import com.client.cn.entity.UserInfo;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

/**
 * @author : asus
 * @version : 1.0
 * @Description :
 * @Date : 2018/5/21 13:43
 * @Copyright : Copyright (c) 2018 All Rights Reserved
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserInfoDaoTest {

    @Autowired
    private UserInfoDao userInfoDao;

    private Logger logger = LoggerFactory.getLogger(UserInfoDaoTest.class);

    @Test
    public void getList(){
        List<UserInfo> userInfoList = userInfoDao.findAll();
        logger.info("获取到的数据总数为：{}",userInfoList.size());
    }
}