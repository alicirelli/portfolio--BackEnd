-- MySQL dump 10.13  Distrib 8.0.29, for Linux (x86_64)
--
-- Host: localhost    Database: PORTFOLIO_WEB
-- ------------------------------------------------------
-- Server version	8.0.29-0ubuntu0.22.04.2

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8mb4 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `Educacion`
--

DROP TABLE IF EXISTS `Educacion`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Educacion` (
  `Id` int NOT NULL,
  `Id_Persona` int DEFAULT NULL,
  `Carrera` text,
  `Institucion` text,
  `Fecha_Inicio` year DEFAULT NULL,
  `Fecha_Fin` year DEFAULT NULL,
  `is_Certificacion` tinyint(1) NOT NULL,
  PRIMARY KEY (`Id`),
  KEY `Id_Persona` (`Id_Persona`),
  CONSTRAINT `Educacion_ibfk_1` FOREIGN KEY (`Id_Persona`) REFERENCES `Persona` (`Id_Persona`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Educacion`
--

LOCK TABLES `Educacion` WRITE;
/*!40000 ALTER TABLE `Educacion` DISABLE KEYS */;
INSERT INTO `Educacion` VALUES (0,0,'Licenciatura en Criminalistica','Instituto de la Policia Federal Argentina',2015,2022,0),(1,0,'Bachiller en Gestion Empresarial','Centro de Educacion Media N°70',2009,2013,0),(2,0,'Administracion y Contabilidad para No Especialistas','Universidad Tecnolígica Nacional',2020,2021,1);
/*!40000 ALTER TABLE `Educacion` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Historia_Laboral`
--

DROP TABLE IF EXISTS `Historia_Laboral`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Historia_Laboral` (
  `Id` int NOT NULL,
  `Id_Persona` int DEFAULT NULL,
  `Puesto` text,
  `Empresa` text,
  `Fecha_Inicio` year DEFAULT NULL,
  `Fecha_Fin` year DEFAULT NULL,
  `Descripcion` text,
  PRIMARY KEY (`Id`),
  KEY `Id_Persona` (`Id_Persona`),
  CONSTRAINT `Historia_Laboral_ibfk_1` FOREIGN KEY (`Id_Persona`) REFERENCES `Persona` (`Id_Persona`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Historia_Laboral`
--

LOCK TABLES `Historia_Laboral` WRITE;
/*!40000 ALTER TABLE `Historia_Laboral` DISABLE KEYS */;
INSERT INTO `Historia_Laboral` VALUES (0,0,'Encargada de Deposito','Huella Sagrada Distribuidora',2021,2022,'Desempeño en fraccionamiento y envasado de alimentos, armado de pedidos y control de stock en distribuidora de alimentos'),(1,0,'Venta y Atencion al Publico','ChacaPhone',2020,2021,'Desempeño en venta y atencion al publico, carga de stock y mercaderia, manejo de caja chica para local de telefonia y accesorios'),(2,0,'Gestion Administrativa','Cirelli Aberturas',2014,2015,'Desempeño en administracion de recursos, gestion de personal, atencion al publico para importante metalurgica del sur argentino');
/*!40000 ALTER TABLE `Historia_Laboral` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Idiomas`
--

DROP TABLE IF EXISTS `Idiomas`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Idiomas` (
  `Id` int NOT NULL,
  `Id_Persona` int NOT NULL,
  `Idioma` text,
  `Nivel` text,
  PRIMARY KEY (`Id`),
  KEY `Id_Persona` (`Id_Persona`),
  CONSTRAINT `Idiomas_ibfk_1` FOREIGN KEY (`Id_Persona`) REFERENCES `Persona` (`Id_Persona`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Idiomas`
--

LOCK TABLES `Idiomas` WRITE;
/*!40000 ALTER TABLE `Idiomas` DISABLE KEYS */;
INSERT INTO `Idiomas` VALUES (0,0,'Español','Nativo'),(1,0,'Ingles','Basico'),(2,0,'Frances','Basico');
/*!40000 ALTER TABLE `Idiomas` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Persona`
--

DROP TABLE IF EXISTS `Persona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Persona` (
  `Id_Persona` int NOT NULL,
  `Nombre` varchar(50) NOT NULL,
  `Apellido` varchar(50) NOT NULL,
  `Profesion` varchar(50) NOT NULL,
  `Imagen` text NOT NULL,
  `Banner` text NOT NULL,
  PRIMARY KEY (`Id_Persona`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Persona`
--

LOCK TABLES `Persona` WRITE;
/*!40000 ALTER TABLE `Persona` DISABLE KEYS */;
INSERT INTO `Persona` VALUES (0,'alina','cirelli','full stack developer jr','../../../assets/fotoperfil.jpeg','../../../assets/Diseño sin título(1).png');
/*!40000 ALTER TABLE `Persona` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Proyectos`
--

DROP TABLE IF EXISTS `Proyectos`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Proyectos` (
  `Id` int NOT NULL,
  `Id_Persona` int NOT NULL,
  `Titulo_Proyecto` text,
  `Descripcion` text,
  `Año` year DEFAULT NULL,
  PRIMARY KEY (`Id`),
  KEY `Id_Persona` (`Id_Persona`),
  CONSTRAINT `Proyectos_ibfk_1` FOREIGN KEY (`Id_Persona`) REFERENCES `Persona` (`Id_Persona`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Proyectos`
--

LOCK TABLES `Proyectos` WRITE;
/*!40000 ALTER TABLE `Proyectos` DISABLE KEYS */;
INSERT INTO `Proyectos` VALUES (0,0,'Mi Portfolio WEB','Desarrollamos un portfolio web integrando Angular para FrontEnd y SpringBoot para BackEnd y MySQL como base de datos',2022),(1,0,'Williche','Desarrollamos un sitio web de rapido acceso e informacion basado en HTML, CSS y Boostrap.',2020);
/*!40000 ALTER TABLE `Proyectos` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Skills`
--

DROP TABLE IF EXISTS `Skills`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Skills` (
  `Id` int NOT NULL,
  `Id_Persona` int NOT NULL,
  `Nombre_skill` text NOT NULL,
  `Nivel_skill` int NOT NULL,
  PRIMARY KEY (`Id`),
  KEY `Id_Persona` (`Id_Persona`),
  CONSTRAINT `Skills_ibfk_1` FOREIGN KEY (`Id_Persona`) REFERENCES `Persona` (`Id_Persona`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Skills`
--

LOCK TABLES `Skills` WRITE;
/*!40000 ALTER TABLE `Skills` DISABLE KEYS */;
INSERT INTO `Skills` VALUES (0,0,'Productividad',4),(1,0,'Cooperativismo',4),(2,0,'Gestion',3),(3,0,'Data Entry',3),(4,0,'HTML/CSS',2),(5,0,'Photoshop',3);
/*!40000 ALTER TABLE `Skills` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `Usuarios`
--

DROP TABLE IF EXISTS `Usuarios`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `Usuarios` (
  `Id` int NOT NULL,
  `Id_persona` int NOT NULL,
  `Usuario` varchar(50) NOT NULL,
  `Contraseña` varchar(50) NOT NULL,
  PRIMARY KEY (`Id`),
  KEY `Id_persona` (`Id_persona`),
  CONSTRAINT `Usuarios_ibfk_1` FOREIGN KEY (`Id_persona`) REFERENCES `Persona` (`Id_Persona`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `Usuarios`
--

LOCK TABLES `Usuarios` WRITE;
/*!40000 ALTER TABLE `Usuarios` DISABLE KEYS */;
/*!40000 ALTER TABLE `Usuarios` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2022-07-25 17:52:41
