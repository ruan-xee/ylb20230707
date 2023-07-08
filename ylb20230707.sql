/*
 Navicat Premium Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 80031
 Source Host           : localhost:3306
 Source Schema         : ylb20230707

 Target Server Type    : MySQL
 Target Server Version : 80031
 File Encoding         : 65001

 Date: 07/07/2023 22:21:07
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for b_bid_info
-- ----------------------------
DROP TABLE IF EXISTS `b_bid_info`;
CREATE TABLE `b_bid_info`  (
  `id` int(0) NOT NULL COMMENT '主键',
  `prod_id` int(0) NOT NULL COMMENT '产品id',
  `uid` int(0) NOT NULL COMMENT '用户id',
  `bid_money` decimal(11, 2) NOT NULL COMMENT '购买金额',
  `bid_time` datetime(0) NOT NULL COMMENT '购买时间',
  `bid_status` int(0) NOT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for b_income_record
-- ----------------------------
DROP TABLE IF EXISTS `b_income_record`;
CREATE TABLE `b_income_record`  (
  `id` int(0) NOT NULL COMMENT '主键',
  `uid` int(0) NOT NULL COMMENT '用户id',
  `prod_id` int(0) NOT NULL COMMENT '产品id',
  `bid_id` int(0) NOT NULL COMMENT '投资记录id',
  `bid_money` decimal(11, 2) NOT NULL COMMENT '投资金额',
  `income_date` datetime(0) NOT NULL COMMENT '收益时间',
  `income_money` decimal(11, 2) NOT NULL COMMENT '收益金额',
  `income_status` int(0) NOT NULL COMMENT '收益状态，0未返，1已返',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for b_product_info
-- ----------------------------
DROP TABLE IF EXISTS `b_product_info`;
CREATE TABLE `b_product_info`  (
  `id` int(0) NOT NULL COMMENT '主键',
  `product_name` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '产品名称',
  `rate` decimal(11, 2) NOT NULL COMMENT '产品利率',
  `cycle` int(0) NOT NULL COMMENT '产品期限',
  `release_time` date NOT NULL COMMENT '产品上架时间',
  `product_type` int(0) NOT NULL COMMENT '产品类型，0新手宝，1优选产品，2散标产品',
  `product_no` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '产品编号',
  `product_money` decimal(11, 2) NOT NULL COMMENT '产品金额',
  `left_product_money` decimal(11, 2) NOT NULL COMMENT '产品剩余金额',
  `bid_min_limit` decimal(11, 2) NOT NULL COMMENT '单笔购买下限',
  `bid_max_limit` decimal(11, 2) NOT NULL COMMENT '单笔购买上限',
  `product_status` int(0) NOT NULL COMMENT '产品状态，0未满标，1已满标，2满标已生成收益计划',
  `product_full_time` datetime(0) NULL DEFAULT NULL COMMENT '满标时间',
  `product_desc` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '产品描述',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for b_recharge_record
-- ----------------------------
DROP TABLE IF EXISTS `b_recharge_record`;
CREATE TABLE `b_recharge_record`  (
  `id` int(0) NOT NULL COMMENT '主键',
  `uid` int(0) NOT NULL COMMENT '用户id',
  `recharge_no` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '充值订单号',
  `recharge_status` int(0) NOT NULL COMMENT '充值状态，0充值中，1充值成功，2充值失败',
  `recharge_money` decimal(11, 2) NOT NULL COMMENT '充值金额',
  `recharge_time` datetime(0) NOT NULL COMMENT '充值时间',
  `recharge_desc` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NOT NULL COMMENT '充值描述',
  `channel` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '充值渠道',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for u_finance_account
-- ----------------------------
DROP TABLE IF EXISTS `u_finance_account`;
CREATE TABLE `u_finance_account`  (
  `id` int(0) NOT NULL COMMENT '主键',
  `uid` int(0) NOT NULL COMMENT '用户id',
  `available_money` decimal(11, 2) NOT NULL COMMENT '用户余额',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin COMMENT = '资金表' ROW_FORMAT = Dynamic;

-- ----------------------------
-- Table structure for u_user
-- ----------------------------
DROP TABLE IF EXISTS `u_user`;
CREATE TABLE `u_user`  (
  `id` int(0) NOT NULL COMMENT '主键',
  `phone` varchar(11) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '手机号',
  `login_password` varchar(32) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '登录密码',
  `name` varchar(16) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '真实姓名',
  `id_card` varchar(18) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '身份证',
  `add_time` datetime(0) NULL DEFAULT NULL COMMENT '注册时间',
  `last_login_time` datetime(0) NULL DEFAULT NULL COMMENT '最近登录时间',
  `header_image` varchar(50) CHARACTER SET utf8mb4 COLLATE utf8mb4_bin NULL DEFAULT NULL COMMENT '头像',
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_bin COMMENT = '用户信息表' ROW_FORMAT = Dynamic;

SET FOREIGN_KEY_CHECKS = 1;
