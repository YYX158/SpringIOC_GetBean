/*
 Navicat Premium Data Transfer

 Source Server         : localhost
 Source Server Type    : MySQL
 Source Server Version : 80029
 Source Host           : localhost:3306
 Source Schema         : jdbc

 Target Server Type    : MySQL
 Target Server Version : 80029
 File Encoding         : 65001

 Date: 15/08/2022 20:08:28
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for department
-- ----------------------------
DROP TABLE IF EXISTS `department`;
CREATE TABLE `department`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `department_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 6 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of department
-- ----------------------------
INSERT INTO `department` VALUES (1, 'AA');
INSERT INTO `department` VALUES (2, 'BB');
INSERT INTO `department` VALUES (3, 'AA');
INSERT INTO `department` VALUES (4, 'CC');
INSERT INTO `department` VALUES (5, 'CC');
INSERT INTO `department` VALUES (6, 'EE');

-- ----------------------------
-- Table structure for dept
-- ----------------------------
DROP TABLE IF EXISTS `dept`;
CREATE TABLE `dept`  (
  `d_id` int NOT NULL AUTO_INCREMENT,
  `dept_name` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`d_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of dept
-- ----------------------------
INSERT INTO `dept` VALUES (1, 'A');
INSERT INTO `dept` VALUES (2, 'B');
INSERT INTO `dept` VALUES (3, 'C');
INSERT INTO `dept` VALUES (4, 'D');
INSERT INTO `dept` VALUES (5, 'E');

-- ----------------------------
-- Table structure for emplyee
-- ----------------------------
DROP TABLE IF EXISTS `emplyee`;
CREATE TABLE `emplyee`  (
  `id` int NOT NULL AUTO_INCREMENT,
  `lastName` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `gender` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `d_id` int NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of emplyee
-- ----------------------------
INSERT INTO `emplyee` VALUES (1, '??????', 'zhangsan@qq.com', '???', 1);
INSERT INTO `emplyee` VALUES (2, '??????', 'lisi@qq.com', '???', 1);
INSERT INTO `emplyee` VALUES (3, '??????', 'wangming@qq.com', '???', 1);

-- ----------------------------
-- Table structure for mbg
-- ----------------------------
DROP TABLE IF EXISTS `mbg`;
CREATE TABLE `mbg`  (
  `eid` int NOT NULL AUTO_INCREMENT,
  `ename` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` int NULL DEFAULT NULL,
  `sex` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `address` varchar(255) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`eid`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of mbg
-- ----------------------------

-- ----------------------------
-- Table structure for stu
-- ----------------------------
DROP TABLE IF EXISTS `stu`;
CREATE TABLE `stu`  (
  `id` int NOT NULL,
  `name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of stu
-- ----------------------------
INSERT INTO `stu` VALUES (1, '??????');

-- ----------------------------
-- Table structure for t_book
-- ----------------------------
DROP TABLE IF EXISTS `t_book`;
CREATE TABLE `t_book`  (
  `book_id` int NOT NULL AUTO_INCREMENT COMMENT '????????????',
  `book_name` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '????????????',
  `price` int NULL DEFAULT NULL COMMENT '??????',
  `stock` int NULL DEFAULT NULL COMMENT '??????',
  PRIMARY KEY (`book_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_book
-- ----------------------------
INSERT INTO `t_book` VALUES (1, '????????????', 80, 99);
INSERT INTO `t_book` VALUES (2, '????????????', 50, 100);

-- ----------------------------
-- Table structure for t_emp
-- ----------------------------
DROP TABLE IF EXISTS `t_emp`;
CREATE TABLE `t_emp`  (
  `emp_id` int NOT NULL AUTO_INCREMENT,
  `emp_name` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` int NULL DEFAULT NULL,
  `sex` varchar(3) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`emp_id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 1003 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_emp
-- ----------------------------
INSERT INTO `t_emp` VALUES (2, '??????', 22, '???', 'wangsai@qq.com');
INSERT INTO `t_emp` VALUES (3, '?????????', 19, '???', 'wangfugui@xinna.com');
INSERT INTO `t_emp` VALUES (5, '??????', 18, '???', 'zhangsan@xinna.com');
INSERT INTO `t_emp` VALUES (12, '123', 23, '???', '123@stu.xujc.com');
INSERT INTO `t_emp` VALUES (13, '456', 35, '???', '456@stu.xujc.com');
INSERT INTO `t_emp` VALUES (14, '789', 15, '???', '789@stu.xujc.com');
INSERT INTO `t_emp` VALUES (15, '012', 85, '???', '012@stu.xujc.com');
INSERT INTO `t_emp` VALUES (16, '345', 89, '???', '345@stu.xujc.com');
INSERT INTO `t_emp` VALUES (1001, 'lyq', 20, '???', 'lyq@stu.xujc.com');
INSERT INTO `t_emp` VALUES (1002, 'yyx', 22, '???', 'yyx@stu.xujc.com');
INSERT INTO `t_emp` VALUES (1003, 'ccy', 22, '???', 'ccy@stu.xujc.com');

-- ----------------------------
-- Table structure for t_user
-- ----------------------------
DROP TABLE IF EXISTS `t_user`;
CREATE TABLE `t_user`  (
  `user_id` int NOT NULL AUTO_INCREMENT COMMENT '??????',
  `username` varchar(20) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '?????????',
  `balance` int UNSIGNED NULL DEFAULT NULL COMMENT '?????????????????????',
  PRIMARY KEY (`user_id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of t_user
-- ----------------------------
INSERT INTO `t_user` VALUES (1, 'admin', 20);

-- ----------------------------
-- Table structure for user
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user`  (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '??????Id',
  `name` varchar(30) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '??????',
  `password` varchar(80) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `age` int NULL DEFAULT NULL COMMENT '??????',
  `gender` varchar(5) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `email` varchar(50) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL COMMENT '??????',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 2 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES (1, 'admin', '123456', 22, '???', 'admin@qq.ocm');
INSERT INTO `user` VALUES (2, 'root', '123', 23, '???', '123@qq.com');

SET FOREIGN_KEY_CHECKS = 1;
