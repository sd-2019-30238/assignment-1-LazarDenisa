-- phpMyAdmin SQL Dump
-- version 4.8.5
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Mar 25, 2019 at 08:54 PM
-- Server version: 10.1.38-MariaDB
-- PHP Version: 7.3.3

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `assignment1`
--

-- --------------------------------------------------------

--
-- Table structure for table `accounts`
--

CREATE TABLE `accounts` (
  `ID_ACCOUNT` int(11) NOT NULL,
  `USERNAME` varchar(20) NOT NULL,
  `PASSWORD` varchar(20) NOT NULL,
  `PAY_PLAN_TYPE` varchar(2) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `accounts`
--

INSERT INTO `accounts` (`ID_ACCOUNT`, `USERNAME`, `PASSWORD`, `PAY_PLAN_TYPE`) VALUES
(111, 'acristea', 'cristeaa23', 'w'),
(154, 'dpop', 'popd15', 'w'),
(256, 'irotaru', 'rotarui20', 'w'),
(333, 'mdeleanu', 'deleanum67', 'y'),
(345, 'mionescu', 'ionescum29', 'y'),
(444, 'cmeleanu', 'meleanuc23', 'w'),
(767, 'amanea', 'maneaa12', 'w'),
(789, 'cmarcu', 'marcuc', 'm'),
(888, 'ateleanu', 'teleanua46', 'm'),
(999, 'mtomescu', 'tomescum45', 'w');

-- --------------------------------------------------------

--
-- Table structure for table `books`
--

CREATE TABLE `books` (
  `ISBN` int(11) NOT NULL,
  `TITLE` varchar(20) NOT NULL,
  `AUTHOR` varchar(20) NOT NULL,
  `GENRE` varchar(20) NOT NULL,
  `AVAILABILITY` tinyint(1) NOT NULL,
  `RELEASE_DATE` int(5) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `books`
--

INSERT INTO `books` (`ISBN`, `TITLE`, `AUTHOR`, `GENRE`, `AVAILABILITY`, `RELEASE_DATE`) VALUES
(1, 'AnotherCountry', 'JamesBaldwin', 'novel', 1, 1962),
(2, 'LuckyMan', 'JamelBrinkley', 'novel', 1, 1945),
(3, 'Moments', 'ChristinaMeyer', 'romance', 1, 1989),
(4, 'Waterfalls', 'JamesPreston', 'sf', 1, 1997),
(5, 'WarAndPeace', 'KarrenPotter', 'sf', 1, 1976),
(6, 'AStateOfMind', 'JansKlausser', 'novel', 1, 1990),
(7, 'Laugh', 'ChristinaAnders', 'lifestyle', 1, 2009),
(8, 'BeHappy', 'MichaelBotsky', 'lifestyle', 1, 2010),
(9, 'SpaceAndventures', 'JacobClerk', 'sf', 1, 2014),
(10, 'Adeventurous', 'AndrewTomey', 'novel', 1, 2018),
(11, 'HumanBeings', 'KourtneyMiks', 'spirituality', 1, 2000),
(12, 'Laugh', 'TerriBobby', 'lifestyle', 1, 1965),
(13, 'TravelTheSea', 'RobinFarrel', 'novel', 1, 2004),
(14, 'SpaceX', 'JamesCarden', 'sf', 1, 1987),
(15, 'Buddha', 'Shrinivasa', 'spirituality', 1, 1998),
(16, 'GrowYourIncome', 'MichaelTodd', 'lifestyle', 1, 2017),
(17, 'LearnToLove', 'KassandraBarnes', 'romance', 1, 1999),
(18, 'TryAndSucceed', 'TravisManders', 'lifestyle', 1, 2001),
(19, 'BabyCare', 'Monica', 'Hill', 1, 2008),
(20, 'WarNight', 'ChristenMayer', 'novel', 1, 1934);

-- --------------------------------------------------------

--
-- Table structure for table `payment_plans`
--

CREATE TABLE `payment_plans` (
  `PAY_PLAN_TYPE` varchar(2) NOT NULL,
  `AMOUNT` int(11) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `payment_plans`
--

INSERT INTO `payment_plans` (`PAY_PLAN_TYPE`, `AMOUNT`) VALUES
('m', 80),
('w', 20),
('y', 960);

-- --------------------------------------------------------

--
-- Table structure for table `staff_members`
--

CREATE TABLE `staff_members` (
  `ID_STAFF` int(11) NOT NULL,
  `FIRST_NAME` varchar(20) NOT NULL,
  `LAST_NAME` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `staff_members`
--

INSERT INTO `staff_members` (`ID_STAFF`, `FIRST_NAME`, `LAST_NAME`) VALUES
(111, 'Monica', 'Toma'),
(222, 'Mihai', 'Alexandrescu');

-- --------------------------------------------------------

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `ID` int(11) NOT NULL,
  `AGE` int(11) NOT NULL,
  `FIRST_NAME` varchar(20) NOT NULL,
  `LAST_NAME` varchar(20) NOT NULL,
  `ID_ACCOUNT` int(11) NOT NULL,
  `Address` varchar(20) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `users`
--

INSERT INTO `users` (`ID`, `AGE`, `FIRST_NAME`, `LAST_NAME`, `ID_ACCOUNT`, `Address`) VALUES
(1, 15, 'Dennis', 'Pop', 154, 'Cibin9'),
(2, 20, 'Ioana', 'Rotaru', 256, 'Morii87'),
(3, 29, 'Matei', 'Ionescu', 345, 'Crinului76'),
(4, 23, 'Cristina', 'Marcu', 789, 'Papadiei34'),
(5, 23, 'Antonia', 'Cristea', 111, 'Brancusi87'),
(6, 67, 'Maria', 'Deleanu', 333, 'Rapsodiei9'),
(7, 12, 'Andreea', 'Manea', 767, 'Muncitorilor45'),
(8, 45, 'Mihai', 'Tomescu', 999, 'Ighisului4'),
(9, 23, 'Cristian', 'Melean', 444, 'Marului90'),
(10, 46, 'Andra', 'Teleanu', 888, 'Ciresilor67');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `accounts`
--
ALTER TABLE `accounts`
  ADD PRIMARY KEY (`ID_ACCOUNT`);

--
-- Indexes for table `books`
--
ALTER TABLE `books`
  ADD UNIQUE KEY `ISBN` (`ISBN`);

--
-- Indexes for table `payment_plans`
--
ALTER TABLE `payment_plans`
  ADD PRIMARY KEY (`PAY_PLAN_TYPE`);

--
-- Indexes for table `staff_members`
--
ALTER TABLE `staff_members`
  ADD PRIMARY KEY (`ID_STAFF`);

--
-- Indexes for table `users`
--
ALTER TABLE `users`
  ADD PRIMARY KEY (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
