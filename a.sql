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

CREATE DATABASE /*!32312 IF NOT EXISTS*/ `sth` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ ;

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


/*!40000 ALTER TABLE `bank_deposits` DISABLE KEYS */;
INSERT INTO `bank_deposits` VALUES (4,'2019-10-10',6),(123456789,'2019-10-11',9);
/*!40000 ALTER TABLE `bank_deposits` ENABLE KEYS */;


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
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `credit`
--


/*!40000 ALTER TABLE `credit` DISABLE KEYS */;
INSERT INTO `credit` VALUES (1,976547808,'2019-10-02',1),(2,1234,'2019-10-16',2),(3,1234,'2019-10-16',2),(4,9876876,'2011-06-08',2),(5,1234,'2019-10-16',2),(6,1234,'2019-10-16',2),(7,976547808,'2019-10-02',1),(8,0,'2019-10-09',1),(9,111222,'2019-10-09',1);
/*!40000 ALTER TABLE `credit` ENABLE KEYS */;


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
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `customer`
--


/*!40000 ALTER TABLE `customer` DISABLE KEYS */;
INSERT INTO `customer` VALUES ('Dhruva','asdfg','ASDFg12345','123456789012','1234567890','cscs@gmail.com',1,'halwa','pata nahi'),('pappu','mahajan','ASDFg12345','123456789012','1234567890','b@gmail.com',2,'pune','tyres'),('Dhruva','Mahajan','1234567890','123456789012','758813460','d@gmail.com',3,'pune','stock market'),('','','','','','',4,'',''),('','','','','','',5,'',''),('shivam','Mahajan','ASDFg12345','123456789012','7588813460','sda@gmail.com',6,'mumbai','top coder'),('Krishna','Teja','ASDFg12345','123456789012','1234567890','sdha@gmail.com',7,'afnbaidn','slkdcnsljdc'),('asdf','ssdas','adad','asdaf','asda','sdfs@gmail.com',8,'sdsf','sdfs');
/*!40000 ALTER TABLE `customer` ENABLE KEYS */;


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
) ENGINE=InnoDB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `delivery`
--


/*!40000 ALTER TABLE `delivery` DISABLE KEYS */;
INSERT INTO `delivery` VALUES (1,'pata nahi','2019-10-10','2019-10-01',2,'MH19AP1234');
/*!40000 ALTER TABLE `delivery` ENABLE KEYS */;

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
  `password` varchar(250) DEFAULT NULL,
  PRIMARY KEY (`empID`),
  UNIQUE KEY `username` (`username`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--


/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (NULL,NULL,'admin',NULL,NULL,0,6,NULL,'dhruvaMahajan',0,'$2a$10$yJ.ERtspsaH6YDdWz/WInOWNaf5jmHVzC9xxEnV7jmLUJ0iOiOxnq'),('Robin','Saxena','employee','2019-10-16','1234567890',1234,8,'patna','robinSaxena',0,'$2a$10$M07lMj8F5sxzfWmT1y819Ozyijkdh2TxzSn2d9N65Xa0Ez0f9b5RK'),('prabhash','kumar','employee','2019-10-03','6789012345',11223344,9,'bokharo','prabhashKumar',0,'$2a$10$Dhh23mXAGFU8MkchZtYBCembqZjKvvrP.rG1t6M8teT30exOYOcwe');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;

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


/*!40000 ALTER TABLE `inventory` DISABLE KEYS */;
INSERT INTO `inventory` VALUES (1,23,'XLRI250+'),(2,6,'ASDF5678'),(4,144,'CFTHN123');
/*!40000 ALTER TABLE `inventory` ENABLE KEYS */;

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


/*!40000 ALTER TABLE `location` DISABLE KEYS */;
INSERT INTO `location` VALUES (1,1,'XLRI250+'),(2,1,'ASDF5678'),(3,1,'CFTHN123');
/*!40000 ALTER TABLE `location` ENABLE KEYS */;

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
  `custID` int(11) DEFAULT NULL,
  `modelNo` varchar(25) DEFAULT NULL,
  `quantity` int(11) DEFAULT NULL,
  PRIMARY KEY (`orderID`),
  KEY `custID` (`custID`),
  KEY `modelNo` (`modelNo`),
  CONSTRAINT `orders_ibfk_1` FOREIGN KEY (`custID`) REFERENCES `customer` (`custid`) ON DELETE CASCADE ON UPDATE CASCADE,
  CONSTRAINT `orders_ibfk_2` FOREIGN KEY (`modelNo`) REFERENCES `tyre` (`modelno`) ON DELETE CASCADE ON UPDATE CASCADE
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `orders`
--


/*!40000 ALTER TABLE `orders` DISABLE KEYS */;
INSERT INTO `orders` VALUES (1,123,492,'cash','delivered',1,'ASDF5678',4),(2,123,8989890,'cash','pending',2,'CFTHN123',10),(3,12,246,'cash','delivered',1,'ASDF5678',2);
/*!40000 ALTER TABLE `orders` ENABLE KEYS */;

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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supplier`
--


/*!40000 ALTER TABLE `supplier` DISABLE KEYS */;
INSERT INTO `supplier` VALUES ('robin','saxena','3456789012','r@gmail.com',1,'patna'),('ramkrishna','pandey','4567890123','rm@gmail.com',2,'jalgaon'),('dhruva','mahajan','1234567890','a@gmail.com',3,'mumbai');
/*!40000 ALTER TABLE `supplier` ENABLE KEYS */;

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
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `todo`
--


/*!40000 ALTER TABLE `todo` DISABLE KEYS */;
INSERT INTO `todo` VALUES (3,'2019-12-22','2019-02-11','get things done',9);
/*!40000 ALTER TABLE `todo` ENABLE KEYS */;

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
  `isTubeless` varchar(25) DEFAULT NULL,
  `price` int(11) DEFAULT NULL,
  `percentDiscount` int(11) DEFAULT NULL,
  PRIMARY KEY (`modelNo`),
  UNIQUE KEY `modelNo` (`modelNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tyre`
--


/*!40000 ALTER TABLE `tyre` DISABLE KEYS */;
INSERT INTO `tyre` VALUES ('ARUN2269','motor cycle','plain','yes',1100,10),('ASDF5678','bike','straight cut','0',123,10),('CFTHN123','three wheeler','radial','1',898989,5),('XLRI250+','tractor','radial','1',5678,9);
/*!40000 ALTER TABLE `tyre` ENABLE KEYS */;

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
  PRIMARY KEY (`vehicleNo`),
  UNIQUE KEY `vehicleNo` (`vehicleNo`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehicle`
--


/*!40000 ALTER TABLE `vehicle` DISABLE KEYS */;
INSERT INTO `vehicle` VALUES ('MH12AQ3456','2018-01-03',4321,1),('MH12QW1234','2019-10-09',10101,101),('MH19AP1234','2019-03-01',12345,12);
/*!40000 ALTER TABLE `vehicle` ENABLE KEYS */;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2019-11-10 21:28:04
