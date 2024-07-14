-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jul 14, 2024 at 03:05 PM
-- Server version: 10.4.14-MariaDB
-- PHP Version: 7.4.11

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `javaproject`
--

-- --------------------------------------------------------

--
-- Table structure for table `#mysql50#regestration (2)`
--
-- Error reading structure for table javaproject.#mysql50#regestration (2): #1932 - Table 'javaproject.#mysql50#regestration (2)' doesn't exist in engine
-- Error reading data for table javaproject.#mysql50#regestration (2): #1064 - You have an error in your SQL syntax; check the manual that corresponds to your MariaDB server version for the right syntax to use near 'FROM `javaproject`.`#mysql50#regestration (2)`' at line 1

-- --------------------------------------------------------

--
-- Table structure for table `#mysql50#regestration (3)`
--
-- Error reading structure for table javaproject.#mysql50#regestration (3): #1932 - Table 'javaproject.#mysql50#regestration (3)' doesn't exist in engine
-- Error reading data for table javaproject.#mysql50#regestration (3): #1064 - You have an error in your SQL syntax; check the manual that corresponds to your MariaDB server version for the right syntax to use near 'FROM `javaproject`.`#mysql50#regestration (3)`' at line 1

-- --------------------------------------------------------

--
-- Table structure for table `regestration`
--

CREATE TABLE `regestration` (
  `pid` int(25) NOT NULL,
  `pname` varchar(255) NOT NULL,
  `price` int(25) NOT NULL,
  `qty` int(25) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `regestration`
--

INSERT INTO `regestration` (`pid`, `pname`, `price`, `qty`) VALUES
(1, 'tv', 54321, 2),
(2, 'Laptop', 48500, 1),
(3, 'elecric fan', 5000, 2),
(4, 'chairs', 500, 1),
(5, 'ola', 35000, 1),
(6, 'macbook', 150000, 1),
(7, 'scooter', 150000, 1),
(8, 'Fridge', 45000, 1),
(10, 'atharva', 800000, 1),
(11, 'siddhi', 100, 1);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `regestration`
--
ALTER TABLE `regestration`
  ADD PRIMARY KEY (`pid`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `regestration`
--
ALTER TABLE `regestration`
  MODIFY `pid` int(25) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
