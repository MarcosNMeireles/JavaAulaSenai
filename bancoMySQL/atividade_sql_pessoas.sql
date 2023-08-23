CREATE DATABASE  IF NOT EXISTS `atividade_sql` /*!40100 DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci */ /*!80016 DEFAULT ENCRYPTION='N' */;
USE `atividade_sql`;
-- MySQL dump 10.13  Distrib 8.0.33, for Win64 (x86_64)
--
-- Host: localhost    Database: atividade_sql
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
-- Table structure for table `pessoas`
--

DROP TABLE IF EXISTS `pessoas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pessoas` (
  `nome` varchar(100) DEFAULT NULL,
  `idade` int DEFAULT NULL,
  `telefone` varchar(15) DEFAULT NULL,
  `endereço` varchar(550) DEFAULT NULL,
  `email` varchar(60) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pessoas`
--

LOCK TABLES `pessoas` WRITE;
/*!40000 ALTER TABLE `pessoas` DISABLE KEYS */;
INSERT INTO `pessoas` VALUES ('Kevin Carlos Eduardo Corte Real',40,'6138899757','QS 501 393 Samambaia Sul, Brasilia - DF','kevin_carlos_cortereal@globo.com'),('Gael Gabriel Severino da Mata',67,'6139651122','Quadra QS 1029 Conjunto 3 numero 261,Samambaia Norte Brasília -DF  ','gaelgabrieldamata@ramiresmotors.com.br'),('Raquel Aurora Mariane de Paula',59,'6139695796','Quadra QSC 19 Chácara 27 Conjunto B numero 803 Brasília -DF','raquel.aurora.depaula@geometrabte.com.br'),('Isis Emilly Daiane Ramos',25,'6129001336','Conjunto SHA Conjunto 3 Chácara 83B numero 635 SH Arniqueira, Águas Claras, Brasília - DF','isis-ramos75@trincheira.com.br'),('Joana Carolina Isadora Barbosa',47,'6126861483','Trecho Trecho 03 Chácara 130, 589 Setor de Habitações Individuais Norte Brasília -DF','joana_carolina_barbosa@macroengenharia.com'),('Raimundo Miguel Cardoso',55,'61999390400','Quadra 31 numero 543,Vila São José (São Sebastião) Brasília -DF','raimundo-cardoso96@nipnet.com.br'),('Erick Iago Luiz Cavalcanti',35,'61986837281','Quadra CSC 3, 549, Taguatinga Sul Brasília - DF','erick.iago.cavalcanti@dhl.com'),('Kaique Carlos Eduardo Fernando Barros',57,'61981449922','Quadra Quadra 1 Chácara 3A, 291,Veredas (Brazlândia) Brasília - DF','kaique_barros@sebrace.com.br'),('Otávio Sérgio Diego Sales',56,'61997090014','Condomínio Solar de Brasília, 447, Setor Habitacional Jardim Botânico, Brasília - DF','otavio@gastrolight.com.br'),('Paulo Benjamin Thomas Assunção',25,'61986668688','Quadra Quadra 217 Conjunto 2, 780,Samambaia Norte Brasília - DF','paulo-assuncao95@vitacard.com.br'),('Márcia Fátima Souza',39,'61991403924','Núcleo Rural Incra 6, 500,Brazlândia, Brasília - DF','marciaf@gastrolight.com.br'),('Nelson Marcelo Heitor Araújo',25,'61989112801','Quadra QN 26 Conjunto 2 631,Riacho Fundo II Brasília - DF','nelson_araujo@gastrolight.com.br'),('Sueli Letícia Alves',48,'6199410-2786','Quadra CSG 6, 653,Taguatinga Sul Taguatinga Brasília - DF','suelileticiaalves@afujita.com.br'),('Heloise Brenda da Silva',25,'6199308-4049','Quadra QR 117 Conjunto Q 974, Santa Maria, Brasília - DF','nossoemail@gmail.com'),('Sueli Letícia Alves',48,'6199410-2786','Quadra CSG 6, 653,Taguatinga Sul Taguatinga Brasília - DF','email@gmail.com'),('Heloise Brenda da Silva',25,'6199308-4049','Quadra QR 117 Conjunto Q 974, Santa Maria, Brasília - DF','nossoemail@gmail.com');
/*!40000 ALTER TABLE `pessoas` ENABLE KEYS */;
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
