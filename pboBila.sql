-- phpMyAdmin SQL Dump
-- version 5.0.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost
-- Generation Time: Apr 12, 2021 at 06:07 AM
-- Server version: 10.4.17-MariaDB
-- PHP Version: 8.0.1

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `pboBila`
--

-- --------------------------------------------------------

--
-- Table structure for table `cat`
--

CREATE TABLE `cat` (
  `id_breed` int(11) NOT NULL,
  `breed` varchar(100) NOT NULL,
  `colour` varchar(100) NOT NULL,
  `gender` varchar(100) NOT NULL,
  `price` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cat`
--

INSERT INTO `cat` (`id_breed`, `breed`, `colour`, `gender`, `price`) VALUES
(1, 'jewji', 'jjewjj', 'ojoein', 100),
(10, 'newfii', 'ijiewfiji', 'ijfeji', 1000),
(15, 'iewifiji', 'idjwqiij', 'ijijijewqijij', 199),
(100, 'kucing1', 'kuning', 'gaada', 10000);

-- --------------------------------------------------------

--
-- Table structure for table `cute`
--

CREATE TABLE `cute` (
  `ID_Breed` int(11) NOT NULL,
  `Breed` varchar(255) NOT NULL,
  `Nama` varchar(255) NOT NULL,
  `Notelp` varchar(255) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `cute`
--

INSERT INTO `cute` (`ID_Breed`, `Breed`, `Nama`, `Notelp`) VALUES
(1, 'Breed', 'ojoro', 'owefo'),
(10, 'Breed', 'oodqwjo', 'ooweqoo'),
(15, 'Breed', 'iifjewi', 'ifij3qiw'),
(100, 'Breed', 'Bintang', '098083287');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `cat`
--
ALTER TABLE `cat`
  ADD PRIMARY KEY (`id_breed`);

--
-- Indexes for table `cute`
--
ALTER TABLE `cute`
  ADD PRIMARY KEY (`ID_Breed`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
