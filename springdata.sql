/*
Navicat MySQL Data Transfer

Source Server         : local
Source Server Version : 80013
Source Host           : 127.0.0.1:3306
Source Database       : springdata

Target Server Type    : MYSQL
Target Server Version : 80013
File Encoding         : 65001

Date: 2019-03-14 14:59:02
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `admin`
-- ----------------------------
DROP TABLE IF EXISTS `admin`;
CREATE TABLE `admin` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `account` varchar(32) DEFAULT NULL,
  `password` varchar(32) DEFAULT NULL,
  `sort` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=21 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of admin
-- ----------------------------
INSERT INTO `admin` VALUES ('1', '123456', '123456', '1');
INSERT INTO `admin` VALUES ('2', '111111', '222222', '2');
INSERT INTO `admin` VALUES ('3', '123453', '123456', '3');
INSERT INTO `admin` VALUES ('4', '123454', '123456', '4');
INSERT INTO `admin` VALUES ('5', '123455', '123456', '5');
INSERT INTO `admin` VALUES ('6', '123456', '123456', '6');
INSERT INTO `admin` VALUES ('7', '123457', '123456', '7');
INSERT INTO `admin` VALUES ('8', '123458', '123456', '8');
INSERT INTO `admin` VALUES ('9', '123459', '123456', '9');
INSERT INTO `admin` VALUES ('10', '1234510', '123456', '10');
INSERT INTO `admin` VALUES ('11', '1234511', '123456', '11');
INSERT INTO `admin` VALUES ('12', '1234512', '123456', '12');
INSERT INTO `admin` VALUES ('13', '1234513', '123456', '13');
INSERT INTO `admin` VALUES ('14', '1234514', '123456', '14');
INSERT INTO `admin` VALUES ('15', '1234515', '123456', '15');
INSERT INTO `admin` VALUES ('16', '1234516', '123456', '16');
INSERT INTO `admin` VALUES ('17', '1234517', '123456', '17');
INSERT INTO `admin` VALUES ('18', '1234518', '123456', '18');
INSERT INTO `admin` VALUES ('19', '1234519', '123456', '19');
INSERT INTO `admin` VALUES ('20', '111111', '111111', '2');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(20) NOT NULL,
  `age` int(11) NOT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', 'jxm', '23');
INSERT INTO `user` VALUES ('2', 'test1', '22');
INSERT INTO `user` VALUES ('3', 'test2', '21');
INSERT INTO `user` VALUES ('4', 'test12', '12');
INSERT INTO `user` VALUES ('5', 'chenchen', '26');
INSERT INTO `user` VALUES ('6', 'chenchen', '26');
INSERT INTO `user` VALUES ('7', 'songhui', '27');
