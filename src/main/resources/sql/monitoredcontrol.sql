/*
Navicat MySQL Data Transfer

Source Server         : yx
Source Server Version : 50714
Source Host           : localhost:3306
Source Database       : monitoredcontrol

Target Server Type    : MYSQL
Target Server Version : 50714
File Encoding         : 65001

Date: 2018-04-05 14:45:08
*/

SET FOREIGN_KEY_CHECKS=0;

-- ----------------------------
-- Table structure for `alarmlogging`
-- ----------------------------
DROP TABLE IF EXISTS `alarmlogging`;
CREATE TABLE `alarmlogging` (
  `Ala_no` int(11) NOT NULL AUTO_INCREMENT,
  `Ala_state` varchar(10) DEFAULT NULL,
  `Ala_out_name` varchar(50) DEFAULT NULL,
  `Ala_time` varchar(25) DEFAULT NULL,
  `Ala_type` varchar(10) DEFAULT NULL,
  `Ala_WRW_name` varchar(50) DEFAULT NULL,
  `Ala_WRW_value` float DEFAULT NULL,
  `Ala_upper` float DEFAULT NULL,
  `Ala_lower` float DEFAULT NULL,
  PRIMARY KEY (`Ala_no`)
) ENGINE=InnoDB AUTO_INCREMENT=101 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of alarmlogging
-- ----------------------------
INSERT INTO `alarmlogging` VALUES ('1', '未发送 ', '191# 陈家镇 进口 ', '2017/10/29 2:25:00', '分钟数据超标', 'COD', '100.7', '100', '0');
INSERT INTO `alarmlogging` VALUES ('2', '未发送 ', '191# 陈家镇 进口 ', '2017/10/28 16:25:00', '分钟数据超标', 'COD', '101.6', '100', '0');
INSERT INTO `alarmlogging` VALUES ('3', '未发送 ', '251# 华虹NEC ', '2017/10/29 6:30:00', '分钟数据超标', 'COD', '102.65', '100', '0');
INSERT INTO `alarmlogging` VALUES ('4', '未发送 ', '270# 台积电 ', '2017/10/28 18:40:00', '分钟数据超标', 'COD', '103.049', '100', '0');
INSERT INTO `alarmlogging` VALUES ('5', '未发送 ', '270# 台积电 ', '2017/10/29 8:40:00', '分钟数据超标', 'COD', '106.707', '100', '0');
INSERT INTO `alarmlogging` VALUES ('6', '未发送 ', '191# 陈家镇 进口 ', '2017/10/28 20:25:00', '分钟数据超标', 'COD', '108.3', '100', '0');
INSERT INTO `alarmlogging` VALUES ('7', '未发送 ', '191# 陈家镇 进口 ', '2017/10/28 14:25:00', '分钟数据超标', 'COD', '110.3', '100', '0');
INSERT INTO `alarmlogging` VALUES ('8', '未发送 ', '254# 江南造船 ', '2017/10/28 20:45:00', '分钟数据超标', 'COD', '110.5', '100', '0');
INSERT INTO `alarmlogging` VALUES ('9', '未发送 ', '191# 陈家镇 进口 ', '2017/10/29 0:25:00', '分钟数据超标', 'COD', '111.7', '100', '0');
INSERT INTO `alarmlogging` VALUES ('10', '未发送 ', '254# 江南造船 ', '2017/10/28 22:45:00', '分钟数据超标', 'COD', '111.8', '100', '0');
INSERT INTO `alarmlogging` VALUES ('11', '未发送 ', '254# 江南造船 ', '2017/10/29 0:45:00', '分钟数据超标', 'COD', '112', '100', '0');
INSERT INTO `alarmlogging` VALUES ('12', '未发送 ', '263# 振华重工 ', '2017/10/29 6:25:00', '分钟数据超标', 'COD', '112.3', '100', '0');
INSERT INTO `alarmlogging` VALUES ('13', '未发送 ', '191# 陈家镇 进口 ', '2017/10/28 22:25:00', '分钟数据超标', 'COD', '112.8', '100', '0');
INSERT INTO `alarmlogging` VALUES ('14', '未发送 ', '270# 台积电 ', '2017/10/28 16:40:00', '分钟数据超标', 'COD', '113.415', '100', '0');
INSERT INTO `alarmlogging` VALUES ('15', '未发送 ', '254# 江南造船 ', '2017/10/29 6:45:00', '分钟数据超标', 'COD', '115.2', '100', '0');
INSERT INTO `alarmlogging` VALUES ('16', '未发送 ', '254# 江南造船 ', '2017/10/29 8:45:00', '分钟数据超标', 'COD', '115.3', '100', '0');
INSERT INTO `alarmlogging` VALUES ('17', '未发送 ', '263# 振华重工 ', '2017/10/29 4:25:00', '分钟数据超标', 'COD', '120', '100', '0');
INSERT INTO `alarmlogging` VALUES ('18', '未发送 ', '254# 江南造船 ', '2017/10/29 2:45:00', '分钟数据超标', 'COD', '121.1', '100', '0');
INSERT INTO `alarmlogging` VALUES ('19', '未发送 ', '263# 振华重工 ', '2017/10/29 2:25:00', '分钟数据超标', 'COD', '124.5', '100', '0');
INSERT INTO `alarmlogging` VALUES ('20', '未发送 ', '280# 嘉定再生 总排口 ', '2017/10/28 20:35:00', '分钟数据超标', 'COD', '126.584', '100', '0');
INSERT INTO `alarmlogging` VALUES ('21', '未发送 ', '276# 天马再生能源 ', '2017/10/28 12:35:00', '分钟数据超标', 'COD', '129.1', '100', '0');
INSERT INTO `alarmlogging` VALUES ('22', '未发送 ', '276# 天马再生能源 ', '2017/10/28 12:30:00', '分钟数据超标', 'COD', '129.455', '100', '0');
INSERT INTO `alarmlogging` VALUES ('23', '未发送 ', '280# 嘉定再生 总排口 ', '2017/10/28 8:40:00', '分钟数据超标', 'COD', '129.8', '100', '0');
INSERT INTO `alarmlogging` VALUES ('24', '未发送 ', '276# 天马再生能源 ', '2017/10/28 10:35:00', '分钟数据超标', 'COD', '130.6', '100', '0');
INSERT INTO `alarmlogging` VALUES ('25', '未发送 ', '276# 天马再生能源 ', '2017/10/28 10:30:00', '分钟数据超标', 'COD', '130.753', '100', '0');
INSERT INTO `alarmlogging` VALUES ('26', '未发送 ', '276# 天马再生能源 ', '2017/10/29 0:35:00', '分钟数据超标', 'COD', '130.9', '100', '0');
INSERT INTO `alarmlogging` VALUES ('27', '未发送 ', '276# 天马再生能源 ', '2017/10/28 20:35:00', '分钟数据超标', 'COD', '130.9', '100', '0');
INSERT INTO `alarmlogging` VALUES ('28', '未发送 ', '276# 天马再生能源 ', '2017/10/29 0:30:00', '分钟数据超标', 'COD', '130.995', '100', '0');
INSERT INTO `alarmlogging` VALUES ('29', '未发送 ', '276# 天马再生能源 ', '2017/10/28 22:30:00', '分钟数据超标', 'COD', '131.242', '100', '0');
INSERT INTO `alarmlogging` VALUES ('30', '未发送 ', '276# 天马再生能源 ', '2017/10/28 22:35:00', '分钟数据超标', 'COD', '131.3', '100', '0');
INSERT INTO `alarmlogging` VALUES ('31', '未发送 ', '276# 天马再生能源 ', '2017/10/28 8:35:00', '分钟数据超标', 'COD', '131.3', '100', '0');
INSERT INTO `alarmlogging` VALUES ('32', '未发送 ', '276# 天马再生能源 ', '2017/10/28 8:30:00', '分钟数据超标', 'COD', '131.322', '100', '0');
INSERT INTO `alarmlogging` VALUES ('33', '未发送 ', '276# 天马再生能源 ', '2017/10/28 20:30:00', '分钟数据超标', 'COD', '131.424', '100', '0');
INSERT INTO `alarmlogging` VALUES ('34', '未发送 ', '276# 天马再生能源 ', '2017/10/28 16:30:00', '分钟数据超标', 'COD', '132.529', '100', '0');
INSERT INTO `alarmlogging` VALUES ('35', '未发送 ', '276# 天马再生能源 ', '2017/10/29 6:35:00', '分钟数据超标', 'COD', '132.9', '100', '0');
INSERT INTO `alarmlogging` VALUES ('36', '未发送 ', '276# 天马再生能源 ', '2017/10/28 16:35:00', '分钟数据超标', 'COD', '133.2', '100', '0');
INSERT INTO `alarmlogging` VALUES ('37', '未发送 ', '276# 天马再生能源 ', '2017/10/29 6:30:00', '分钟数据超标', 'COD', '133.205', '100', '0');
INSERT INTO `alarmlogging` VALUES ('38', '未发送 ', '276# 天马再生能源 ', '2017/10/28 18:30:00', '分钟数据超标', 'COD', '133.285', '100', '0');
INSERT INTO `alarmlogging` VALUES ('39', '未发送 ', '276# 天马再生能源 ', '2017/10/28 18:35:00', '分钟数据超标', 'COD', '133.3', '100', '0');
INSERT INTO `alarmlogging` VALUES ('40', '未发送 ', '276# 天马再生能源 ', '2017/10/29 8:30:00', '分钟数据超标', 'COD', '133.336', '100', '0');
INSERT INTO `alarmlogging` VALUES ('41', '未发送 ', '276# 天马再生能源 ', '2017/10/29 8:35:00', '分钟数据超标', 'COD', '133.5', '100', '0');
INSERT INTO `alarmlogging` VALUES ('42', '未发送 ', '263# 振华重工 ', '2017/10/29 0:25:00', '分钟数据超标', 'COD', '134.1', '100', '0');
INSERT INTO `alarmlogging` VALUES ('43', '未发送 ', '276# 天马再生能源 ', '2017/10/29 4:30:00', '分钟数据超标', 'COD', '134.851', '100', '0');
INSERT INTO `alarmlogging` VALUES ('44', '未发送 ', '276# 天马再生能源 ', '2017/10/29 4:35:00', '分钟数据超标', 'COD', '135', '100', '0');
INSERT INTO `alarmlogging` VALUES ('45', '未发送 ', '08C# 白龙港 进口2 ', '2017/10/28 12:30:00', '分钟数据超标', 'COD', '136.197', '100', '0');
INSERT INTO `alarmlogging` VALUES ('46', '未发送 ', '254# 江南造船 ', '2017/10/28 8:45:00', '分钟数据超标', 'COD', '143.9', '100', '0');
INSERT INTO `alarmlogging` VALUES ('47', '未发送 ', '254# 江南造船 ', '2017/10/28 16:45:00', '分钟数据超标', 'COD', '147.7', '100', '0');
INSERT INTO `alarmlogging` VALUES ('48', '未发送 ', '263# 振华重工 ', '2017/10/29 8:25:00', '分钟数据超标', 'COD', '151.3', '100', '0');
INSERT INTO `alarmlogging` VALUES ('49', '未发送 ', '263# 振华重工 ', '2017/10/28 8:25:00', '分钟数据超标', 'COD', '152.6', '100', '0');
INSERT INTO `alarmlogging` VALUES ('50', '未发送 ', '263# 振华重工 ', '2017/10/28 22:25:00', '分钟数据超标', 'COD', '163.1', '100', '0');
INSERT INTO `alarmlogging` VALUES ('51', '未发送 ', '254# 江南造船 ', '2017/10/28 10:45:00', '分钟数据超标', 'COD', '165.8', '100', '0');
INSERT INTO `alarmlogging` VALUES ('52', '未发送 ', '280# 嘉定再生 总排口 ', '2017/10/28 20:40:00', '分钟数据超标', 'COD', '167.9', '100', '0');
INSERT INTO `alarmlogging` VALUES ('53', '未发送 ', '263# 振华重工 ', '2017/10/28 10:25:00', '分钟数据超标', 'COD', '170.6', '100', '0');
INSERT INTO `alarmlogging` VALUES ('54', '未发送 ', '08C# 白龙港 进口2 ', '2017/10/28 21:35:00', '分钟数据超标', 'COD', '174.32', '100', '0');
INSERT INTO `alarmlogging` VALUES ('55', '未发送 ', '254# 江南造船 ', '2017/10/28 18:45:00', '分钟数据超标', 'COD', '174.4', '100', '0');
INSERT INTO `alarmlogging` VALUES ('56', '未发送 ', '280# 嘉定再生 总排口 ', '2017/10/28 22:35:00', '分钟数据超标', 'COD', '183.63', '100', '0');
INSERT INTO `alarmlogging` VALUES ('57', '未发送 ', '08C# 白龙港 进口2 ', '2017/10/28 20:40:00', '分钟数据超标', 'COD', '184.041', '100', '0');
INSERT INTO `alarmlogging` VALUES ('58', '未发送 ', '263# 振华重工 ', '2017/10/28 15:15:00', '分钟数据超标', 'COD', '186.2', '100', '0');
INSERT INTO `alarmlogging` VALUES ('59', '未发送 ', '08C# 白龙港 进口2 ', '2017/10/28 19:35:00', '分钟数据超标', 'COD', '196.646', '100', '0');
INSERT INTO `alarmlogging` VALUES ('60', '未发送 ', '097# 龙华厂排口1 ', '2017/10/28 14:10:00', '分钟数据超标', 'TN', '20.2', '20', '0');
INSERT INTO `alarmlogging` VALUES ('61', '未发送 ', '098# 龙华厂排口2 ', '2017/10/28 9:10:00', '分钟数据超标', 'TN', '20.31', '20', '0');
INSERT INTO `alarmlogging` VALUES ('62', '未发送 ', '098# 龙华厂排口2 ', '2017/10/29 7:05:00', '分钟数据超标', 'TN', '20.51', '20', '0');
INSERT INTO `alarmlogging` VALUES ('63', '未发送 ', '280# 嘉定再生 总排口 ', '2017/10/29 5:15:00', '分钟数据超标', 'COD', '201.8', '100', '0');
INSERT INTO `alarmlogging` VALUES ('64', '未发送 ', '08C# 白龙港 进口2 ', '2017/10/28 17:35:00', '分钟数据超标', 'COD', '202.835', '100', '0');
INSERT INTO `alarmlogging` VALUES ('65', '未发送 ', '280# 嘉定再生 总排口 ', '2017/10/28 22:40:00', '分钟数据超标', 'COD', '204.2', '100', '0');
INSERT INTO `alarmlogging` VALUES ('66', '未发送 ', '263# 振华重工 ', '2017/10/28 20:25:00', '分钟数据超标', 'COD', '204.4', '100', '0');
INSERT INTO `alarmlogging` VALUES ('67', '未发送 ', '263# 振华重工 ', '2017/10/28 12:25:00', '分钟数据超标', 'COD', '206.6', '100', '0');
INSERT INTO `alarmlogging` VALUES ('68', '未发送 ', '08C# 白龙港 进口2 ', '2017/10/28 18:30:00', '分钟数据超标', 'COD', '206.899', '100', '0');
INSERT INTO `alarmlogging` VALUES ('69', '未发送 ', '098# 龙华厂排口2 ', '2017/10/29 1:05:00', '分钟数据超标', 'TN', '21', '20', '0');
INSERT INTO `alarmlogging` VALUES ('70', '未发送 ', '098# 龙华厂排口2 ', '2017/10/29 5:05:00', '分钟数据超标', 'TN', '21.13', '20', '0');
INSERT INTO `alarmlogging` VALUES ('71', '未发送 ', '098# 龙华厂排口2 ', '2017/10/28 21:05:00', '分钟数据超标', 'TN', '21.36', '20', '0');
INSERT INTO `alarmlogging` VALUES ('72', '未发送 ', '097# 龙华厂排口1 ', '2017/10/28 18:05:00', '分钟数据超标', 'TN', '21.46', '20', '0');
INSERT INTO `alarmlogging` VALUES ('73', '未发送 ', '082# 枫泾厂排口 ', '2017/10/29 6:50:00', '分钟数据超标', 'TN', '21.64', '20', '0');
INSERT INTO `alarmlogging` VALUES ('74', '未发送 ', '097# 龙华厂排口1 ', '2017/10/28 16:05:00', '分钟数据超标', 'TN', '21.84', '20', '0');
INSERT INTO `alarmlogging` VALUES ('75', '未发送 ', '263# 振华重工 ', '2017/10/28 14:25:00', '分钟数据超标', 'COD', '210.4', '100', '0');
INSERT INTO `alarmlogging` VALUES ('76', '未发送 ', '280# 嘉定再生 总排口 ', '2017/10/29 5:10:00', '分钟数据超标', 'COD', '211.21', '100', '0');
INSERT INTO `alarmlogging` VALUES ('77', '未发送 ', '08C# 白龙港 进口2 ', '2017/10/28 22:50:00', '分钟数据超标', 'COD', '215.275', '100', '0');
INSERT INTO `alarmlogging` VALUES ('78', '未发送 ', '097# 龙华厂排口1 ', '2017/10/28 8:10:00', '分钟数据超标', 'TN', '22.45', '20', '0');
INSERT INTO `alarmlogging` VALUES ('79', '未发送 ', '098# 龙华厂排口2 ', '2017/10/28 23:10:00', '分钟数据超标', 'TN', '22.54', '20', '0');
INSERT INTO `alarmlogging` VALUES ('80', '未发送 ', '097# 龙华厂排口1 ', '2017/10/28 14:05:00', '分钟数据超标', 'TN', '22.57', '20', '0');
INSERT INTO `alarmlogging` VALUES ('81', '未发送 ', '097# 龙华厂排口1 ', '2017/10/29 2:05:00', '分钟数据超标', 'TN', '22.72', '20', '0');
INSERT INTO `alarmlogging` VALUES ('82', '未发送 ', '097# 龙华厂排口1 ', '2017/10/28 8:05:00', '分钟数据超标', 'TN', '22.89', '20', '0');
INSERT INTO `alarmlogging` VALUES ('83', '未发送 ', '254# 江南造船 ', '2017/10/28 12:45:00', '分钟数据超标', 'COD', '222.8', '100', '0');
INSERT INTO `alarmlogging` VALUES ('84', '未发送 ', '235# 金山二污 进口 ', '2017/10/29 8:15:00', '分钟数据超标', 'COD', '224', '100', '0');
INSERT INTO `alarmlogging` VALUES ('85', '未发送 ', '08C# 白龙港 进口2 ', '2017/10/28 13:35:00', '分钟数据超标', 'COD', '224.068', '100', '0');
INSERT INTO `alarmlogging` VALUES ('86', '未发送 ', '280# 嘉定再生 总排口 ', '2017/10/29 1:10:00', '分钟数据超标', 'COD', '225.32', '100', '0');
INSERT INTO `alarmlogging` VALUES ('87', '未发送 ', '08C# 白龙港 进口2 ', '2017/10/29 1:00:00', '分钟数据超标', 'COD', '225.617', '100', '0');
INSERT INTO `alarmlogging` VALUES ('88', '未发送 ', '235# 金山二污 进口 ', '2017/10/29 6:15:00', '分钟数据超标', 'COD', '229.9', '100', '0');
INSERT INTO `alarmlogging` VALUES ('89', '未发送 ', '08C# 白龙港 进口2 ', '2017/10/28 19:10:00', '分钟数据超标', 'TN', '23.06', '20', '0');
INSERT INTO `alarmlogging` VALUES ('90', '未发送 ', '097# 龙华厂排口1 ', '2017/10/29 0:05:00', '分钟数据超标', 'TN', '23.07', '20', '0');
INSERT INTO `alarmlogging` VALUES ('91', '未发送 ', '098# 龙华厂排口2 ', '2017/10/29 5:10:00', '分钟数据超标', 'TN', '23.13', '20', '0');
INSERT INTO `alarmlogging` VALUES ('92', '未发送 ', '098# 龙华厂排口2 ', '2017/10/28 13:05:00', '分钟数据超标', 'TN', '23.13', '20', '0');
INSERT INTO `alarmlogging` VALUES ('93', '未发送 ', '098# 龙华厂排口2 ', '2017/10/28 23:05:00', '分钟数据超标', 'TN', '23.29', '20', '0');
INSERT INTO `alarmlogging` VALUES ('94', '未发送 ', '097# 龙华厂排口1 ', '2017/10/28 16:10:00', '分钟数据超标', 'TN', '23.48', '20', '0');
INSERT INTO `alarmlogging` VALUES ('95', '未发送 ', '098# 龙华厂排口2 ', '2017/10/28 11:05:00', '分钟数据超标', 'TN', '23.68', '20', '0');
INSERT INTO `alarmlogging` VALUES ('96', '未发送 ', '254# 江南造船 ', '2017/10/28 14:45:00', '分钟数据超标', 'COD', '231.3', '100', '0');
INSERT INTO `alarmlogging` VALUES ('97', '未发送 ', '08C# 白龙港 进口2 ', '2017/10/29 7:30:00', '分钟数据超标', 'COD', '239.868', '100', '0');
INSERT INTO `alarmlogging` VALUES ('98', '未发送 ', '098# 龙华厂排口2 ', '2017/10/28 21:10:00', '分钟数据超标', 'TN', '24.05', '20', '0');
INSERT INTO `alarmlogging` VALUES ('99', '未发送 ', '097# 龙华厂排口1 ', '2017/10/29 8:10:00', '分钟数据超标', 'TN', '24.2', '20', '0');
INSERT INTO `alarmlogging` VALUES ('100', '未发送 ', '08C# 白龙港 进口2 ', '2017/10/28 21:10:00', '分钟数据超标', 'TN', '24.43', '20', null);

-- ----------------------------
-- Table structure for `alarmregular`
-- ----------------------------
DROP TABLE IF EXISTS `alarmregular`;
CREATE TABLE `alarmregular` (
  `AR_no` int(11) NOT NULL AUTO_INCREMENT,
  `AR_area` varchar(5) DEFAULT NULL,
  `Ent_name` varchar(50) DEFAULT NULL,
  `AR_out_name` varchar(20) DEFAULT NULL,
  `AR_WRW` varchar(10) DEFAULT NULL,
  `AR_standard_value` varchar(10) DEFAULT NULL,
  `AR_standard_no` varchar(15) DEFAULT NULL,
  PRIMARY KEY (`AR_no`)
) ENGINE=InnoDB AUTO_INCREMENT=118 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of alarmregular
-- ----------------------------
INSERT INTO `alarmregular` VALUES ('1', '宝山区', '宝山钢铁股份有限公司', '025# 冷铬1420', 'pH', '6.00-9.00', 'DB31/199-2002');
INSERT INTO `alarmregular` VALUES ('2', '宝山区', '宝山钢铁股份有限公司', '025# 冷铬1420', 'TOC', '30', 'DB31/199-2002');
INSERT INTO `alarmregular` VALUES ('3', '宝山区', '宝山钢铁股份有限公司', '026# 宝钢酚氢', 'pH', '6.00-9.00', 'DB31/199-2002');
INSERT INTO `alarmregular` VALUES ('4', '宝山区', '宝山钢铁股份有限公司', '026# 宝钢酚氢', 'TOC', '30', 'DB31/199-2002');
INSERT INTO `alarmregular` VALUES ('5', '宝山区', '宝山钢铁股份有限公司', '027# 宝钢三期', 'pH', '6.00-9.00', 'DB31/199-2002');
INSERT INTO `alarmregular` VALUES ('6', '宝山区', '宝山钢铁股份有限公司', '027# 宝钢三期', 'TOC', '30', 'DB31/199-2002');
INSERT INTO `alarmregular` VALUES ('7', '宝山区', '宝山钢铁股份有限公司', '028# 宝钢电厂', 'pH', '6.00-9.00', 'DB31/199-2002');
INSERT INTO `alarmregular` VALUES ('8', '宝山区', '宝山钢铁股份有限公司', '028# 宝钢电厂', 'TOC', '30', 'DB31/199-2002');
INSERT INTO `alarmregular` VALUES ('9', '宝山区', '宝山钢铁股份有限公司', '029# 宝钢含油', 'pH', '6.00-9.00', 'DB31/199-2002');
INSERT INTO `alarmregular` VALUES ('10', '宝山区', '宝山钢铁股份有限公司', '029# 宝钢含油', 'TOC', '30', 'DB31/199-2002');
INSERT INTO `alarmregular` VALUES ('11', '宝山区', '宝山钢铁股份有限公司', '030# 宝钢磷化', 'pH', '6.00-9.00', 'DB31/199-2002');
INSERT INTO `alarmregular` VALUES ('12', '宝山区', '宝山钢铁股份有限公司', '030# 宝钢磷化', 'TOC', '30', 'DB31/199-2002');
INSERT INTO `alarmregular` VALUES ('13', '金山区', '上海金山枫泾水质净化有限公司', '081# 枫泾厂进口', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('14', '金山区', '上海金山枫泾水质净化有限公司', '082# 枫泾厂排口', 'pH', '6.00-9.00', '一级B');
INSERT INTO `alarmregular` VALUES ('15', '金山区', '上海金山枫泾水质净化有限公司', '082# 枫泾厂排口', 'COD', '60', '一级B');
INSERT INTO `alarmregular` VALUES ('16', '金山区', '上海金山枫泾水质净化有限公司', '082# 枫泾厂排口', '氨氮', '15', '一级B');
INSERT INTO `alarmregular` VALUES ('17', '金山区', '上海金山枫泾水质净化有限公司', '082# 枫泾厂排口', 'TP', '1', '一级B');
INSERT INTO `alarmregular` VALUES ('18', '金山区', '上海金兴水处理工程有限公司', '083# 兴塔厂进口', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('19', '金山区', '上海金兴水处理工程有限公司', '084# 兴塔厂排口', 'COD', '60', '一级B');
INSERT INTO `alarmregular` VALUES ('20', '金山区', '上海金兴水处理工程有限公司', '084# 兴塔厂排口', '氨氮', '15', '一级B');
INSERT INTO `alarmregular` VALUES ('21', '金山区', '上海金兴水处理工程有限公司', '084# 兴塔厂排口', 'TN', '20', '一级B');
INSERT INTO `alarmregular` VALUES ('22', '浦东区', '上海城投污水处理有限公司白龙港污水处理厂', '085# 白龙港厂进口', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('23', '浦东区', '上海临港供排水发展有限公司', '089# 临港厂进口', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('24', '徐汇区', '上海市阳晨排水运营有限公司长桥水质净化厂', '091# 长桥厂进口', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('25', '徐汇区', '上海市阳晨排水运营有限公司长桥水质净化厂', '092# 长桥厂排口', 'pH', '6.00-9.00', '一级B');
INSERT INTO `alarmregular` VALUES ('26', '徐汇区', '上海市阳晨排水运营有限公司长桥水质净化厂', '092# 长桥厂排口', 'COD', '60', '一级B');
INSERT INTO `alarmregular` VALUES ('27', '徐汇区', '上海市阳晨排水运营有限公司长桥水质净化厂', '092# 长桥厂排口', '氨氮', '15', '一级B');
INSERT INTO `alarmregular` VALUES ('28', '闵行区', '上海市阳晨排水运营有限公司闵行水质净化厂', '093# 闵行厂进口1', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('29', '闵行区', '上海市阳晨排水运营有限公司闵行水质净化厂', '094# 闵行厂进口2', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('30', '闵行区', '上海市阳晨排水运营有限公司闵行水质净化厂', '095# 闵行厂排口', 'pH', '6.00-9.00', '一级B');
INSERT INTO `alarmregular` VALUES ('31', '闵行区', '上海市阳晨排水运营有限公司闵行水质净化厂', '095# 闵行厂排口', 'COD', '60', '一级B');
INSERT INTO `alarmregular` VALUES ('32', '闵行区', '上海市阳晨排水运营有限公司闵行水质净化厂', '095# 闵行厂排口', '氨氮', '15', '一级B');
INSERT INTO `alarmregular` VALUES ('33', '徐汇区', '上海市阳晨排水运营有限公司龙华水质净化厂', '096# 龙华厂进口', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('34', '徐汇区', '上海市阳晨排水运营有限公司龙华水质净化厂', '097# 龙华厂排口1', 'pH', '6.00-9.00', '一级B');
INSERT INTO `alarmregular` VALUES ('35', '徐汇区', '上海市阳晨排水运营有限公司龙华水质净化厂', '097# 龙华厂排口1', 'COD', '60', '一级B');
INSERT INTO `alarmregular` VALUES ('36', '徐汇区', '上海市阳晨排水运营有限公司龙华水质净化厂', '097# 龙华厂排口1', '氨氮', '15', '一级B');
INSERT INTO `alarmregular` VALUES ('37', '徐汇区', '上海市阳晨排水运营有限公司龙华水质净化厂', '098# 龙华厂排口2', 'pH', '6.00-9.00', '一级B');
INSERT INTO `alarmregular` VALUES ('38', '徐汇区', '上海市阳晨排水运营有限公司龙华水质净化厂', '098# 龙华厂排口2', 'COD', '60', '一级B');
INSERT INTO `alarmregular` VALUES ('39', '嘉定区', '上海安亭污水处理有限公司', '120# 安亭厂排口2', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('40', '嘉定区', '上海安亭污水处理有限公司', '120# 安亭厂排口2', 'TN', '20', '二级');
INSERT INTO `alarmregular` VALUES ('41', '嘉定区', '上海大众嘉定污水处理有限公司', '121# 大众嘉定厂进口', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('42', '嘉定区', '上海大众嘉定污水处理有限公司', '122# 大众嘉定厂排口', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('43', '嘉定区', '上海安亭污水处理有限公司', '123# 安亭厂进口1', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('44', '嘉定区', '上海安亭污水处理有限公司', '124# 安亭厂排口1', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('45', '嘉定区', '上海嘉定新城污水处理厂', '125# 嘉定新城北区 进口', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('46', '嘉定区', '上海嘉定新城污水处理厂', '126# 嘉定新城北区 排口', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('47', '闵行区', '上海闵行污水处理运营有限公司', '127# 莘庄厂进口1', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('48', '闵行区', '上海闵行污水处理运营有限公司', '129# 莘庄厂排口1', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('49', '闵行区', '上海闵行污水处理运营有限公司', '130# 莘庄厂排口2', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('50', '金山区', '上海金山排海工程有限公司', '131# 新江厂进口', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('51', '金山区', '上海金山排海工程有限公司', '132# 新江厂排口', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('52', '金山区', '上海枫亭水质净化有限公司', '133# 枫亭厂进口', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('53', '金山区', '上海枫亭水质净化有限公司', '134# 枫亭厂排口', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('54', '金山区', '上海枫亭水质净化有限公司', '134# 枫亭厂排口', 'TN', '20', '二级');
INSERT INTO `alarmregular` VALUES ('55', '金山区', '上海金山廊下污水处理有限公司', '135# 廊下厂进口', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('56', '金山区', '上海金山廊下污水处理有限公司', '136# 廊下厂排口', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('57', '浦东区', '上海海滨污水处理有限公司', '137# 南汇厂进口', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('58', '浦东区', '上海海滨污水处理有限公司', '138# 南汇厂排口', 'COD', '100', '二级');
INSERT INTO `alarmregular` VALUES ('59', '浦东区', '上海海滨污水处理有限公司', '138# 南汇厂排口', '氨氮', '30', '二级');
INSERT INTO `alarmregular` VALUES ('60', '奉贤区', '上海市奉贤区排水运行管理中心', '156# 南桥厂进口', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('61', '奉贤区', '上海市奉贤区排水运行管理中心', '157# 南桥厂排口1', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('62', '奉贤区', '上海市奉贤区排水运行管理中心', '158# 南桥厂排口2', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('63', '奉贤区', '上海市奉贤西部污水处理有限公司', '159# 奉西厂进口', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('64', '奉贤区', '上海市奉贤西部污水处理有限公司', '160# 奉西厂排口1', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('65', '奉贤区', '上海市奉锦环境建设管理有限公司', '161# 奉东厂进口1', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('66', '奉贤区', '上海市奉锦环境建设管理有限公司', '162# 奉东厂排口1', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('67', '奉贤区', '上海市奉贤西部污水处理有限公司', '163# 奉西厂排口2', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('68', '青浦区', '上海青浦污水处理厂', '164# 青浦厂排口2', 'COD', '60', '一级B');
INSERT INTO `alarmregular` VALUES ('69', '青浦区', '上海青浦污水处理厂', '164# 青浦厂排口2', '氨氮', '15', '一级B');
INSERT INTO `alarmregular` VALUES ('70', '青浦区', '上海青浦污水处理厂', '165# 青浦厂进口', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('71', '青浦区', '上海青浦污水处理厂', '166# 青浦厂排口', 'COD', '60', '一级B');
INSERT INTO `alarmregular` VALUES ('72', '青浦区', '上海青浦污水处理厂', '166# 青浦厂排口', '氨氮', '15', '一级B');
INSERT INTO `alarmregular` VALUES ('73', '青浦区', '上海朱家角工业小区污水处理厂', '168# 朱家角工业区厂排口', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('74', '奉贤区', '上海市奉锦环境建设管理有限公司', '169# 奉东厂进口2', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('75', '奉贤区', '上海市奉锦环境建设管理有限公司', '170# 奉东厂排口2', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('76', '青浦区', '商榻污水处理厂', '171# 商榻厂进口', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('77', '青浦区', '商榻污水处理厂', '172# 商榻厂排口', 'COD', '60', '一级B');
INSERT INTO `alarmregular` VALUES ('78', '青浦区', '商榻污水处理厂', '172# 商榻厂排口', '氨氮', '15', '一级B');
INSERT INTO `alarmregular` VALUES ('79', '青浦区', '商榻污水处理厂', '172# 商榻厂排口', 'TN', '20', '一级B');
INSERT INTO `alarmregular` VALUES ('80', '青浦区', '上海青浦第二污水处理厂有限公司', '173# 青浦二厂进口', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('81', '青浦区', '上海青浦第二污水处理厂有限公司', '174# 青浦二厂排口', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('82', '青浦区', '上海青浦第二污水处理厂有限公司', '174# 青浦二厂排口', 'TN', '20', '二级');
INSERT INTO `alarmregular` VALUES ('83', '青浦区', '上海青浦第二污水处理厂有限公司', '175# 青浦二厂排口1', 'COD', '60', '一级B');
INSERT INTO `alarmregular` VALUES ('84', '青浦区', '上海青浦第二污水处理厂有限公司', '175# 青浦二厂排口1', '氨氮', '15', '一级B');
INSERT INTO `alarmregular` VALUES ('85', '青浦区', '上海青浦第二污水处理厂有限公司', '175# 青浦二厂排口1', 'TN', '20', '一级B');
INSERT INTO `alarmregular` VALUES ('86', '青浦区', '上海青浦第二污水处理厂有限公司', '176# 青浦二厂排口2', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('87', '青浦区', '上海青浦第二污水处理厂有限公司', '176# 青浦二厂排口2', 'TN', '20', '二级');
INSERT INTO `alarmregular` VALUES ('88', '青浦区', '上海青浦练塘污水处理厂', '177# 练塘厂进口', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('89', '青浦区', '上海城投徐泾污水处理有限公司', '179# 徐泾厂进口', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('90', '青浦区', '上海城投徐泾污水处理有限公司', '180# 徐泾厂排口', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('91', '青浦区', '上海朱家角污水处理工程建设有限公司', '181# 朱家角厂进口', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('92', '青浦区', '上海朱家角污水处理工程建设有限公司', '182# 朱家角厂排口', 'COD', '60', '一级B');
INSERT INTO `alarmregular` VALUES ('93', '青浦区', '上海朱家角污水处理工程建设有限公司', '182# 朱家角厂排口', '氨氮', '15', '一级B');
INSERT INTO `alarmregular` VALUES ('94', '青浦区', '上海朱家角污水处理工程建设有限公司', '182# 朱家角厂排口', 'TN', '20', '一级B');
INSERT INTO `alarmregular` VALUES ('95', '青浦区', '上海金泽污水处理有限公司西岑污水厂', '183# 西岑厂进口', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('96', '青浦区', '上海金泽污水处理有限公司金泽污水厂', '185# 金泽厂进口', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('97', '青浦区', '上海城投绿衍污水处理有限公司', '187# 华新厂进口', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('98', '青浦区', '上海城投绿衍污水处理有限公司', '188# 华新厂排口', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('99', '青浦区', '青浦白鹤污水处理有限公司', '189# 白鹤厂进口', 'pH', '6.00-9.00', '二级');
INSERT INTO `alarmregular` VALUES ('100', '崇明区', '上海城投城桥污水处理有限公司(陈家镇项目)', '192# 陈家镇厂排口', 'COD', '60', '一级B');
INSERT INTO `alarmregular` VALUES ('101', '崇明区', '上海城投城桥污水处理有限公司(陈家镇项目)', '192# 陈家镇厂排口', '氨氮', '15', '一级B');
INSERT INTO `alarmregular` VALUES ('102', '崇明区', '上海城投城桥污水处理有限公司(陈家镇项目)', '192# 陈家镇厂排口', 'TN', '20', '一级B');
INSERT INTO `alarmregular` VALUES ('103', '崇明区', '上海城投城桥污水处理有限公司(堡镇项目)', '198# 堡镇厂排口', 'TN', '20', '二级');
INSERT INTO `alarmregular` VALUES ('104', '崇明区', '上海城投城桥污水处理有限公司(新河项目)', '200# 新河厂排口', 'COD', '60', '一级B');
INSERT INTO `alarmregular` VALUES ('105', '崇明区', '上海城投城桥污水处理有限公司(新河项目)', '200# 新河厂排口', '氨氮', '15', '一级B');
INSERT INTO `alarmregular` VALUES ('106', '崇明区', '上海城投城桥污水处理有限公司(新河项目)', '200# 新河厂排口', 'TN', '20', '一级B');
INSERT INTO `alarmregular` VALUES ('107', '浦东区', '上海中隆纸业有限公司', '211# 中隆纸业', 'pH', '6.00-9.00', 'DB31/445-2002');
INSERT INTO `alarmregular` VALUES ('108', '浦东区', '上海中隆纸业有限公司', '211# 中隆纸业', 'COD', '500', 'DB31/445-2002');
INSERT INTO `alarmregular` VALUES ('109', '', '未知', '212# 氯碱化工', 'pH', '6.00-9.00', 'DB31/445-2002');
INSERT INTO `alarmregular` VALUES ('110', '', '未知', '212# 氯碱化工', 'COD', '500', 'DB31/445-2002');
INSERT INTO `alarmregular` VALUES ('111', '闵行区', '上海中航光电子有限公司', '213# 中航光电', 'pH', '6.00-9.00', 'DB31/445-2002');
INSERT INTO `alarmregular` VALUES ('112', '闵行区', '上海中航光电子有限公司', '213# 中航光电', 'COD', '500', 'DB31/445-2002');
INSERT INTO `alarmregular` VALUES ('113', '', '未知', '214# 海运船舶', 'pH', '6.00-9.00', 'DB31/199-2002');
INSERT INTO `alarmregular` VALUES ('114', '', '未知', '214# 海运船舶', 'COD', '100', 'DB31/199-2002');
INSERT INTO `alarmregular` VALUES ('115', '', '未知', '215# 天马微电子', 'pH', '6.00-9.00', 'DB31/199-2002');
INSERT INTO `alarmregular` VALUES ('116', '', '未知', '215# 天马微电子', 'COD', '100', 'DB31/199-2002');
INSERT INTO `alarmregular` VALUES ('117', '', '未知', '218# 亚太酿酒', 'pH', '6.00-9.00', 'DB31/199-2002');

-- ----------------------------
-- Table structure for `contacts`
-- ----------------------------
DROP TABLE IF EXISTS `contacts`;
CREATE TABLE `contacts` (
  `Con_Id` int(11) NOT NULL AUTO_INCREMENT,
  `User_Id` int(11) DEFAULT NULL,
  `Con_name` varchar(10) DEFAULT NULL,
  `Con_tel` varchar(15) DEFAULT NULL,
  `Con_mail` varchar(50) DEFAULT NULL,
  `Con_company` varchar(30) DEFAULT NULL,
  `Con_division` varchar(20) DEFAULT NULL,
  `Con_post` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`Con_Id`),
  KEY `FK_have` (`User_Id`),
  CONSTRAINT `FK_have` FOREIGN KEY (`User_Id`) REFERENCES `user` (`User_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=38 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of contacts
-- ----------------------------
INSERT INTO `contacts` VALUES ('9', null, 'qq', 'ww', 'ee', 'rr', 'tt', 'yy');
INSERT INTO `contacts` VALUES ('11', null, '1222', '34', '56', '78', '90', '00');
INSERT INTO `contacts` VALUES ('34', null, 'yx', '45648', '1063959635@qq.com', 'dalian', 'dalian', 'xuesheng');
INSERT INTO `contacts` VALUES ('35', null, 'yangxian', '12498764', '5', '', '', '');
INSERT INTO `contacts` VALUES ('37', null, 'yangxia ', '', '', '', '', '');

-- ----------------------------
-- Table structure for `datamanage`
-- ----------------------------
DROP TABLE IF EXISTS `datamanage`;
CREATE TABLE `datamanage` (
  `Da_no` int(11) NOT NULL AUTO_INCREMENT,
  `Da_area` varchar(20) DEFAULT NULL,
  `Da_out_name` varchar(25) DEFAULT NULL,
  `Da_degree` varchar(5) DEFAULT NULL,
  `Da_last_time` date DEFAULT NULL,
  `Da_state` varchar(1) DEFAULT NULL,
  `Da_data_time` date DEFAULT NULL,
  `Da_COD_TOC` date DEFAULT NULL,
  `Da_PH` float DEFAULT NULL,
  `Da_PH_state` varchar(1) DEFAULT NULL,
  `Da_COD` float DEFAULT NULL,
  `Da_COD_state` varchar(1) DEFAULT NULL,
  `Da_TOC` float DEFAULT NULL,
  `Da_TOC_state` varchar(1) DEFAULT NULL,
  `Da_AD` float DEFAULT NULL,
  `Da_AD_state` varchar(1) DEFAULT NULL,
  `Da_TN` float DEFAULT NULL,
  `Da_TN_state` varchar(1) DEFAULT NULL,
  PRIMARY KEY (`Da_no`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of datamanage
-- ----------------------------

-- ----------------------------
-- Table structure for `enterprise`
-- ----------------------------
DROP TABLE IF EXISTS `enterprise`;
CREATE TABLE `enterprise` (
  `Ent_no` int(11) NOT NULL AUTO_INCREMENT,
  `Env_no` int(11) DEFAULT NULL,
  `Man_no` int(11) DEFAULT NULL,
  `Ent_name` varchar(30) DEFAULT NULL,
  `Ent_short` varchar(10) DEFAULT NULL,
  `Ent_address` varchar(25) DEFAULT NULL,
  `Ent_class` varchar(10) DEFAULT NULL,
  `Ent_register_class` varchar(15) DEFAULT NULL,
  `Ent_FR_no` varchar(5) DEFAULT NULL,
  `Ent_FR_name` varchar(10) DEFAULT NULL,
  `Ent_FR_tel` varchar(15) DEFAULT NULL,
  `Ent_FR_address` varchar(20) DEFAULT NULL,
  `Ent_FR_postalcode` varchar(6) DEFAULT NULL,
  `Ent_latitude` float DEFAULT NULL,
  `Ent_longitude` float DEFAULT NULL,
  `Ent_trade_class` varchar(15) DEFAULT NULL,
  `Ent_sub_relation` varchar(10) DEFAULT NULL,
  `Ent_bank` varchar(20) DEFAULT NULL,
  `Ent_bank_number` varchar(20) DEFAULT NULL,
  `Ent_email` varchar(30) DEFAULT NULL,
  `Ent_web` varchar(50) DEFAULT NULL,
  `Ent_commission_date` varchar(20) DEFAULT NULL,
  `Ent_acreage` float DEFAULT NULL,
  `Ent_street` varchar(20) DEFAULT NULL,
  `Ent_founded_time` varchar(20) DEFAULT NULL,
  `Ent_fund` float DEFAULT NULL,
  `Ent_remark` text,
  PRIMARY KEY (`Ent_no`),
  KEY `FK_Relationship_6` (`Env_no`),
  KEY `FK_Relationship_7` (`Man_no`),
  CONSTRAINT `FK_Relationship_6` FOREIGN KEY (`Env_no`) REFERENCES `environment` (`Env_no`),
  CONSTRAINT `FK_Relationship_7` FOREIGN KEY (`Man_no`) REFERENCES `manage` (`Man_no`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of enterprise
-- ----------------------------
INSERT INTO `enterprise` VALUES ('1', '1', '1', '宝钢不锈钢有限公司', '第一钢铁', '宝山区长江路735号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '宝信 0进1出');
INSERT INTO `enterprise` VALUES ('2', '2', '2', '宝钢特钢有限公司', '五钢特钢', '上海市宝山区水产路1269号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '宝信 0进1出');
INSERT INTO `enterprise` VALUES ('3', '3', '3', '宝山钢铁股份有限公司', '宝钢', '宝山区富锦路885号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '宝信 0进6出');
INSERT INTO `enterprise` VALUES ('4', '4', '4', '留样测试', '留样测试', '', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '');
INSERT INTO `enterprise` VALUES ('5', '5', '5', '上海宝钢（益昌）冷扎薄板厂', '宝钢冷轧薄板', '江杨南路2288号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '宝信 0进1出');
INSERT INTO `enterprise` VALUES ('6', '6', '6', '上海城投污水处理有限公司石洞口污水处理厂', '石洞口污水', '宝山区煤水路200号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '装备 1进1出');
INSERT INTO `enterprise` VALUES ('7', '7', '7', '上海城投污水处理有限公司泗塘污水处理厂', '泗塘水质', '宝山区爱辉路721号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '装备 1进1出');
INSERT INTO `enterprise` VALUES ('8', '8', '8', '上海城投污水处理有限公司吴淞污水处理厂', '吴淞水质', '上海市宝山区海江路1号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '装备 1进1出');
INSERT INTO `enterprise` VALUES ('9', '9', '9', '上海城投污水处理有限公司天山污水处理厂', '天山水质', '上海市长宁区天山路31号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '装备 1进1出');
INSERT INTO `enterprise` VALUES ('10', '10', '10', '上海生物制品研究所有限责任公司', '生物制品', '长宁区  新华街道 安顺路350号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '雷磁 0进1出');
INSERT INTO `enterprise` VALUES ('11', '11', '11', '江南造船（集团）有限责任公司', '江南造船', '上海长兴岛长兴江南大道988号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '摩威 0进1出');
INSERT INTO `enterprise` VALUES ('12', '12', '12', '上海城投城桥污水处理有限公司(堡镇项目)', '堡镇污水', '桃源村江边386号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '装备 1进1出');
INSERT INTO `enterprise` VALUES ('13', '13', '13', '上海城投城桥污水处理有限公司(陈家镇项目)', '陈家镇污水', '崇明县陈家镇镇八滧公路', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '历史');
INSERT INTO `enterprise` VALUES ('14', '14', '14', '上海城投城桥污水处理有限公司(城桥项目)', '城桥污水', '上海市崇明县城桥镇岱山路19号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '装备 1进1出');
INSERT INTO `enterprise` VALUES ('15', '15', '15', '上海城投城桥污水处理有限公司(新河项目)', '新河污水', '崇明县新河镇井亭村为群1队', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '装备 1进1出');
INSERT INTO `enterprise` VALUES ('16', '16', '16', '上海城投污水处理有限公司石洞口污水处理厂（长兴项目）', '长兴岛污水', '长兴岛江南大道兴甘路', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '装备 1进1出');
INSERT INTO `enterprise` VALUES ('17', '17', '17', '上海城投瀛洲生活垃圾处置有限公司', '瀛洲生活垃圾处置', '港沿公路4098号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '');
INSERT INTO `enterprise` VALUES ('18', '18', '18', '上海船厂船舶有限公司', '上海船厂', '崇明县海江公路1号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '装备 0进2出');
INSERT INTO `enterprise` VALUES ('19', '19', '19', '上海华润大东船务工程有限公司', '华润大东', '崇明县城桥大东路1号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '新增 0进2出');
INSERT INTO `enterprise` VALUES ('20', '20', '20', '上海江南长兴造船有限责任公司', '江南造船', '上海市崇明县长兴镇长兴江南大道2468号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '装备 0进1出');
INSERT INTO `enterprise` VALUES ('21', '21', '21', '上海永程固废处理有限公司', '永程固废', '崇明区港沿镇港沿公路4088号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '雷磁');
INSERT INTO `enterprise` VALUES ('22', '22', '22', '上海振华重工(集团)股份有限公司长兴分公司', '振华重工', '崇明县长兴镇凤滨路666号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '装备 0进1出');
INSERT INTO `enterprise` VALUES ('23', '23', '23', '中海工业（上海长兴）有限公司', '中海长兴', '上海市崇明县长兴岛', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '装备 0进1出');
INSERT INTO `enterprise` VALUES ('24', '24', '24', '科思创聚合物（中国）有限公司', '科思创聚合物', '上海化学工业区目华路82号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '装备 0进2出');
INSERT INTO `enterprise` VALUES ('25', '25', '25', '上海东石塘再生能源有限公司', '东石塘再生能源', '上海市奉贤化学工业园区漴缺村1488号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '');
INSERT INTO `enterprise` VALUES ('26', '26', '26', '上海市奉锦环境建设管理有限公司', '奉贤东部', '奉贤区五四农场中港水闸西南侧', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '雷磁 2进2出 奉贤东部');
INSERT INTO `enterprise` VALUES ('27', '27', '27', '上海市奉贤区排水运行管理中心', '奉贤排水', '上海市奉贤区南桥新建东路144号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '装备 1进1出 奉贤南桥');
INSERT INTO `enterprise` VALUES ('28', '28', '28', '上海市奉贤西部污水处理有限公司', '奉贤西部', '上海市奉贤区柘林镇海龙路888号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '雷磁 1进2出');
INSERT INTO `enterprise` VALUES ('29', '29', '29', '亚东石化（上海）有限公司', '亚东石化', '上海市奉贤区星火开发区白沙路133号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '自运  0进1出');
INSERT INTO `enterprise` VALUES ('30', '30', '30', '上海城投污水处理有限公司曲阳污水处理厂', '曲阳水质', '上海市虹口区东体育会路430号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '装备 1进1出');
INSERT INTO `enterprise` VALUES ('31', '31', '31', '上海安亭污水处理有限公司', '嘉定环境', '上海市嘉定区嘉松北路4671弄18号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '雷磁 2进2出 嘉定安亭');
INSERT INTO `enterprise` VALUES ('32', '32', '32', '上海大众嘉定污水处理有限公司', '嘉定污水', '嘉罗公路1720号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '雷磁 1进1出');
INSERT INTO `enterprise` VALUES ('33', '33', '33', '上海大众汽车有限公司', '上海大众', '上海市嘉定区安亭镇于田路123号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '雷磁 0进4出');
INSERT INTO `enterprise` VALUES ('34', '34', '34', '上海嘉定新城污水处理厂', '新城北区', '上海市嘉定区外冈镇北龚村88号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '公用 1进1出');
INSERT INTO `enterprise` VALUES ('35', '35', '35', '上海嘉定再生能源有限公司', '嘉定再生能源', '嘉定区外冈镇古塘村688号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '');
INSERT INTO `enterprise` VALUES ('36', '36', '36', '上海巴斯夫聚氨酯有限公司', '巴斯夫聚氨酯', '上海化学工业区楚华路25号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '装备 0进1出');
INSERT INTO `enterprise` VALUES ('37', '37', '37', '上海枫亭水质净化有限公司', '枫亭水质', '上海市金山区朱泾镇秀州村前进8188号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '装备 1进1出');
INSERT INTO `enterprise` VALUES ('38', '38', '38', '上海化学工业区中法水务发展有限公司', '中法水务', '上海市化学工业区目华路168号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '装备 0进3出');
INSERT INTO `enterprise` VALUES ('39', '39', '39', '上海金山枫泾水质净化有限公司', '枫泾水质', '农兴村9组4078号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '公用 1进1出');
INSERT INTO `enterprise` VALUES ('40', '40', '40', '上海金山廊下污水处理有限公司', '廊下污水', '上海金山廊下镇万勇路475号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '装备 1进1出');
INSERT INTO `enterprise` VALUES ('41', '41', '41', '上海金山排海工程有限公司', '新江厂', '上海市金山区亭卫南路208号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '装备 1进1出 新江厂');
INSERT INTO `enterprise` VALUES ('42', '42', '42', '上海金山鹏鹞水务有限公司', '第二污水', '上海市金山区金山卫镇海金路958号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '装备 1进1出 金山第二污水');
INSERT INTO `enterprise` VALUES ('43', '43', '43', '上海金兴水处理工程有限公司', '兴塔污水', '上海市金山区枫泾镇兴塔工业园区建安路85号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '公用 1进1出 兴塔污水');
INSERT INTO `enterprise` VALUES ('44', '44', '44', '上海氯碱化工股份有限公司华胜化工厂', '氯碱华胜', '上海化学工业区神工路200号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 'zb 0in2out');
INSERT INTO `enterprise` VALUES ('45', '45', '45', '上海赛科石油化工有限责任公司', '赛科石化', '上海化学工业区西河路', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '装备 0进1出 远大数采仪');
INSERT INTO `enterprise` VALUES ('46', '46', '46', '中国石化上海石油化工股份有限公司', '上海石化', '上海市金山区金一路48号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '自运 0进1出');
INSERT INTO `enterprise` VALUES ('47', '47', '47', '奥特斯(中国)有限公司', '奥特斯', '上海市闵行区金都路5000号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '闵欣 0进2出');
INSERT INTO `enterprise` VALUES ('48', '48', '48', '光明乳业股份有限公司华东中心工厂', '光明乳业', '闵行区紫东路489号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '闵欣 0进2出');
INSERT INTO `enterprise` VALUES ('49', '49', '49', '上海电气集团上海电机厂有限公司', '上海电机厂', '上海市闵行区江川路555号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '闵欣 0进1出');
INSERT INTO `enterprise` VALUES ('50', '50', '50', '上海华谊能源化工有限公司', '上海焦化', '龙吴路4280号', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, '闵欣 0进1出');

-- ----------------------------
-- Table structure for `environment`
-- ----------------------------
DROP TABLE IF EXISTS `environment`;
CREATE TABLE `environment` (
  `Env_no` int(11) NOT NULL AUTO_INCREMENT,
  `Env_watershed` varchar(10) DEFAULT NULL,
  `Env_area` varchar(10) DEFAULT NULL,
  `Env_craft` varchar(10) DEFAULT NULL,
  `Env_facilities_ability` varchar(20) DEFAULT NULL,
  `Env_sewage_class` varchar(20) DEFAULT NULL,
  `Env_sea` float DEFAULT NULL,
  `Env_river` float DEFAULT NULL,
  `Env_waters_function` varchar(50) DEFAULT NULL,
  `Env_sea_function` varchar(20) DEFAULT NULL,
  `Env_noise` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Env_no`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of environment
-- ----------------------------
INSERT INTO `environment` VALUES ('1', '蕴藻浜', '宝山区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('2', '上海', '宝山区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('3', '长江', '宝山区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('4', '北横港', '宝山区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('5', '长江', '宝山区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('6', '张泾河', '宝山区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('7', '张泾河', '宝山区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('8', '张泾河', '宝山区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('9', '张泾河', '长宁区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('10', '上海', '长宁区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('11', '上海', '崇明区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('12', '张泾河', '崇明区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('13', '张泾河', '崇明区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('14', '张泾河', '崇明区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('15', '长江', '崇明区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('16', '张泾河', '崇明区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('17', '上海', '崇明区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('18', '上海', '崇明区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('19', '上海', '崇明区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('20', '上海', '崇明区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('21', '上海', '崇明区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('22', '上海', '崇明区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('23', '上海', '崇明区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('24', '上海', '奉贤区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('25', '上海', '奉贤区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('26', '杭州湾', '奉贤区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('27', '张泾河', '奉贤区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('28', '张泾河', '奉贤区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('29', '蒲汇塘', '奉贤区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('30', '张泾河', '虹口区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('31', '张泾河', '嘉定区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('32', '练祁河', '嘉定区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('33', '张泾河', '嘉定区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('34', '张泾河', '嘉定区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('35', '上海', '嘉定区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('36', '上海', '金山区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('37', '张泾河', '金山区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('38', '上海', '金山区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('39', '张泾河', '金山区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('40', '张泾河', '金山区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('41', '张泾河', '金山区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('42', '张泾河', '金山区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('43', '大茫塘河', '金山区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('44', '上海', '金山区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('45', '上海', '金山区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('46', '杭州湾', '金山区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('47', '张泾河', '闵行区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('48', '上海', '闵行区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('49', '上海', '闵行区', null, null, null, null, null, null, null, null);
INSERT INTO `environment` VALUES ('50', '张泾河', '闵行区', null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `inlet`
-- ----------------------------
DROP TABLE IF EXISTS `inlet`;
CREATE TABLE `inlet` (
  `In_no` int(11) NOT NULL AUTO_INCREMENT,
  `Ent_no` int(11) DEFAULT NULL,
  `In_clean_name` varchar(20) DEFAULT NULL,
  `In_water_no` int(11) DEFAULT NULL,
  `In_water_name` varchar(20) DEFAULT NULL,
  `In_range` varchar(10) DEFAULT NULL,
  `In_location` varchar(10) DEFAULT NULL,
  `In_state` varchar(5) DEFAULT NULL,
  `In_watershed` varchar(5) DEFAULT NULL,
  `In_water_system` varchar(10) DEFAULT NULL,
  `In_tributary` varchar(5) DEFAULT NULL,
  `In_section` varchar(10) DEFAULT NULL,
  `In_waters_function` varchar(50) DEFAULT NULL,
  `In_domain` varchar(50) DEFAULT NULL,
  `In_latitude` float DEFAULT NULL,
  `In_longitude` float DEFAULT NULL,
  `In_data_report` varchar(5) DEFAULT NULL,
  `In_report_no` int(11) DEFAULT NULL,
  `In_report_MN` varchar(20) DEFAULT NULL,
  `In_open` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`In_no`),
  KEY `FK_have3` (`Ent_no`),
  CONSTRAINT `FK_have3` FOREIGN KEY (`Ent_no`) REFERENCES `enterprise` (`Ent_no`)
) ENGINE=InnoDB AUTO_INCREMENT=57 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of inlet
-- ----------------------------
INSERT INTO `inlet` VALUES ('-1', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('1', null, '081# 枫泾厂进口', '912008101', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('2', null, '083# 兴塔厂进口', '2117050101', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('3', null, '085# 白龙港厂进口', '912008501', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('4', null, '089# 临港厂进口', '912008901', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('5', null, '08C# 白龙港 进口2', '21130301', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('6', null, '091# 长桥厂进口', '912009101', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('7', null, '093# 闵行厂进口1', '912009301', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('8', null, '094# 闵行厂进口2', '912009302', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('9', null, '096# 龙华厂进口', '912009601', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('10', null, '099# 桃浦厂进口', '912009901', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('11', null, '101# 曲阳厂进口', '912010101', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('12', null, '103# 竹园一厂进口', '912010301', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('13', null, '105# 天山厂进口', '912010501', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('14', null, '111# 泗塘厂进口', '912011101', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('15', null, '113# 吴淞厂进口', '912011301', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('16', null, '115# 石洞口厂进口', '912011501', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('17', null, '117# 竹园二厂进口', '912011701', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('18', null, '119# 安亭厂进口2', '912012303', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('19', null, '121# 大众嘉定厂进口', '912012101', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('20', null, '123# 安亭厂进口1', '912012301', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('21', null, '125# 嘉定新城北区 进口', '912012501', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('22', null, '127# 莘庄厂进口1', '912012701', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('23', null, '128# 莘庄厂进口2', '912012702', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('24', null, '131# 新江厂进口', '912013101', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('25', null, '133# 枫亭厂进口', '912013301', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('26', null, '135# 廊下厂进口', '912013501', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('27', null, '137# 南汇厂进口', '912013701', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('28', null, '139# 周浦厂进口', '912013901', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('29', null, '141# 松江厂进口', '912014101', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('30', null, '144# 松西厂进口', '912014401', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('31', null, '146# 松申厂进口', '912014601', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('32', null, '148# 松东厂进口', '912014801', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('33', null, '150# 泖港厂进口', '912015001', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('34', null, '152# 叶榭厂进口', '912015201', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('35', null, '154# 新浜厂进口', '912015401', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('36', null, '154#-1 新浜厂 进口（ 新临）', '-21160701', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('37', null, '156# 南桥厂进口', '912015601', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('38', null, '159# 奉西厂进口', '912015901', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('39', null, '161# 奉东厂进口1', '912016101', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('40', null, '165# 青浦厂进口', '912016501', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('41', null, '169# 奉东厂进口2', '912016103', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('42', null, '171# 商榻厂进口', '912017101', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('43', null, '173# 青浦二厂进口', '912017301', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('44', null, '177# 练塘厂进口', '912017701', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('45', null, '179# 徐泾厂进口', '912017901', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('46', null, '181# 朱家角厂进口', '912018101', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('47', null, '183# 西岑厂进口', '912018301', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('48', null, '185# 金泽厂进口', '912018501', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('49', null, '187# 华新厂进口', '912018701', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('50', null, '189# 白鹤厂进口', '912018901', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('51', null, '193# 长兴岛厂进口', '912019301', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('52', null, '195# 城桥厂进口', '912019501', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('53', null, '197# 堡镇厂进口', '912019701', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('54', null, '199# 新河厂进口', '912019901', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('55', null, '235# 金山二污 进口', '912025001', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `inlet` VALUES ('56', null, '272# 大众嘉定厂进口2', '2', null, '', '', '启用', null, null, null, null, null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `mail`
-- ----------------------------
DROP TABLE IF EXISTS `mail`;
CREATE TABLE `mail` (
  `Mail_Id` int(11) NOT NULL AUTO_INCREMENT,
  `User_Id` int(11) DEFAULT NULL,
  `Mail_subject` text,
  `Mail_text` text,
  `Mail_send_name` varchar(100) DEFAULT NULL,
  `Mail_send_mail` varchar(100) DEFAULT NULL,
  `Mail_rec_name` varchar(100) DEFAULT NULL,
  `Mail_rec_mail` varchar(100) DEFAULT NULL,
  `Mail_time` varchar(50) DEFAULT NULL,
  PRIMARY KEY (`Mail_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=36 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of mail
-- ----------------------------
INSERT INTO `mail` VALUES ('7', '0', 'asdasf', 'asdasdaf', 'websystem', 'websystem123@163.com', '1206920826@qq.com', '1206920826@qq.com', '2017-11-09 21:17:08');
INSERT INTO `mail` VALUES ('8', '0', 'asdasf', 'asdasdaf', 'websystem', 'websystem123@163.com', ' 1067513726@qq.com', ' 1067513726@qq.com', '2017-11-09 21:17:11');
INSERT INTO `mail` VALUES ('19', '0', '美', '美', 'websystem', 'websystem123@163.com', '1067513726@qq.com', '1067513726@qq.com', '2017-11-19 15:11:07');
INSERT INTO `mail` VALUES ('20', '0', 'dearyuan', 'dddd', 'websystem', 'websystem123@163.com', '1067513726@qq.com', '1067513726@qq.com', '2017-11-19 15:12:20');
INSERT INTO `mail` VALUES ('23', '0', '222', '111', 'websystem', 'websystem123@163.com', '3525116637@qq.com', '3525116637@qq.com', '2017-11-21 10:52:46');
INSERT INTO `mail` VALUES ('28', '0', '', '\r\n\r\n\r\n\r\n\r\n\r\n-----------------\r\nquanquan\r\n1206920826@qq.com\r\n18742586065\r\n2017.11.27', 'websystem', 'websystem123@163.com', '1067513726@qq.com', '1067513726@qq.com', '2017-11-27 20:09:38');
INSERT INTO `mail` VALUES ('29', '0', '', '\r\n\r\n\r\n\r\n\r\n\r\n-----------------\r\nquanquan\r\n1206920826@qq.com\r\n18742586065\r\n2017.11.27', 'websystem', 'websystem123@163.com', '1067513726@qq.com', '1067513726@qq.com', '2017-11-27 20:11:46');
INSERT INTO `mail` VALUES ('30', '0', 'qq', '\r\n\r\n\r\naa\r\n\r\n\r\n-----------------\r\n', 'websystem', 'websystem123@163.com', '1067513726@qq.com', '1067513726@qq.com', '2017-12-03 12:41:31');
INSERT INTO `mail` VALUES ('34', '0', '11', '\r\n\r\n123\r\n\r\n\r\n\r\n-----------------\r\n', 'websystem', 'websystem123@163.com', '1067513726@qq.com', '1067513726@qq.com', '2018-01-09 17:24:21');
INSERT INTO `mail` VALUES ('35', '0', '582', '\r\n\r\n\r\n\r\n464061\r\n\r\n-----------------\r\n姓名：qq\r\n手机号：123\r\n地址：aaa\r\n', 'websystem', 'websystem123@163.com', '1063959635@qq.com', '1063959635@qq.com', '2018-01-15 16:56:40');

-- ----------------------------
-- Table structure for `manage`
-- ----------------------------
DROP TABLE IF EXISTS `manage`;
CREATE TABLE `manage` (
  `Man_no` int(11) NOT NULL AUTO_INCREMENT,
  `Man_Ent_id` varchar(20) DEFAULT NULL,
  `Man_HB_orgnization` varchar(20) DEFAULT NULL,
  `Man_concern_extent` varchar(5) DEFAULT NULL,
  `Man_WRY_property` varchar(5) DEFAULT NULL,
  `Man_HB_person` varchar(10) DEFAULT NULL,
  `Man_HB_person_tel` varchar(15) DEFAULT NULL,
  `Man_HB_office_tel` varchar(10) DEFAULT NULL,
  `Man_HB_fax` varchar(20) DEFAULT NULL,
  `Man_Ent_division` varchar(10) DEFAULT NULL,
  `Man_Ent_department` varchar(20) DEFAULT NULL,
  `Man_Ent_person` int(11) DEFAULT NULL,
  `Man_Ent_date` varchar(20) DEFAULT NULL,
  `Man_gross_product` float DEFAULT NULL,
  `Man_total` float DEFAULT NULL,
  `Man_sewage` float DEFAULT NULL,
  `Man_repeat` float DEFAULT NULL,
  `Man_fresh` float DEFAULT NULL,
  `Man_starndard` float DEFAULT NULL,
  `Man_Ent_class` varchar(10) DEFAULT NULL,
  `Man_WRY_scale` varchar(10) DEFAULT NULL,
  `Man_reported_no` varchar(20) DEFAULT NULL,
  `Man_data_accepter` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`Man_no`)
) ENGINE=InnoDB AUTO_INCREMENT=51 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of manage
-- ----------------------------
INSERT INTO `manage` VALUES ('1', null, null, '国控', null, '周若媛', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('2', null, null, '国控', null, '李广夫', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('3', null, null, '国控', null, '周洋 陆闻玺', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('4', null, null, '区控', null, '', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('5', null, null, '国控', null, '', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('6', null, null, '国控', null, '徐耀', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('7', null, null, '国控', null, '蒋伟民', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('8', null, null, '国控', null, '康磊', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('9', null, null, '国控', null, '孟祥义', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('10', null, null, '区控', null, '晏子厚', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('11', null, null, '国控', null, '', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('12', null, null, '国控', null, '陈伟斌', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('13', null, null, '国控', null, '陈伟斌', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('14', null, null, '国控', null, '陈伟斌', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('15', null, null, '国控', null, '陈伟斌', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('16', null, null, '国控', null, '沈峥其', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('17', null, null, '区控', null, '', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('18', null, null, '国控', null, '黄宏林', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('19', null, null, '国控', null, '', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('20', null, null, '国控', null, '王倩', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('21', null, null, '区控', null, '杨程', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('22', null, null, '国控', null, '薛松梅', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('23', null, null, '国控', null, '杨文杰', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('24', null, null, '国控', null, '魏昆', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('25', null, null, '区控', null, '', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('26', null, null, '国控', null, '严华', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('27', null, null, '国控', null, '赵叶', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('28', null, null, '国控', null, '史仁明', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('29', null, null, '国控', null, '朱莉', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('30', null, null, '国控', null, '樊昱昕', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('31', null, null, '国控', null, '马雷', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('32', null, null, '国控', null, '袁建华', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('33', null, null, '国控', null, '陆震宇', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('34', null, null, '国控', null, '陈强', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('35', null, null, '区控', null, '', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('36', null, null, '国控', null, '胡瑞英', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('37', null, null, '国控', null, '陈冬英', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('38', null, null, '国控', null, '慈晓琳', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('39', null, null, '国控', null, '沈军', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('40', null, null, '国控', null, '彭争梁', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('41', null, null, '国控', null, '黄虎一', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('42', null, null, '国控', null, '陈焕军', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('43', null, null, '国控', null, '胡丽萍', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('44', null, null, '国控', null, '秦锋', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('45', null, null, '国控', null, '李荣', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('46', null, null, '国控', null, '俞卫', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('47', null, null, '国控', null, '李辰瑜', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('48', null, null, '国控', null, '王国庭', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('49', null, null, '国控', null, '陈正欢', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `manage` VALUES ('50', null, null, '国控', null, '石蕾', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `outfall`
-- ----------------------------
DROP TABLE IF EXISTS `outfall`;
CREATE TABLE `outfall` (
  `Out_no` int(11) NOT NULL AUTO_INCREMENT,
  `Ent_no` int(11) DEFAULT NULL,
  `Out_name` varchar(20) DEFAULT NULL,
  `Out_wate_no` varchar(11) DEFAULT NULL,
  `Out_water_name` varchar(25) DEFAULT NULL,
  `Out_regular` varchar(10) DEFAULT NULL,
  `Out_direction` varchar(30) DEFAULT NULL,
  `Out_location` varchar(10) DEFAULT NULL,
  `Out_type` varchar(10) DEFAULT NULL,
  `Out_form` varchar(5) DEFAULT NULL,
  `Out_net` varchar(5) DEFAULT NULL,
  `Out_data_report` varchar(5) DEFAULT NULL,
  `Out_tributary` varchar(5) DEFAULT NULL,
  `Out_waters_function` varchar(50) DEFAULT NULL,
  `Out_latitude` float DEFAULT NULL,
  `Out_longitude` float DEFAULT NULL,
  `Out_sampling_type` varchar(5) DEFAULT NULL,
  `Out_watershed` varchar(10) DEFAULT NULL,
  `Out_report_no` int(11) DEFAULT NULL,
  `Out_report_MN` varchar(20) DEFAULT NULL,
  `Out_state` varchar(5) DEFAULT NULL,
  `Out_water_system` varchar(10) DEFAULT NULL,
  `Out_section` varchar(10) DEFAULT NULL,
  `Out_domain` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`Out_no`),
  KEY `FK_have2` (`Ent_no`),
  CONSTRAINT `FK_have2` FOREIGN KEY (`Ent_no`) REFERENCES `enterprise` (`Ent_no`)
) ENGINE=InnoDB AUTO_INCREMENT=110 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of outfall
-- ----------------------------
INSERT INTO `outfall` VALUES ('-1', null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null);
INSERT INTO `outfall` VALUES ('101', '1', '025# 冷铬1420', 'WS004', null, null, null, '', null, null, '联网', '未上报', null, null, null, null, null, null, null, null, '启用', null, null, null);
INSERT INTO `outfall` VALUES ('102', '2', '026# 化工二期', '暂无', null, null, null, '', null, null, '联网', '未上报', null, null, null, null, null, null, null, null, '启用', null, null, null);
INSERT INTO `outfall` VALUES ('103', '3', '027# 化工三期', '暂无', null, null, null, '', null, null, '联网', '未上报', null, null, null, null, null, null, null, null, '启用', null, null, null);
INSERT INTO `outfall` VALUES ('104', '4', '028# 宝钢电厂', 'WS001', null, null, null, '', null, null, '联网', '未上报', null, null, null, null, null, null, null, null, '启用', null, null, null);
INSERT INTO `outfall` VALUES ('105', '5', '029# 宝钢含油', 'WS002', null, null, null, '', null, null, '联网', '未上报', null, null, null, null, null, null, null, null, '启用', null, null, null);
INSERT INTO `outfall` VALUES ('106', '6', '030# 宝钢磷化', 'WS003', null, null, null, '', null, null, '联网', '未上报', null, null, null, null, null, null, null, null, '启用', null, null, null);
INSERT INTO `outfall` VALUES ('107', '41', '032# 一钢不锈钢 ', 'WS001', null, null, null, '', null, null, '联网', '未上报', null, null, null, null, null, null, null, null, '启用', null, null, null);
INSERT INTO `outfall` VALUES ('108', '33', '035# 宝钢特钢', 'WS001', null, null, null, '', null, null, '联网', '未上报', null, null, null, null, null, null, null, null, '启用', null, null, null);
INSERT INTO `outfall` VALUES ('109', '23', '037# 宝钢冷轧', '暂无', null, null, null, '', null, null, '联网', '未上报', null, null, null, null, null, null, null, null, '启用', null, null, null);

-- ----------------------------
-- Table structure for `scy`
-- ----------------------------
DROP TABLE IF EXISTS `scy`;
CREATE TABLE `scy` (
  `SCY_no` int(11) NOT NULL AUTO_INCREMENT,
  `Ent_no` int(11) DEFAULT NULL,
  `Out_no` int(11) DEFAULT NULL,
  `In_no` int(11) DEFAULT NULL,
  `SCY_type` varchar(10) DEFAULT NULL,
  `SCY_MN` varchar(50) DEFAULT NULL,
  `SCY_factory` varchar(30) DEFAULT NULL,
  `SCY_persion` varchar(10) DEFAULT NULL,
  `SCY_tel` varchar(15) DEFAULT NULL,
  `SCY_IP` varchar(20) DEFAULT NULL,
  `SCY_report_no` int(11) DEFAULT NULL,
  `SCY_SIM` varchar(20) DEFAULT NULL,
  `SCY_password` varchar(20) DEFAULT NULL,
  `SCY_operation` varchar(25) DEFAULT NULL,
  `SCY_operation_person` varchar(10) DEFAULT NULL,
  `SCY_operation_tel` varchar(15) DEFAULT NULL,
  `SCY_recipient_unit` varchar(25) DEFAULT NULL,
  `SCY_recipient` varchar(10) DEFAULT NULL,
  `SCY_start_date` varchar(20) DEFAULT NULL,
  `SCY_use_date` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`SCY_no`),
  KEY `FK_has1` (`In_no`),
  KEY `FK_has2` (`Out_no`),
  KEY `FK_have1` (`Ent_no`),
  CONSTRAINT `FK_has1` FOREIGN KEY (`In_no`) REFERENCES `inlet` (`In_no`),
  CONSTRAINT `FK_has2` FOREIGN KEY (`Out_no`) REFERENCES `outfall` (`Out_no`),
  CONSTRAINT `FK_have1` FOREIGN KEY (`Ent_no`) REFERENCES `enterprise` (`Ent_no`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of scy
-- ----------------------------
INSERT INTO `scy` VALUES ('1', '1', '101', '-1', 'type', 'mn2', 'adf', null, 'afda', null, null, null, 'da', 'adf', 'fasff', 'afd', null, null, null, null);
INSERT INTO `scy` VALUES ('2', '2', '-1', '3', 'typed', 'mn1', 'df', 'dfa', null, 'afd', null, 'fd', null, null, null, null, null, null, null, null);

-- ----------------------------
-- Table structure for `sign`
-- ----------------------------
DROP TABLE IF EXISTS `sign`;
CREATE TABLE `sign` (
  `Sign_Id` int(11) NOT NULL AUTO_INCREMENT,
  `User_Id` int(11) DEFAULT NULL,
  `Sign_title` varchar(30) DEFAULT NULL,
  `Sign_text` text,
  `Sign_state` varchar(5) DEFAULT NULL,
  PRIMARY KEY (`Sign_Id`),
  KEY `FK-have10` (`User_Id`) USING BTREE,
  CONSTRAINT `FK-have10` FOREIGN KEY (`User_Id`) REFERENCES `user` (`User_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of sign
-- ----------------------------
INSERT INTO `sign` VALUES ('1', '1', '未使用', '', 'close');
INSERT INTO `sign` VALUES ('2', '1', '签名', 'quanquan\r\n1206920826@qq.com\r\n187425812\r\n2017.11.27', 'close');
INSERT INTO `sign` VALUES ('4', '1', '通知', '姓名：qq\r\n手机号：123\r\n地址：aaa\r\n', 'open');

-- ----------------------------
-- Table structure for `user`
-- ----------------------------
DROP TABLE IF EXISTS `user`;
CREATE TABLE `user` (
  `User_Id` int(11) NOT NULL AUTO_INCREMENT,
  `User_name` varchar(10) DEFAULT NULL,
  `User_password` varchar(30) DEFAULT NULL,
  `User_sex` varchar(1) DEFAULT NULL,
  `User_age` varchar(2) DEFAULT NULL,
  `User_tel` varchar(15) DEFAULT NULL,
  `User_mail` varchar(50) DEFAULT NULL,
  `User_address` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`User_Id`)
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;

-- ----------------------------
-- Records of user
-- ----------------------------
INSERT INTO `user` VALUES ('1', '杨先', '123456', '女', '22', '18742036273', '1063959635@qq.com', '辽宁大连');
