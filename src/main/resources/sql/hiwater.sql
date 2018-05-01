-- MySQL dump 10.13  Distrib 5.7.17, for Win64 (x86_64)
--
-- Host: localhost    Database: hiwater
-- ------------------------------------------------------
-- Server version	5.7.18-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `module`
--

DROP TABLE IF EXISTS `module`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `module` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `parent_id` int(11) NOT NULL DEFAULT '0',
  `name` varchar(50) NOT NULL,
  `permission` varchar(100) DEFAULT NULL,
  `url` varchar(500) DEFAULT NULL,
  `leaf` tinyint(1) DEFAULT '0',
  `api` tinyint(1) DEFAULT '0' COMMENT '是页面还是一个http接口\ntrue ==接口\nfalse==页面',
  `comment` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `uuid_fk_idx` (`parent_id`)
) ENGINE=InnoDB AUTO_INCREMENT=112 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `module`
--

LOCK TABLES `module` WRITE;
/*!40000 ALTER TABLE `module` DISABLE KEYS */;
INSERT INTO `module` VALUES (11,107,'用户','user','',1,1,NULL),(12,106,'角色','role','',1,1,NULL),(13,104,'模块','module','',1,1,NULL),(14,105,'导航','navigation','',1,1,NULL),(19,0,'废水污染源自动监控',NULL,NULL,0,0,NULL),(20,0,'污染源信息管理',NULL,NULL,0,0,NULL),(21,0,'污染源自动采样',NULL,NULL,0,0,NULL),(22,0,'系统管理',NULL,NULL,0,0,NULL),(23,19,'实时监测',NULL,NULL,0,0,NULL),(24,19,'报警管理',NULL,NULL,0,0,NULL),(25,19,'审核管理',NULL,NULL,0,0,NULL),(26,19,'综合管理',NULL,NULL,0,0,NULL),(27,19,'报表统计',NULL,NULL,0,0,NULL),(28,19,'邮件服务',NULL,NULL,0,0,NULL),(29,19,'上报管理',NULL,NULL,0,0,NULL),(31,24,'报警日志',NULL,'/browseAlarmlogging.action',0,0,NULL),(32,24,'报警规则',NULL,'/browseAlarmRegular.action',0,0,NULL),(33,24,'短信设置',NULL,'/navigation_html/First/2-Alarm/MessageNotice.html',0,0,NULL),(34,24,'报警指令',NULL,'/navigation_html/First/2-Alarm/AlarmInstruct.html',0,0,NULL),(35,25,'审核数据',NULL,'/navigation_html/First/3-Audit/AuditData.html',0,0,NULL),(36,25,'审核规则',NULL,'/navigation_html/First/3-Audit/AuditRule.html',0,0,NULL),(37,25,'审核日志',NULL,'/navigation_html/First/3-Audit/AuditLog.html',0,0,NULL),(38,25,'日志生成',NULL,'/navigation_html/First/3-Audit/DataGeneration.html',0,0,NULL),(39,25,'审核结果',NULL,'/navigation_html/First/3-Audit/AuditResult.html',0,0,NULL),(40,26,'监控数据查询',NULL,'/navigation_html/First/4-SynthesizeQuery/MonitorDataQuery.html',0,0,NULL),(41,26,'报表数据查询',NULL,'/navigation_html/First/4-SynthesizeQuery/StatementDataQuery.html',0,0,NULL),(42,27,'排放统计月报',NULL,NULL,0,0,NULL),(43,27,'企业排放情况统计',NULL,NULL,0,0,NULL),(44,27,'污水处理厂情况统计',NULL,NULL,0,0,NULL),(45,27,'企业污染物排放统计',NULL,NULL,0,0,NULL),(46,27,'污水厂污染物排放统计',NULL,NULL,0,0,NULL),(47,27,'企业废水排放统计',NULL,NULL,0,0,NULL),(48,27,'企业超标统计（瞬时值）',NULL,NULL,0,0,NULL),(49,27,'企业超标统计（日均值）',NULL,NULL,0,0,NULL),(50,27,'污水厂超标统计（瞬时值）',NULL,NULL,0,0,NULL),(51,27,'污水厂超标统计（日均值）',NULL,NULL,0,0,NULL),(52,27,'在线监测数据审核报告',NULL,NULL,0,0,NULL),(53,27,'其他',NULL,NULL,0,0,NULL),(62,28,'发信箱',NULL,'/browseMail.action',0,0,NULL),(63,28,'写邮件',NULL,'/browseWriteMail.action',0,0,NULL),(64,28,'通讯簿',NULL,'/browseContacts.action',0,0,NULL),(65,28,'邮件设置',NULL,'/setMail.action',0,0,NULL),(66,29,'上报查询',NULL,NULL,0,0,NULL),(67,29,'上报设置',NULL,NULL,0,0,NULL),(68,29,'上报日志',NULL,NULL,0,0,NULL),(69,53,'排放统计月报-小时',NULL,NULL,0,0,NULL),(70,19,'运行维护',NULL,NULL,0,0,NULL),(71,70,'运维统计',NULL,NULL,0,0,NULL),(72,70,'运维配置',NULL,NULL,0,0,NULL),(73,71,'在线率概况',NULL,NULL,0,0,NULL),(74,71,'测点在线率详情',NULL,NULL,0,0,NULL),(75,71,'数据采样统计',NULL,NULL,0,0,NULL),(76,72,'维护组配置',NULL,NULL,0,0,NULL),(77,72,'维护类型配置',NULL,NULL,0,0,NULL),(78,72,'运行日历设置',NULL,NULL,0,0,NULL),(79,72,'仪器运行率标准',NULL,NULL,0,0,NULL),(80,20,'企业信息管理',NULL,'/browseEnt_view.action',0,0,NULL),(81,20,'排水口管理',NULL,'/browseOutfall_view.action',0,0,NULL),(82,20,'进水口管理',NULL,'/browseInlet.action',0,0,NULL),(83,20,'数采仪管理',NULL,'/browseSCY_view.action',0,0,NULL),(84,20,'进排口设置',NULL,'/navigation_html/Second/O&I_Set.html',0,0,NULL),(85,21,'在线列表',NULL,'/navigation_html/First/1-RealTimeMonitoring/OnlineTable.jsp',0,0,NULL),(86,21,'采样控制',NULL,NULL,0,0,NULL),(87,21,'报警管理',NULL,NULL,0,0,NULL),(88,21,'分析统计',NULL,NULL,0,0,NULL),(89,21,'分析统计',NULL,NULL,0,0,NULL),(90,86,'远程控制',NULL,NULL,0,0,NULL),(91,86,'采样计划',NULL,NULL,0,0,NULL),(92,86,'超标采样标准',NULL,NULL,0,0,NULL),(93,86,'采样任务查询',NULL,NULL,0,0,NULL),(94,86,'采样任务下达',NULL,NULL,0,0,NULL),(95,87,'报警日志',NULL,NULL,0,0,NULL),(96,87,'门禁管理',NULL,NULL,0,0,NULL),(97,88,'月报',NULL,NULL,0,0,NULL),(98,88,'季报',NULL,NULL,0,0,NULL),(99,88,'自定义报表',NULL,NULL,0,0,NULL),(100,88,'采样数据',NULL,NULL,0,0,NULL),(102,22,'框架管理',NULL,NULL,0,0,NULL),(103,22,'权限管理',NULL,NULL,0,0,NULL),(104,102,'模块管理','module:list','/systemManage/frameworkManage/moduleManage.jsp',1,0,NULL),(105,102,'导航管理','navigation:list','/systemManage/frameworkManage/navManage.jsp',1,0,NULL),(106,103,'角色管理','role:list','/systemManage/authManage/roleManage.jsp',1,0,NULL),(107,103,'用户管理','user:list','/systemManage/authManage/userManage.jsp',1,0,NULL),(108,22,'运行管理','',NULL,0,0,NULL),(109,108,'在线用户','onlineUser:list','/systemManage/runManage/onlineUser.jsp',1,0,NULL),(110,109,'下线用户','onlineUser:stop',NULL,1,1,NULL),(111,109,'列出在线用户','onlineUser:list',NULL,1,1,NULL);
/*!40000 ALTER TABLE `module` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `parent_id` int(11) NOT NULL COMMENT '创造Role的User_id',
  `role_name` varchar(50) DEFAULT NULL,
  `role_cn_name` varchar(45) DEFAULT NULL COMMENT '备注',
  `comment` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `role_name_index` (`role_name`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,0,'admin','超级管理员','test'),(2,0,'guest','陌生',''),(5,58,'role1','测试角色','测试角色');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role_auth`
--

DROP TABLE IF EXISTS `role_auth`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role_auth` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) NOT NULL,
  `module_id` int(11) NOT NULL,
  `can_inherit` tinyint(1) DEFAULT '0' COMMENT '能否传递，给别人授权',
  PRIMARY KEY (`id`),
  KEY `role_fk_idx` (`role_id`),
  KEY `module_op_uuid_fk_idx` (`module_id`),
  CONSTRAINT `module_id_fk` FOREIGN KEY (`module_id`) REFERENCES `module` (`id`),
  CONSTRAINT `role_fk` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=48 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role_auth`
--

LOCK TABLES `role_auth` WRITE;
/*!40000 ALTER TABLE `role_auth` DISABLE KEYS */;
INSERT INTO `role_auth` VALUES (17,1,12,0),(18,1,13,0),(19,1,14,0),(20,1,11,0),(27,2,11,0),(28,2,12,0),(29,1,110,0),(30,1,111,1),(39,1,104,0),(40,1,105,0),(41,1,106,0),(42,1,107,0),(43,1,109,0),(44,5,104,0),(45,5,106,0),(46,5,12,0),(47,5,13,0);
/*!40000 ALTER TABLE `role_auth` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role_user`
--

DROP TABLE IF EXISTS `role_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `role_user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `role_id` int(11) NOT NULL,
  `user_id` int(11) NOT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  KEY `role_id_fk_idx` (`role_id`),
  KEY `user_id_fk_idx` (`user_id`),
  CONSTRAINT `role_id_fk1` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION,
  CONSTRAINT `user_id_fk` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=70 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role_user`
--

LOCK TABLES `role_user` WRITE;
/*!40000 ALTER TABLE `role_user` DISABLE KEYS */;
INSERT INTO `role_user` VALUES (67,1,58),(69,5,61);
/*!40000 ALTER TABLE `role_user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `user` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user_name` varchar(50) NOT NULL COMMENT '登录名',
  `pwd` varchar(128) NOT NULL,
  `create_time` datetime NOT NULL,
  `show_name` varchar(45) DEFAULT NULL COMMENT '显示名称，展示用',
  `user_sex` int(11) DEFAULT NULL,
  `user_tel` char(11) DEFAULT NULL,
  `user_addr` varchar(100) DEFAULT NULL,
  `user_email` varchar(45) DEFAULT NULL,
  `last_opt_time` datetime NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP COMMENT '最后一次操作事件',
  `salt` varchar(100) DEFAULT '' COMMENT '密码加盐',
  `status` int(11) DEFAULT '1' COMMENT '用户状态\n1：正常\n2：锁定，不能登录\n3：删除',
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `id_name_index` (`id`,`user_name`),
  UNIQUE KEY `name_UNIQUE` (`user_name`)
) ENGINE=InnoDB AUTO_INCREMENT=62 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (58,'liqiang','b070f1b8b997320ea8b857ca835fdc70163c5a38cc7ca3ccc5942c7cb0139bddc15c29aaabba5e30c9a920195e084f2bf6ce60276eb155bacfa64416e07b42c3','2018-05-01 17:12:41','李强',1,'18340861214','','1214098151@qq.com','2018-05-01 17:12:41','e53a60412829d2a8c5c7e6f0a98bd716',1),(61,'test','45a1698c81c21c326a67b79395c760a81c59984f37239efb6c9de98a734fe0672ea778221b08acb5013b09f9c020e8d7ccbb58efbb199b05a6f480cbfb32b6a3','2018-05-01 23:08:28','test',0,'18340861214','test','1214098151@qq.com','2018-05-01 23:08:28','0d24d04d0817786295de47aa93addb0d',1);
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-05-01 23:37:46
