/*
 Navicat Premium Data Transfer

 Source Server         : local
 Source Server Type    : MySQL
 Source Server Version : 50614
 Source Host           : localhost:33061
 Source Schema         : test

 Target Server Type    : MySQL
 Target Server Version : 50614
 File Encoding         : 65001

 Date: 11/05/2021 23:37:40
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for db_test
-- ----------------------------
DROP TABLE IF EXISTS `db_test`;
CREATE TABLE `db_test`  (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `f1` varchar(4) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `f2` varchar(4) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  `f3` varchar(4) CHARACTER SET utf8 COLLATE utf8_general_ci NULL DEFAULT NULL,
  PRIMARY KEY (`id`) USING BTREE
) ENGINE = InnoDB AUTO_INCREMENT = 5 CHARACTER SET = utf8 COLLATE = utf8_general_ci ROW_FORMAT = Compact;

-- ----------------------------
-- Records of db_test
-- ----------------------------
INSERT INTO `db_test` VALUES (1, 'A1', 'A2', 'A3');
INSERT INTO `db_test` VALUES (2, 'B1', 'B2', 'B3');
INSERT INTO `db_test` VALUES (3, 'C1', 'C2', 'C3');
INSERT INTO `db_test` VALUES (4, 'D1', 'D2', 'D3');

SET FOREIGN_KEY_CHECKS = 1;
