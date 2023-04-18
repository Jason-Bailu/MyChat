/*
 Navicat Premium Data Transfer

 Source Server         : mysql
 Source Server Type    : MySQL
 Source Server Version : 80031 (8.0.31)
 Source Host           : localhost:3306
 Source Schema         : chat

 Target Server Type    : MySQL
 Target Server Version : 80031 (8.0.31)
 File Encoding         : 65001

 Date: 10/04/2023 17:09:10
*/

SET NAMES utf8mb4;
SET FOREIGN_KEY_CHECKS = 0;

-- ----------------------------
-- Table structure for chat
-- ----------------------------
DROP TABLE IF EXISTS `chat`;
CREATE TABLE `chat` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键ID',
  `theme` varchar(255) CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '会话主题',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '更新时间',
  `deleted` int NOT NULL DEFAULT '0' COMMENT '逻辑删除',
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of chat
-- ----------------------------
BEGIN;
INSERT INTO `chat` (`id`, `theme`, `create_time`, `update_time`, `deleted`) VALUES (1, '会话 1', '2023-04-05 16:08:58', '2023-04-05 16:08:58', 0);
COMMIT;

-- ----------------------------
-- Table structure for message
-- ----------------------------
DROP TABLE IF EXISTS `message`;
CREATE TABLE `message` (
  `id` bigint NOT NULL AUTO_INCREMENT COMMENT '主键',
  `content` text CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci NOT NULL COMMENT '信息内容',
  `flag` tinyint(1) NOT NULL DEFAULT '0' COMMENT '信息来源',
  `chat_id` bigint NOT NULL COMMENT '会话ID',
  `create_time` datetime NOT NULL COMMENT '创建时间',
  `update_time` datetime NOT NULL COMMENT '更新时间',
  `deleted` int NOT NULL DEFAULT '0' COMMENT '逻辑删除',
  PRIMARY KEY (`id`),
  KEY `chatfk` (`chat_id`),
  CONSTRAINT `chatfk` FOREIGN KEY (`chat_id`) REFERENCES `chat` (`id`) ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=23 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;

-- ----------------------------
-- Records of message
-- ----------------------------
BEGIN;
INSERT INTO `message` (`id`, `content`, `flag`, `chat_id`, `create_time`, `update_time`, `deleted`) VALUES (1, 'test message 1', 0, 1, '2023-04-05 16:08:58', '2023-04-05 16:08:58', 0);
INSERT INTO `message` (`id`, `content`, `flag`, `chat_id`, `create_time`, `update_time`, `deleted`) VALUES (2, 'test message 2', 1, 1, '2023-04-05 16:08:58', '2023-04-05 16:08:58', 0);
INSERT INTO `message` (`id`, `content`, `flag`, `chat_id`, `create_time`, `update_time`, `deleted`) VALUES (3, 'test message 3', 0, 1, '2023-04-05 16:08:58', '2023-04-05 16:08:58', 0);
INSERT INTO `message` (`id`, `content`, `flag`, `chat_id`, `create_time`, `update_time`, `deleted`) VALUES (4, 'test message 4', 1, 1, '2023-04-05 16:08:58', '2023-04-05 16:08:58', 0);
INSERT INTO `message` (`id`, `content`, `flag`, `chat_id`, `create_time`, `update_time`, `deleted`) VALUES (5, 'test message 5', 0, 1, '2023-04-05 16:08:58', '2023-04-05 16:08:58', 0);
INSERT INTO `message` (`id`, `content`, `flag`, `chat_id`, `create_time`, `update_time`, `deleted`) VALUES (6, 'test message 6', 1, 1, '2023-04-05 16:08:58', '2023-04-05 16:08:58', 0);
INSERT INTO `message` (`id`, `content`, `flag`, `chat_id`, `create_time`, `update_time`, `deleted`) VALUES (7, 'test message 7', 0, 1, '2023-04-05 16:08:58', '2023-04-05 16:08:58', 0);
INSERT INTO `message` (`id`, `content`, `flag`, `chat_id`, `create_time`, `update_time`, `deleted`) VALUES (8, 'test message 8', 1, 1, '2023-04-05 16:08:58', '2023-04-05 16:08:58', 0);
INSERT INTO `message` (`id`, `content`, `flag`, `chat_id`, `create_time`, `update_time`, `deleted`) VALUES (9, 'test message 9', 0, 1, '2023-04-05 16:08:58', '2023-04-05 16:08:58', 0);
INSERT INTO `message` (`id`, `content`, `flag`, `chat_id`, `create_time`, `update_time`, `deleted`) VALUES (10, 'test message 10', 1, 1, '2023-04-05 16:08:58', '2023-04-05 16:08:58', 0);
INSERT INTO `message` (`id`, `content`, `flag`, `chat_id`, `create_time`, `update_time`, `deleted`) VALUES (11, 'test message 11', 0, 1, '2023-04-05 16:08:58', '2023-04-05 16:08:58', 0);
INSERT INTO `message` (`id`, `content`, `flag`, `chat_id`, `create_time`, `update_time`, `deleted`) VALUES (12, 'test message 12', 1, 1, '2023-04-05 16:08:58', '2023-04-05 16:08:58', 0);
INSERT INTO `message` (`id`, `content`, `flag`, `chat_id`, `create_time`, `update_time`, `deleted`) VALUES (13, 'test message 13', 0, 1, '2023-04-05 16:08:58', '2023-04-05 16:08:58', 0);
INSERT INTO `message` (`id`, `content`, `flag`, `chat_id`, `create_time`, `update_time`, `deleted`) VALUES (14, 'test message 14', 1, 1, '2023-04-05 16:08:58', '2023-04-05 16:08:58', 0);
INSERT INTO `message` (`id`, `content`, `flag`, `chat_id`, `create_time`, `update_time`, `deleted`) VALUES (15, 'test message 15', 0, 1, '2023-04-05 16:08:58', '2023-04-05 16:08:58', 0);
INSERT INTO `message` (`id`, `content`, `flag`, `chat_id`, `create_time`, `update_time`, `deleted`) VALUES (16, 'test message 16', 1, 1, '2023-04-05 16:08:58', '2023-04-05 16:08:58', 0);
INSERT INTO `message` (`id`, `content`, `flag`, `chat_id`, `create_time`, `update_time`, `deleted`) VALUES (17, 'test message 17', 0, 1, '2023-04-05 16:08:58', '2023-04-05 16:08:58', 0);
INSERT INTO `message` (`id`, `content`, `flag`, `chat_id`, `create_time`, `update_time`, `deleted`) VALUES (18, 'test message 18', 1, 1, '2023-04-05 16:08:58', '2023-04-05 16:08:58', 0);
INSERT INTO `message` (`id`, `content`, `flag`, `chat_id`, `create_time`, `update_time`, `deleted`) VALUES (19, 'test message 19', 0, 1, '2023-04-05 16:08:58', '2023-04-05 16:08:58', 0);
INSERT INTO `message` (`id`, `content`, `flag`, `chat_id`, `create_time`, `update_time`, `deleted`) VALUES (20, 'test message 20', 1, 1, '2023-04-05 16:08:58', '2023-04-05 16:08:58', 0);
COMMIT;

SET FOREIGN_KEY_CHECKS = 1;
