CREATE DATABASE  IF NOT EXISTS `banco_trabalho` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `banco_trabalho`;
-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: banco_trabalho
-- ------------------------------------------------------
-- Server version	8.0.33

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `agendamentos`
--

DROP TABLE IF EXISTS `agendamentos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `agendamentos` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `data` varchar(255) DEFAULT NULL,
  `hora` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `cliente_id` bigint DEFAULT NULL,
  `medico_id` bigint DEFAULT NULL,
  `procedimento_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKbwg0xnsp8mxtf0933d39hlg40` (`cliente_id`),
  KEY `FKfj1lnopsp4evv1wngb4gjnh3w` (`medico_id`),
  KEY `FK7rmsektddgh35bxllqmbl73xa` (`procedimento_id`),
  CONSTRAINT `FK7rmsektddgh35bxllqmbl73xa` FOREIGN KEY (`procedimento_id`) REFERENCES `procedimento` (`id`),
  CONSTRAINT `FKbwg0xnsp8mxtf0933d39hlg40` FOREIGN KEY (`cliente_id`) REFERENCES `cliente` (`id`),
  CONSTRAINT `FKfj1lnopsp4evv1wngb4gjnh3w` FOREIGN KEY (`medico_id`) REFERENCES `medico` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `agendamentos`
--

LOCK TABLES `agendamentos` WRITE;
/*!40000 ALTER TABLE `agendamentos` DISABLE KEYS */;
INSERT INTO `agendamentos` VALUES (1,'2023-09-01','10:00:00',NULL,1,1,1),(2,'2023-09-02','15:30:00',NULL,2,2,2),(3,'2023-09-03','09:45:00',NULL,3,3,3),(4,'2023-09-04','14:15:00',NULL,4,4,4),(5,'2023-09-05','11:30:00',NULL,5,5,5),(6,'2023-09-06','13:00:00',NULL,6,6,6),(7,'2023-09-07','16:00:00',NULL,7,7,7),(8,'2023-09-08','10:30:00',NULL,8,8,8),(9,'2023-09-09','15:00:00',NULL,9,9,9),(10,'2023-09-10','14:45:00',NULL,10,10,10);
/*!40000 ALTER TABLE `agendamentos` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-08-22 21:42:49
