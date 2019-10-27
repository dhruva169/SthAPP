-- MySQL dump 10.13  Distrib 8.0.12, for macos10.13 (x86_64)
--
-- Host: localhost    Database: sth
-- ------------------------------------------------------
-- Server version	8.0.12

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
 SET NAMES utf8mb4 ;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Current Database: `sth`
--

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `sth` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */;

USE `sth`;

--
-- Table structure for table `bank_deposits`
--

DROP TABLE IF EXISTS `bank_deposits`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `bank_deposits` (
  `amountDeposited` int(11) DEFAULT NULL,
  `depositDate` varchar(20) NOT NULL,
  `empID` int(11) DEFAULT NULL,
  PRIMARY KEY (`depositDate`),
  UNIQUE KEY `depositDate` (`depositDate`),
  KEY `empID` (`empID`),
  CONSTRAINT `bank_deposits_ibfk_1` FOREIGN KEY (`empID`) REFERENCES `employee` (`empid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bank_deposits`
--

LOCK TABLES `bank_deposits` WRITE;
/*!40000 ALTER TABLE `bank_deposits` DISABLE KEYS */;
INSERT INTO `bank_deposits` VALUES (1,'2019-01-01',1),(2300,'2019-02-01',2),(3200,'2019-03-01',2),(4000,'2019-03-03',1),(123098,'2019-06-05',2);
/*!40000 ALTER TABLE `bank_deposits` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `credit`
--

DROP TABLE IF EXISTS `credit`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `credit` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `amount` int(11) DEFAULT NULL,
  `dueDate` varchar(20) DEFAULT NULL,
  `custID` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `custID` (`custID`),
  CONSTRAINT `credit_ibfk_1` FOREIGN KEY (`custID`) REFERENCES `customer` (`custid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `credit`
--

LOCK TABLES `credit` WRITE;
/*!40000 ALTER TABLE `credit` DISABLE KEYS */;
INSERT INTO `credit` VALUES (1,976547808,'2019-10-02',1),(2,1234,'2019-10-16',2),(3,1234,'2019-10-16',2),(4,1,'2019-06-13',2),(5,1234,'2019-10-16',2),(6,1234,'2019-10-16',2),(7,976547808,'2019-10-02',1);
/*!40000 ALTER TABLE `credit` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `customer`
--

DROP TABLE IF EXISTS `customer`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `customer` (
  `fname` varchar(25) DEFAULT NULL,
  `lname` varchar(25) DEFAULT NULL,
  `panNo` char(10) DEFAULT NULL,
  `aadharNo` char(12) DEFAULT NULL,
  `phoneNo` char(10) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `custID` int(11) NOT NULL AUTO_INCREMENT,
  `address` varchar(200) DEFAULT NULL,
  `businessType` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`custID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--

LOCK TABLES `customer` WRITE;
/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES ('umesh','mahajan','ASDFg12345','123456789012','9370000660','a@gmail.com',1,'jalgaon','sand'),('pappu','mahajan','ASDFg12345','123456789012','1234567890','b@gmail.com',2,'pune','tyres'),('Dhruva','Mahajan','1234567890','123456789012','758813460','d@gmail.com',3,'pune','stock market');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `delivery`
--

DROP TABLE IF EXISTS `delivery`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `delivery` (
  `deliveryID` int(11) NOT NULL AUTO_INCREMENT,
  `deliveryAddress` varchar(200) DEFAULT NULL,
  `dateOfDelivery` varchar(20) DEFAULT NULL,
  `dateOfOrderPlaced` varchar(20) DEFAULT NULL,
  `orderID` int(11) DEFAULT NULL,
  `vehicleNo` varchar(10) DEFAULT NULL,
  PRIMARY KEY (`deliveryID`),
  KEY `orderID` (`orderID`),
  KEY `vehicleNo` (`vehicleNo`),
  CONSTRAINT `delivery_ibfk_1` FOREIGN KEY (`orderID`) REFERENCES `orders` (`orderid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `delivery_ibfk_2` FOREIGN KEY (`vehicleNo`) REFERENCES `vehicle` (`vehicleno`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `delivery`
--

LOCK TABLES `delivery` WRITE;
/*!40000 ALTER TABLE `delivery` DISABLE KEYS */;
INSERT INTO `delivery` VALUES (1,'jalgaon','2019-08-23','2019--8-20',2,'MH19AP1234'),(2,'mumbai','2019-10-01','2019-10-02',2,'MH19AP1234');
/*!40000 ALTER TABLE `delivery` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `employee` (
  `fname` varchar(25) DEFAULT NULL,
  `lname` varchar(25) DEFAULT NULL,
  `designation` varchar(25) DEFAULT NULL,
  `joiningDate` varchar(20) DEFAULT NULL,
  `phoneNo` char(10) DEFAULT NULL,
  `salary` int(11) DEFAULT NULL,
  `empID` int(11) NOT NULL AUTO_INCREMENT,
  `address` varchar(200) DEFAULT NULL,
  `username` varchar(20) DEFAULT NULL,
  `enabled` tinyint(1) DEFAULT NULL,
  `password` varchar(100) DEFAULT NULL,
  PRIMARY KEY (`empID`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES ('Dhruva','Mahajan','admin','2015-03-04','7588813460',2000,1,'jalgaon','admin',1,'admin'),('Raja','Baidyo','employee','2014-02-23','1234567890',1200,2,'pasighat','Accountant',1,'Accountant'),('dhruva','mahajan','employee','2019-10-01','7588813460',121212,3,'pune','macd',1,'macd'),('raja','baidyo','employee','2332-02-11','3567897653',12345,4,'arunachal','raja',1,'raja'),('rahul','pandey','employee','2016-02-10','5678764567',34564,5,'varanasi','pandey',1,'pandey');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `empRoles`
--

DROP TABLE IF EXISTS `empRoles`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `empRoles` (
  `appRoleID` int(11) NOT NULL AUTO_INCREMENT,
  `roleName` varchar(20) DEFAULT NULL,
  PRIMARY KEY (`appRoleID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `empRoles`
--

LOCK TABLES `empRoles` WRITE;
/*!40000 ALTER TABLE `empRoles` DISABLE KEYS */;
INSERT INTO `empRoles` VALUES (1,'admin'),(2,'user');
/*!40000 ALTER TABLE `empRoles` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `inventory`
--

DROP TABLE IF EXISTS `inventory`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `inventory` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `quantity` int(11) DEFAULT NULL,
  `modelNo` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `modelNo` (`modelNo`),
  CONSTRAINT `inventory_ibfk_1` FOREIGN KEY (`modelNo`) REFERENCES `tyre` (`modelno`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `inventory`
--

LOCK TABLES `inventory` WRITE;
/*!40000 ALTER TABLE `inventory` DISABLE KEYS */;
INSERT INTO `inventory` VALUES (1,23,'XLRI250+'),(2,12,'ASDF5678'),(4,1234,'CFTHN123');
/*!40000 ALTER TABLE `inventory` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `location`
--

DROP TABLE IF EXISTS `location`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `location` (
  `locationID` int(11) NOT NULL AUTO_INCREMENT,
  `shelfNo` int(11) DEFAULT NULL,
  `modelNo` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`locationID`),
  KEY `modelNo` (`modelNo`),
  CONSTRAINT `location_ibfk_1` FOREIGN KEY (`modelNo`) REFERENCES `tyre` (`modelno`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `location`
--

LOCK TABLES `location` WRITE;
/*!40000 ALTER TABLE `location` DISABLE KEYS */;
INSERT INTO `location` VALUES (1,1,'XLRI250+'),(2,1,'ASDF5678'),(3,3,'CFTHN123');
/*!40000 ALTER TABLE `location` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `order_items`
--

DROP TABLE IF EXISTS `order_items`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `order_items` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `quantity` int(11) DEFAULT NULL,
  `amount` int(11) DEFAULT NULL,
  `modelNo` varchar(25) DEFAULT NULL,
  `orderID` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `modelNo` (`modelNo`),
  KEY `orderID` (`orderID`),
  CONSTRAINT `order_items_ibfk_1` FOREIGN KEY (`modelNo`) REFERENCES `tyre` (`modelno`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `order_items_ibfk_2` FOREIGN KEY (`orderID`) REFERENCES `orders` (`orderid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `order_items`
--

LOCK TABLES `order_items` WRITE;
/*!40000 ALTER TABLE `order_items` DISABLE KEYS */;
INSERT INTO `order_items` VALUES (1,2,123,'ASDF5678',2),(2,1,5678,'XLRI250+',1);
/*!40000 ALTER TABLE `order_items` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `orders`
--

DROP TABLE IF EXISTS `orders`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `orders` (
  `orderID` int(11) NOT NULL AUTO_INCREMENT,
  `overHeadCharges` int(11) DEFAULT NULL,
  `amount` int(11) DEFAULT NULL,
  `paymentMode` varchar(25) DEFAULT NULL,
  `status` varchar(25) DEFAULT NULL,
  `type` varchar(25) DEFAULT NULL,
  PRIMARY KEY (`orderID`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--

LOCK TABLES `orders` WRITE;
/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (1,123,12345,'GPay','delivered','byCustomer'),(2,12,5432,'Cheque','inProcess','toSupplier'),(3,54,1234,'cash','delivered','toSupplier');
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `supplier`
--

DROP TABLE IF EXISTS `supplier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `supplier` (
  `fname` varchar(25) DEFAULT NULL,
  `lname` varchar(25) DEFAULT NULL,
  `phoneNo` varchar(10) DEFAULT NULL,
  `email` varchar(50) DEFAULT NULL,
  `suppID` int(11) NOT NULL AUTO_INCREMENT,
  `address` varchar(200) DEFAULT NULL,
  PRIMARY KEY (`suppID`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supplier`
--

LOCK TABLES `supplier` WRITE;
/*!40000 ALTER TABLE `supplier` DISABLE KEYS */;
INSERT INTO `supplier` VALUES ('robin','saxena','3456789012','r@gmail.com',1,'patna'),('ramkrishna','pandey','4567890123','rm@gmail.com',2,'jalgaon');
/*!40000 ALTER TABLE `supplier` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `todo`
--

DROP TABLE IF EXISTS `todo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `todo` (
  `taskID` int(11) NOT NULL AUTO_INCREMENT,
  `dueDate` varchar(20) DEFAULT NULL,
  `inDate` varchar(20) DEFAULT NULL,
  `task` varchar(1000) DEFAULT NULL,
  `empID` int(11) DEFAULT NULL,
  PRIMARY KEY (`taskID`),
  KEY `empID` (`empID`),
  CONSTRAINT `todo_ibfk_1` FOREIGN KEY (`empID`) REFERENCES `employee` (`empid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `todo`
--

LOCK TABLES `todo` WRITE;
/*!40000 ALTER TABLE `todo` DISABLE KEYS */;
INSERT INTO `todo` VALUES (1,'2019-12-2','2019-12-1','get the job done',2),(2,'2019-10-04','2019-10-01','Revolutinise the business',1);
/*!40000 ALTER TABLE `todo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tyre`
--

DROP TABLE IF EXISTS `tyre`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `tyre` (
  `modelNo` varchar(25) NOT NULL,
  `vehicleType` varchar(25) DEFAULT NULL,
  `design` varchar(25) DEFAULT NULL,
  `isTubeless` tinyint(1) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `percentDiscount` int(11) DEFAULT NULL,
  PRIMARY KEY (`modelNo`),
  UNIQUE KEY `modelNo` (`modelNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tyre`
--

LOCK TABLES `tyre` WRITE;
/*!40000 ALTER TABLE `tyre` DISABLE KEYS */;
INSERT INTO `tyre` VALUES ('ASDF5678','bike','straight cut',0,123,10),('CFTHN123','three wheeler','radial',1,898989,5),('XLRI250+','tractor','radial',1,5678,9);
/*!40000 ALTER TABLE `tyre` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_role`
--

DROP TABLE IF EXISTS `user_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `user_role` (
  `ID` int(11) NOT NULL AUTO_INCREMENT,
  `empID` int(11) DEFAULT NULL,
  `appRoleID` int(11) DEFAULT NULL,
  PRIMARY KEY (`ID`),
  KEY `empID` (`empID`),
  KEY `appRoleID` (`appRoleID`),
  CONSTRAINT `user_role_ibfk_1` FOREIGN KEY (`empID`) REFERENCES `employee` (`empid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `user_role_ibfk_2` FOREIGN KEY (`appRoleID`) REFERENCES `emproles` (`approleid`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_role`
--

LOCK TABLES `user_role` WRITE;
/*!40000 ALTER TABLE `user_role` DISABLE KEYS */;
/*!40000 ALTER TABLE `user_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehicle`
--

DROP TABLE IF EXISTS `vehicle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
 SET character_set_client = utf8mb4 ;
CREATE TABLE `vehicle` (
  `vehicleNo` varchar(10) NOT NULL,
  `dtOfMaintenance` varchar(20) DEFAULT NULL,
  `distanceCovered` int(11) DEFAULT NULL,
  `dieselAvailable` int(11) DEFAULT NULL,
  `isAvailable` tinyint(1) DEFAULT NULL,
  PRIMARY KEY (`vehicleNo`),
  UNIQUE KEY `vehicleNo` (`vehicleNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehicle`
--

LOCK TABLES `vehicle` WRITE;
/*!40000 ALTER TABLE `vehicle` DISABLE KEYS */;
INSERT INTO `vehicle` VALUES ('MH12AQ3456','2018-01-03',4321,1,0),('MH19AP1234','2019-03-01',12345,12,1);
/*!40000 ALTER TABLE `vehicle` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-10-13 16:54:22
