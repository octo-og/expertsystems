-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 30, 2023 at 12:51 PM
-- Server version: 10.4.27-MariaDB
-- PHP Version: 8.0.25

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `expert`
--

-- --------------------------------------------------------

--
-- Table structure for table `product`
--

CREATE TABLE `product` (
  `name` varchar(30) NOT NULL,
  `size` decimal(10,4) NOT NULL,
  `weight` double(10,4) NOT NULL,
  `price` decimal(10,4) NOT NULL,
  `colour` varchar(30) NOT NULL,
  `productID` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `product`
--

-- --------------------------------------------------------

--
-- Table structure for table `product_to_assess`
--

CREATE TABLE `product_to_assess` (
  `name` varchar(30) NOT NULL,
  `size` decimal(10,4) NOT NULL,
  `weight` double(10,4) NOT NULL,
  `price` decimal(10,4) NOT NULL,
  `colour` varchar(30) NOT NULL,
  `productID` int(3) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `product_to_assess`
--

-- --------------------------------------------------------

--
-- Table structure for table `responder`
--

CREATE TABLE `responder` (
  `working` int(1) NOT NULL,
  `workplace` int(1) NOT NULL,
  `student` int(1) NOT NULL,
  `levelofstudy` int(1) NOT NULL,
  `residence` int(1) NOT NULL,
  `whatsapp` int(1) NOT NULL,
  `instagram` int(1) NOT NULL,
  `tweeter` int(1) NOT NULL,
  `facebook` int(1) NOT NULL,
  `tiktok` int(1) NOT NULL,
  `willing` int(1) NOT NULL,
  `able` int(1) NOT NULL,
  `responderID` int(10) NOT NULL,
  `productID` varchar(10) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `responder`
--


--
-- Indexes for dumped tables
--

--
-- Indexes for table `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`productID`);

--
-- Indexes for table `responder`
--
ALTER TABLE `responder`
  ADD PRIMARY KEY (`responderID`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `product`
--
ALTER TABLE `product`
  MODIFY `productID` int(3) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=0;

--
-- AUTO_INCREMENT for table `responder`
--
ALTER TABLE `responder`
  MODIFY `responderID` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=0;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
