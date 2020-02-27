学习地址：
慕课网 https://www.imooc.com/learn/478

使用的sql
/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 50719
 Source Host           : localhost:3306
 Source Schema         : spring_transaction

 Target Server Type    : MySQL
 Target Server Version : 50719
 File Encoding         : 65001

 Date: 28/02/2020 00:09:26
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for account
-- ----------------------------
DROP TABLE IF EXISTS `account`;
CREATE TABLE `account` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `money` double DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of account
-- ----------------------------
BEGIN;
INSERT INTO `account` VALUES (1, 'aaa', 1000);
INSERT INTO `account` VALUES (2, 'bbb', 1000);
INSERT INTO `account` VALUES (3, 'ccc', 1000);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;



<aop:aspect>与<aop:advisor>的区别
https://www.jianshu.com/p/40f79da0cdef


总结：
Spring 将事务管理分成了两类：
    编程式事务管理：
        手动编写代码进行事务管理（很少使用）
    声明式事务管理：
        基于TransactionProxyFactoryBean（很少使用，很麻烦，需要为每一个进行事务管理的类，配置一个TransactionProxyFactoryBean进行增强）
        基于AspectJ的XML方式（经常使用）
            一旦在XML中配置好之后，类上不需要添加任何东西
        基于注解的方式（经常使用）
            配置简单，需要在业务层类上添加一个 @Transactional 注解

