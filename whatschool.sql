/*
 Navicat MySQL Data Transfer

 Source Server         : schooldb
 Source Server Type    : MySQL
 Source Server Version : 80021
 Source Host           : localhost:3306
 Source Schema         : whatschool

 Target Server Type    : MySQL
 Target Server Version : 80021
 File Encoding         : 65001

 Date: 11/09/2020 08:29:26
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for schoolinfo
-- ----------------------------
DROP TABLE IF EXISTS `schoolinfo`;
CREATE TABLE `schoolinfo`  (
  `name` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL,
  `info` varchar(128) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NULL DEFAULT NULL,
  PRIMARY KEY (`name`) USING BTREE
) ENGINE = InnoDB CHARACTER SET = utf8mb4 COLLATE = utf8mb4_0900_ai_ci ROW_FORMAT = Dynamic;

-- ----------------------------
-- Records of schoolinfo
-- ----------------------------
INSERT INTO `schoolinfo` VALUES ('上海实验小学', '在我家旁边');

SET FOREIGN_KEY_CHECKS = 1;
