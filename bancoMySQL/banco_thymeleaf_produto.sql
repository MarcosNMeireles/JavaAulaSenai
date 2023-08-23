CREATE DATABASE  IF NOT EXISTS `banco_thymeleaf` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `banco_thymeleaf`;
-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: banco_thymeleaf
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
-- Table structure for table `produto`
--

DROP TABLE IF EXISTS `produto`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `produto` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `descricao_produto` varchar(255) DEFAULT NULL,
  `nome` varchar(255) DEFAULT NULL,
  `preco` double NOT NULL,
  `quantidade` int NOT NULL,
  `url_imagem` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `produto`
--

LOCK TABLES `produto` WRITE;
/*!40000 ALTER TABLE `produto` DISABLE KEYS */;
INSERT INTO `produto` VALUES (1,'mini projetor xing ling','projeto',1820.55,5,'https://m.media-amazon.com/images/I/51pYdXOwLWL._AC_UF1000,1000_QL80_.jpg'),(2,'mini projetor xing ling','projeto',1820.55,5,'https://m.media-amazon.com/images/I/51pYdXOwLWL._AC_UF1000,1000_QL80_.jpg'),(3,'pedra de marte','pedra',58.85,25,'https://images.tcdn.com.br/img/img_prod/1125932/pedra_quartzo_verde_bruta_100g_1029_2_001f0af503309f99dd46af2e5c6da01a.jpg'),(4,'pedra de marte','pedra',58.85,25,'https://images.tcdn.com.br/img/img_prod/1125932/pedra_quartzo_verde_bruta_100g_1029_2_001f0af503309f99dd46af2e5c6da01a.jpg'),(5,'Incrível carro azul','Carro Azul',25.68,58,'https://cdn.awsli.com.br/600x450/1997/1997350/produto/1120922019f0b2f6e92.jpg'),(6,'aula de capoeira','Capoeira',0,0,'https://s5.static.brasilescola.uol.com.br/be/2023/02/a-capoeira-contem-uma-diversidade-de-tipos-de-movimentos-corporais-em-sua-pratica.jpg'),(7,'jogo de tabuleiro','Jogo War',0,20,'https://s2.glbimg.com/JBBjHPLTikoYpMEfX19B5cVN60E=/s.glbimg.com/jo/g1/f/original/2015/10/01/wardigital.jpg');
/*!40000 ALTER TABLE `produto` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2023-08-22 21:42:50
