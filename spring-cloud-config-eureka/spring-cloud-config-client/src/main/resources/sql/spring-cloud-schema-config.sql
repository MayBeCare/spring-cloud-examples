/*
Navicat MySQL Data Transfer

Source Server         : MYSQL
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : spring-cloud-schema-config

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2018-05-21 16:14:41
*/

-- 数据库初始化脚本

-- 创建数据库
CREATE DATABASE spring-cloud-schema-config;
-- 使用数据库
use spring-cloud-schema-config;


SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for user_info
-- ----------------------------
DROP TABLE IF EXISTS `user_info`;
CREATE TABLE `user_info` (
  `user_id` int(3) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(50) NOT NULL,
  `user_age` int(3) NOT NULL,
  PRIMARY KEY (`user_id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user_info
-- ----------------------------
INSERT INTO `user_info` VALUES ('1', 'Aline', '18');
INSERT INTO `user_info` VALUES ('2', 'James', '20');
INSERT INTO `user_info` VALUES ('3', 'Jack', '22');
SET FOREIGN_KEY_CHECKS=1;
