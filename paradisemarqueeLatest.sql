-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 09, 2024 at 11:56 PM
-- Server version: 10.4.28-MariaDB
-- PHP Version: 8.2.4

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `paradisemarquee`
--

-- --------------------------------------------------------

--
-- Table structure for table `booking`
--

CREATE TABLE `booking` (
  `user_id` int(16) NOT NULL,
  `booking_id` int(16) NOT NULL,
  `event_type` varchar(16) NOT NULL,
  `date` date NOT NULL,
  `slot` varchar(16) NOT NULL,
  `meal` varchar(10) NOT NULL,
  `attendees` int(150) NOT NULL,
  `price` int(11) NOT NULL,
  `status` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `booking`
--

INSERT INTO `booking` (`user_id`, `booking_id`, `event_type`, `date`, `slot`, `meal`, `attendees`, `price`, `status`) VALUES
(58, 645, 'Corporate event', '2024-01-11', 'slot1', 'true', 55, 58500, 'Cancelled'),
(58, 9, 'Corporate event', '2024-01-11', 'slot2', 'true', 45, 46500, 'booked'),
(58, 196, 'Corporate event', '2024-01-13', 'slot1', 'true', 66, 66200, 'Fulfilled'),
(36, 327, 'Birthday Party', '2024-01-17', 'slot1', 'true', 20, 34000, 'Cancelled');

-- --------------------------------------------------------

--
-- Table structure for table `userinfo`
--

CREATE TABLE `userinfo` (
  `email` varchar(30) DEFAULT NULL,
  `ID` int(10) NOT NULL,
  `username` varchar(16) NOT NULL,
  `password` varchar(16) NOT NULL,
  `adminstatus` int(2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `userinfo`
--

INSERT INTO `userinfo` (`email`, `ID`, `username`, `password`, `adminstatus`) VALUES
('abc@gmail.com', 58, 'sameer', 'aaski@786', 0),
('qwe@gmail.com', 36, 'sameer2', 'aaski@123', 0);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
