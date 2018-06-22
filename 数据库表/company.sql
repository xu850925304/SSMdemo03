/*
SQLyog Ultimate v8.32 
MySQL - 5.5.56 : Database - company
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`company` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `company`;

/*Table structure for table `attendance` */

DROP TABLE IF EXISTS `attendance`;

CREATE TABLE `attendance` (
  `aid` int(100) NOT NULL AUTO_INCREMENT COMMENT '出勤记录id',
  `aname` varchar(255) DEFAULT NULL COMMENT '员工姓名',
  `areason` varchar(255) DEFAULT NULL COMMENT '缺勤原因',
  `adate` date DEFAULT NULL COMMENT '缺勤日期',
  PRIMARY KEY (`aid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `attendance` */

/*Table structure for table `department` */

DROP TABLE IF EXISTS `department`;

CREATE TABLE `department` (
  `did` int(100) NOT NULL AUTO_INCREMENT COMMENT '部门id',
  `dname` varchar(255) DEFAULT NULL COMMENT '部门名称',
  PRIMARY KEY (`did`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `department` */

/*Table structure for table `employee` */

DROP TABLE IF EXISTS `employee`;

CREATE TABLE `employee` (
  `eid` int(100) NOT NULL AUTO_INCREMENT COMMENT '员工',
  `ename` varchar(255) DEFAULT NULL COMMENT '员工姓名',
  `esex` varchar(255) DEFAULT NULL COMMENT '性别',
  `eemail` varchar(255) DEFAULT NULL COMMENT '邮箱地址',
  `edepartment` varchar(255) DEFAULT NULL COMMENT '所在部门',
  PRIMARY KEY (`eid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `employee` */

/*Table structure for table `employeedetail` */

DROP TABLE IF EXISTS `employeedetail`;

CREATE TABLE `employeedetail` (
  `eid` int(100) NOT NULL AUTO_INCREMENT COMMENT '员工id',
  `ename` varchar(255) DEFAULT NULL COMMENT '员工姓名',
  `esex` varchar(255) DEFAULT NULL COMMENT '性别',
  `email` varchar(255) DEFAULT NULL COMMENT '邮箱',
  `edepartment` varchar(255) DEFAULT NULL COMMENT '部门',
  `eaddress` varchar(255) DEFAULT NULL COMMENT '地址',
  `eage` int(100) DEFAULT NULL COMMENT '年龄',
  `eeducational` varchar(255) DEFAULT NULL COMMENT '学历',
  `ehiredate` date DEFAULT NULL COMMENT '入职时间',
  `epicture` varchar(255) DEFAULT NULL COMMENT '照片',
  `eposition` varchar(255) DEFAULT NULL COMMENT '职位',
  PRIMARY KEY (`eid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `employeedetail` */

/*Table structure for table `leave` */

DROP TABLE IF EXISTS `leave`;

CREATE TABLE `leave` (
  `lid` int(100) NOT NULL AUTO_INCREMENT COMMENT '请假id',
  `lname` varchar(255) DEFAULT NULL COMMENT '请假人姓名',
  `ldate` date DEFAULT NULL COMMENT '请假日期',
  `ltime` varchar(255) DEFAULT NULL COMMENT '请假时间',
  `lreason` varchar(255) DEFAULT NULL COMMENT '请假原因',
  PRIMARY KEY (`lid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `leave` */

/*Table structure for table `reimbursement` */

DROP TABLE IF EXISTS `reimbursement`;

CREATE TABLE `reimbursement` (
  `rid` int(100) NOT NULL AUTO_INCREMENT COMMENT '报销记录id',
  `rname` varchar(255) DEFAULT NULL COMMENT '报销人姓名',
  `rDetailsOfConsumption` varchar(255) DEFAULT NULL COMMENT '详细消费',
  `rdate` date DEFAULT NULL COMMENT '消费日期',
  PRIMARY KEY (`rid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `reimbursement` */

/*Table structure for table `users` */

DROP TABLE IF EXISTS `users`;

CREATE TABLE `users` (
  `uid` int(100) NOT NULL AUTO_INCREMENT COMMENT '用户id',
  `uname` varchar(255) DEFAULT NULL COMMENT '用户名',
  `upwd` varchar(255) DEFAULT NULL COMMENT '密码',
  PRIMARY KEY (`uid`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `users` */

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;
