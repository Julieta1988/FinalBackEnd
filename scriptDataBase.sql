-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: bvszyy2abeemvafqvbpw-mysql.services.clever-cloud.com:3306
-- Generation Time: Jun 26, 2023 at 11:59 PM
-- Server version: 8.0.15-5
-- PHP Version: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bvszyy2abeemvafqvbpw`
--

-- --------------------------------------------------------

--
-- Table structure for table `aptitudes`
--

CREATE TABLE `aptitudes` (
  `id` int(11) NOT NULL,
  `aptitud` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `aptitudes`
--

INSERT INTO `aptitudes` (`id`, `aptitud`) VALUES
(1, 'Web Services API'),
(2, 'Soporte técnico'),
(3, 'Soporte API'),
(4, 'Testing'),
(5, 'Administración de incidencias/gestión de bugs'),
(6, 'Planificación, gestión y ejecución de casos de prueba'),
(7, 'Gestión Operativa'),
(8, 'Documentación técnica');

-- --------------------------------------------------------

--
-- Table structure for table `experiencia`
--

CREATE TABLE `experiencia` (
  `id` int(11) NOT NULL,
  `duracion` varchar(255) DEFAULT NULL,
  `empresa` varchar(255) DEFAULT NULL,
  `fin` varchar(255) DEFAULT NULL,
  `inicio` varchar(255) DEFAULT NULL,
  `puesto` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `experiencia`
--

INSERT INTO `experiencia` (`id`, `duracion`, `empresa`, `fin`, `inicio`, `puesto`) VALUES
(2, '5 años', 'Mercado Libre SRL', '2018', '2013', 'Analista ssr IT'),
(3, '4 años', 'Neosur SA', '2012', '2008', 'Analista jr');

-- --------------------------------------------------------

--
-- Table structure for table `formacion`
--

CREATE TABLE `formacion` (
  `id` int(11) NOT NULL,
  `descripcion` varchar(255) DEFAULT NULL,
  `institucion` varchar(255) DEFAULT NULL,
  `titulo` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `formacion`
--

INSERT INTO `formacion` (`id`, `descripcion`, `institucion`, `titulo`) VALUES
(2, 'Estudios en curso', 'INTI Ministerio de Desarrollo', 'Programador web full stack jr'),
(3, 'Estudios en curso', 'UTN FRC', 'Ingeniería en Sistemas de Información');

-- --------------------------------------------------------

--
-- Table structure for table `idioma`
--

CREATE TABLE `idioma` (
  `id` int(11) NOT NULL,
  `idioma` varchar(255) DEFAULT NULL,
  `nivel` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `idioma`
--

INSERT INTO `idioma` (`id`, `idioma`, `nivel`) VALUES
(1, 'Inglés', 'Nivel A1 (MCER)'),
(2, 'Portugués', 'Nivel A2-B1.1 (MCER)');

-- --------------------------------------------------------

--
-- Table structure for table `persona`
--

CREATE TABLE `persona` (
  `id` int(11) NOT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  `imagen` varchar(255) DEFAULT NULL,
  `presentacion` varchar(350) CHARACTER SET utf8 COLLATE utf8_general_ci DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `persona`
--

INSERT INTO `persona` (`id`, `nombre`, `imagen`, `presentacion`) VALUES
(26, 'Julieta Rosende', 'https://i.ibb.co/LhWjvjK/Rosende.jpg', 'Soy fan de la computadora, la tecnología, las fotografías, la naturaleza... Prolija, detallista, doy lo mejor de mí en cada cosa que hago. Considero que el trabajo en equipo es la clave, por lo que disfruto de trabajar y propiciar un liviano y cómodo clima laboral');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `aptitudes`
--
ALTER TABLE `aptitudes`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `experiencia`
--
ALTER TABLE `experiencia`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `formacion`
--
ALTER TABLE `formacion`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `idioma`
--
ALTER TABLE `idioma`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `persona`
--
ALTER TABLE `persona`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `aptitudes`
--
ALTER TABLE `aptitudes`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=47;

--
-- AUTO_INCREMENT for table `experiencia`
--
ALTER TABLE `experiencia`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;

--
-- AUTO_INCREMENT for table `formacion`
--
ALTER TABLE `formacion`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=50;

--
-- AUTO_INCREMENT for table `idioma`
--
ALTER TABLE `idioma`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=31;

--
-- AUTO_INCREMENT for table `persona`
--
ALTER TABLE `persona`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
