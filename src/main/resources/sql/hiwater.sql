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
  KEY `uuid_fk_idx` (`parent_id`),
  KEY `permission_idx` (`permission`)
) ENGINE=InnoDB AUTO_INCREMENT=130 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `module`
--

LOCK TABLES `module` WRITE;
/*!40000 ALTER TABLE `module` DISABLE KEYS */;
INSERT INTO `module` VALUES (19,0,'废水污染源自动监控',NULL,NULL,0,0,NULL),(20,0,'污染源信息管理',NULL,NULL,0,0,NULL),(21,0,'污染源自动采样',NULL,NULL,0,0,NULL),(22,0,'系统管理',NULL,NULL,0,0,NULL),(23,19,'实时监测',NULL,NULL,0,0,NULL),(24,19,'报警管理',NULL,NULL,0,0,NULL),(25,19,'审核管理',NULL,NULL,0,0,NULL),(26,19,'综合管理',NULL,NULL,0,0,NULL),(27,19,'报表统计',NULL,NULL,0,0,NULL),(28,19,'邮件服务',NULL,NULL,0,0,NULL),(29,19,'上报管理',NULL,NULL,0,0,NULL),(31,24,'报警日志',NULL,'/browseAlarmlogging.action',1,0,NULL),(32,24,'报警规则',NULL,'/browseAlarmRegular.action',1,0,NULL),(33,24,'短信设置',NULL,'/navigation_html/First/2-Alarm/MessageNotice.html',1,0,NULL),(34,24,'报警指令',NULL,'/navigation_html/First/2-Alarm/AlarmInstruct.html',1,0,NULL),(35,25,'审核数据',NULL,'/navigation_html/First/3-Audit/AuditData.html',1,0,NULL),(36,25,'审核规则',NULL,'/navigation_html/First/3-Audit/AuditRule.html',1,0,NULL),(37,25,'审核日志',NULL,'/navigation_html/First/3-Audit/AuditLog.html',1,0,NULL),(38,25,'日志生成',NULL,'/navigation_html/First/3-Audit/DataGeneration.html',1,0,NULL),(39,25,'审核结果',NULL,'/navigation_html/First/3-Audit/AuditResult.html',1,0,NULL),(40,26,'监控数据查询',NULL,'/navigation_html/First/4-SynthesizeQuery/MonitorDataQuery.jsp',1,0,NULL),(41,26,'报表数据查询',NULL,'/navigation_html/First/4-SynthesizeQuery/StatementDataQuery.jsp',1,0,NULL),(42,27,'排放统计月报',NULL,NULL,0,0,NULL),(43,27,'企业排放情况统计',NULL,NULL,0,0,NULL),(44,27,'污水处理厂情况统计',NULL,NULL,0,0,NULL),(45,27,'企业污染物排放统计',NULL,NULL,0,0,NULL),(46,27,'污水厂污染物排放统计',NULL,NULL,0,0,NULL),(47,27,'企业废水排放统计',NULL,NULL,0,0,NULL),(48,27,'企业超标统计（瞬时值）',NULL,NULL,0,0,NULL),(49,27,'企业超标统计（日均值）',NULL,NULL,0,0,NULL),(50,27,'污水厂超标统计（瞬时值）',NULL,NULL,0,0,NULL),(51,27,'污水厂超标统计（日均值）',NULL,NULL,0,0,NULL),(52,27,'在线监测数据审核报告',NULL,NULL,0,0,NULL),(53,27,'其他',NULL,NULL,0,0,NULL),(62,28,'发信箱',NULL,'/browseMail.action',1,0,NULL),(63,28,'写邮件',NULL,'/browseWriteMail.action',1,0,NULL),(64,28,'通讯簿',NULL,'/browseContacts.action',1,0,NULL),(65,28,'邮件设置',NULL,'/setMail.action',1,0,NULL),(66,29,'上报查询',NULL,'/navigation_html/First/8-ReportManage/ReportInquiry.jsp',1,0,NULL),(67,29,'上报设置',NULL,'/navigation_html/First/8-ReportManage/ReportSet.jsp',1,0,NULL),(68,29,'上报日志',NULL,'/navigation_html/First/8-ReportManage/ReportLog.jsp',1,0,NULL),(69,53,'排放统计月报-小时',NULL,NULL,0,0,NULL),(70,19,'运行维护',NULL,NULL,0,0,NULL),(71,70,'运维统计',NULL,NULL,0,0,NULL),(72,70,'运维配置',NULL,NULL,0,0,NULL),(73,71,'在线率概况',NULL,'/navigation_html/First/7-RunMaintain/OnlineRateOverview.html',1,0,NULL),(74,71,'测点在线率详情',NULL,'/navigation_html/First/7-RunMaintain/OnlineRateDetail.jsp',1,0,NULL),(75,71,'数据采样统计',NULL,'/navigation_html/First/7-RunMaintain/DataSamplingStatistics.jsp',1,0,NULL),(76,72,'维护组配置',NULL,'/navigation_html/First/7-RunMaintain/GroupConfiguration.html',1,0,NULL),(77,72,'维护类型配置',NULL,'/navigation_html/First/7-RunMaintain/TypeConfiguration.jsp',1,0,NULL),(78,72,'运行日历设置',NULL,'/navigation_html/First/7-RunMaintain/CalenderSettings.jsp',1,0,NULL),(79,72,'仪器运行率标准',NULL,'/navigation_html/First/7-RunMaintain/OperatingRateStandard.jsp',1,0,NULL),(80,20,'企业信息管理',NULL,'/browseEnt_view.action',1,0,NULL),(81,20,'排水口管理',NULL,'/browseOutfall_view.action',1,0,NULL),(82,20,'进水口管理',NULL,'/browseInlet.action',1,0,NULL),(83,20,'数采仪管理',NULL,'/browseSCY_view.action',1,0,NULL),(84,20,'进排口设置',NULL,'/navigation_html/Second/O&I_Set.html',1,0,NULL),(85,21,'在线列表',NULL,'/navigation_html/First/1-RealTimeMonitoring/OnlineTable.jsp',1,0,NULL),(86,21,'采样控制',NULL,NULL,0,0,NULL),(87,21,'报警管理',NULL,NULL,0,0,NULL),(88,21,'分析统计',NULL,NULL,0,0,NULL),(89,21,'分析统计',NULL,NULL,0,0,NULL),(90,86,'远程控制',NULL,NULL,0,0,NULL),(91,86,'采样计划',NULL,NULL,0,0,NULL),(92,86,'超标采样标准',NULL,NULL,0,0,NULL),(93,86,'采样任务查询',NULL,NULL,0,0,NULL),(94,86,'采样任务下达',NULL,NULL,0,0,NULL),(95,87,'报警日志',NULL,NULL,0,0,NULL),(96,87,'门禁管理',NULL,NULL,0,0,NULL),(97,88,'月报',NULL,NULL,0,0,NULL),(98,88,'季报',NULL,NULL,0,0,NULL),(99,88,'自定义报表',NULL,NULL,0,0,NULL),(100,88,'采样数据',NULL,NULL,0,0,NULL),(102,22,'框架管理',NULL,NULL,0,0,NULL),(103,22,'权限管理',NULL,NULL,0,0,NULL),(104,102,'模块管理','module:listModule','/systemManage/frameworkManage/moduleManage.jsp',1,0,''),(106,103,'角色列表','role:list','/systemManage/authManage/roleManage.jsp',1,0,''),(107,103,'用户列表','user:list','/systemManage/authManage/userManage.jsp',1,0,''),(108,22,'运行管理','',NULL,0,0,NULL),(109,108,'在线用户','onlineUser:list','/systemManage/runManage/onlineUser.jsp',1,0,''),(113,103,'角色增加','role:add','',1,1,''),(114,102,'导航增加','module:add','',1,1,''),(115,102,'模块删除','module:delete','',1,1,''),(116,102,'模块更新','module:update','',1,1,''),(117,102,'模块下属权限列表','module:listOps','',1,1,''),(118,102,'导航更新','navigation:update','',1,1,''),(119,102,'导航管理','navigation:listRoleAuths','/systemManage/frameworkManage/navManage.jsp',1,0,'由角色名得到对应导航列表'),(120,103,'角色增加','role:add','',1,1,''),(121,103,'角色删除','role:delete','',1,1,''),(122,103,'角色更新','role:update','',1,1,''),(123,103,'用户增加','user:add','',1,1,''),(124,103,'用户删除','user:delete','',1,1,''),(125,103,'用户更新','user:update','',1,1,''),(126,103,'用户修改角色','user:modifyRoles','',1,1,''),(128,108,'下线用户','onlineUser:stop','',1,1,''),(129,23,'在线列表','onlineUser:list','/navigation_html/First/1-RealTimeMonitoring/OnlineTable.jsp',1,0,NULL);
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
  `ent_no` int(11) DEFAULT NULL,
  `role_cn_name` varchar(45) DEFAULT NULL COMMENT '备注',
  `comment` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`id`),
  UNIQUE KEY `id_UNIQUE` (`id`),
  UNIQUE KEY `role_name_index` (`role_name`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,0,'admin',104,'超级管理员','test'),(2,0,'guest',NULL,'陌生',''),(6,58,'pepa',NULL,'省级环保局','provience environmental protection agency'),(7,58,'bgbxg',101,'宝钢不锈钢公司','宝钢不锈钢公司人员'),(8,58,'zhgy',109,'中海工业上海长兴','中海工业上海长兴');
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
  PRIMARY KEY (`id`),
  KEY `module_op_uuid_fk_idx` (`module_id`),
  KEY `role_module_idx` (`role_id`,`module_id`),
  CONSTRAINT `module_id_fk` FOREIGN KEY (`module_id`) REFERENCES `module` (`id`),
  CONSTRAINT `role_fk` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`) ON DELETE NO ACTION ON UPDATE NO ACTION
) ENGINE=InnoDB AUTO_INCREMENT=2755 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role_auth`
--

LOCK TABLES `role_auth` WRITE;
/*!40000 ALTER TABLE `role_auth` DISABLE KEYS */;
INSERT INTO `role_auth` VALUES (2708,1,31),(2709,1,32),(2710,1,33),(2711,1,34),(2712,1,35),(2713,1,36),(2714,1,37),(2715,1,38),(2716,1,39),(2717,1,40),(2718,1,41),(2719,1,62),(2720,1,63),(2721,1,64),(2722,1,65),(2723,1,66),(2724,1,67),(2725,1,68),(2726,1,73),(2727,1,74),(2728,1,75),(2729,1,76),(2730,1,77),(2731,1,78),(2732,1,79),(2733,1,80),(2734,1,81),(2735,1,82),(2736,1,83),(2737,1,84),(2738,1,85),(2739,1,104),(2740,1,106),(2741,1,107),(2742,1,109),(2743,1,113),(2744,1,114),(2745,1,115),(2746,1,116),(2747,1,117),(2748,1,118),(2749,1,119),(2750,1,120),(2751,1,121),(2752,1,122),(2753,1,123),(2754,1,126),(2706,1,128),(2707,1,129),(278,2,106),(279,2,109),(251,6,104),(252,6,106),(254,6,107),(256,6,109),(257,6,113),(258,6,117),(259,6,120),(260,6,121),(261,6,122),(262,6,123),(263,6,124),(264,6,125),(265,6,126),(250,6,128),(275,7,107),(274,7,119),(281,8,104),(282,8,107),(280,8,117);
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
) ENGINE=InnoDB AUTO_INCREMENT=83 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role_user`
--

LOCK TABLES `role_user` WRITE;
/*!40000 ALTER TABLE `role_user` DISABLE KEYS */;
INSERT INTO `role_user` VALUES (74,1,58),(79,8,64),(80,2,65),(82,7,63);
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
) ENGINE=InnoDB AUTO_INCREMENT=66 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (58,'liqiang','45a1698c81c21c326a67b79395c760a81c59984f37239efb6c9de98a734fe0672ea778221b08acb5013b09f9c020e8d7ccbb58efbb199b05a6f480cbfb32b6a3','2018-05-01 17:12:41','李强',1,'18340861214','','1214098151@qq.com','2018-05-05 15:55:48','0d24d04d0817786295de47aa93addb0d',1),(63,'bgbxg','fc5a3f3d9248e7bfad22a750cfb4bba7868a5bcc60669e35e7f158920952d55a7a576c6f41891ffba795017587b4dea97957ab2324de076d3867255ad28c56b2','2018-05-06 15:31:31','宝钢不锈钢公司',1,'18340861214','','1214098151@qq.com','2018-05-11 23:23:47','d49dc9a00f213853f0c90c220723d8cf',1),(64,'zhgy','1b4c197fefe78ca615079d3f0a1904efe4dc62d096261e0eeb402b9c20ddc481654d934b3f73b468ca794bf8f89efd04c51fb25b59fce5bb7ba2040e3fe4e66f','2018-05-06 15:43:43','中海工业上海长兴',1,'18340861214','','1214098151@qq.com','2018-05-06 15:43:43','8e84f1409659e8aeb5e3fdd48f49b154',1),(65,'guest','dab286753ae1243927edfed77020e76cdc33836bc5e45a2cbc1fc33eac0b731bd88e78f62dd15fa3a2de1c5d7a45ed2d0b29e785b079956796dcfd2f6bd6acc6','2018-05-06 17:29:08','guest',0,'18340861214','','1214098151@qq.com','2018-05-06 17:29:08','c8693a304c415890c8fc211b23a574c3',1);
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

-- Dump completed on 2018-06-14 11:32:03
