-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Dec 12, 2023 at 02:06 AM
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
-- Database: `tinvat`
--

-- --------------------------------------------------------

--
-- Table structure for table `company`
--

CREATE TABLE `company` (
  `id` int(11) NOT NULL,
  `tinnumber` varchar(100) NOT NULL,
  `companyname` varchar(100) NOT NULL,
  `ogs1` tinyint(1) NOT NULL,
  `mc1` tinyint(1) NOT NULL,
  `ss1` tinyint(1) NOT NULL,
  `psp1` tinyint(1) NOT NULL,
  `ni1` tinyint(1) NOT NULL,
  `pb1` tinyint(1) NOT NULL,
  `ogs2` tinyint(1) NOT NULL,
  `mc2` tinyint(1) NOT NULL,
  `ss2` tinyint(1) NOT NULL,
  `psp2` tinyint(1) NOT NULL,
  `ni2` tinyint(1) NOT NULL,
  `pb2` tinyint(1) NOT NULL,
  `ogs3` tinyint(1) NOT NULL,
  `mc3` tinyint(1) NOT NULL,
  `ss3` tinyint(1) NOT NULL,
  `psp3` tinyint(1) NOT NULL,
  `ni3` tinyint(1) NOT NULL,
  `pb3` tinyint(1) NOT NULL,
  `ogs4` tinyint(1) NOT NULL,
  `mc4` tinyint(1) NOT NULL,
  `ss4` tinyint(1) NOT NULL,
  `psp4` tinyint(1) NOT NULL,
  `ni4` tinyint(1) NOT NULL,
  `pb4` tinyint(1) NOT NULL,
  `ogs5` tinyint(1) NOT NULL,
  `mc5` tinyint(1) NOT NULL,
  `ss5` tinyint(1) NOT NULL,
  `psp5` tinyint(1) NOT NULL,
  `ni5` tinyint(1) NOT NULL,
  `pb5` tinyint(1) NOT NULL,
  `ogs6` tinyint(1) NOT NULL,
  `mc6` tinyint(1) NOT NULL,
  `ss6` tinyint(1) NOT NULL,
  `psp6` tinyint(1) NOT NULL,
  `ni6` tinyint(1) NOT NULL,
  `pb6` tinyint(1) NOT NULL,
  `ogs7` tinyint(1) NOT NULL,
  `mc7` tinyint(1) NOT NULL,
  `ss7` tinyint(1) NOT NULL,
  `psp7` tinyint(1) NOT NULL,
  `ni7` tinyint(1) NOT NULL,
  `pb7` tinyint(1) NOT NULL,
  `ogs8` tinyint(1) NOT NULL,
  `mc8` tinyint(1) NOT NULL,
  `ss8` tinyint(1) NOT NULL,
  `psp8` tinyint(1) NOT NULL,
  `ni8` tinyint(1) NOT NULL,
  `pb8` tinyint(1) NOT NULL,
  `osg9` tinyint(1) NOT NULL,
  `mc9` tinyint(1) NOT NULL,
  `ss9` tinyint(1) NOT NULL,
  `psp9` tinyint(1) NOT NULL,
  `ni9` tinyint(1) NOT NULL,
  `pb9` tinyint(1) NOT NULL,
  `ogs10` tinyint(1) NOT NULL,
  `mc10` tinyint(1) NOT NULL,
  `ss10` tinyint(1) NOT NULL,
  `psp10` tinyint(1) NOT NULL,
  `ni10` tinyint(1) NOT NULL,
  `pb10` tinyint(1) NOT NULL,
  `gs2` tinyint(1) NOT NULL,
  `br` tinyint(1) NOT NULL,
  `tin` tinyint(1) NOT NULL,
  `vat` tinyint(1) NOT NULL,
  `vattext` varchar(100) NOT NULL,
  `form1` tinyint(1) NOT NULL,
  `leas` tinyint(1) NOT NULL,
  `leastext` varchar(100) NOT NULL,
  `ownercon` tinyint(1) NOT NULL,
  `form13` tinyint(1) NOT NULL,
  `form20` tinyint(1) NOT NULL,
  `form3` tinyint(1) NOT NULL,
  `cebbill` tinyint(1) NOT NULL,
  `front` tinyint(1) NOT NULL,
  `bank` tinyint(1) NOT NULL,
  `route` tinyint(1) NOT NULL,
  `mobilecon` tinyint(1) NOT NULL,
  `marriage` tinyint(1) NOT NULL,
  `commenttext` varchar(100) NOT NULL,
  `contactnumber` varchar(11) NOT NULL,
  `status` varchar(100) NOT NULL,
  `expirdate` date NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `company`
--

INSERT INTO `company` (`id`, `tinnumber`, `companyname`, `ogs1`, `mc1`, `ss1`, `psp1`, `ni1`, `pb1`, `ogs2`, `mc2`, `ss2`, `psp2`, `ni2`, `pb2`, `ogs3`, `mc3`, `ss3`, `psp3`, `ni3`, `pb3`, `ogs4`, `mc4`, `ss4`, `psp4`, `ni4`, `pb4`, `ogs5`, `mc5`, `ss5`, `psp5`, `ni5`, `pb5`, `ogs6`, `mc6`, `ss6`, `psp6`, `ni6`, `pb6`, `ogs7`, `mc7`, `ss7`, `psp7`, `ni7`, `pb7`, `ogs8`, `mc8`, `ss8`, `psp8`, `ni8`, `pb8`, `osg9`, `mc9`, `ss9`, `psp9`, `ni9`, `pb9`, `ogs10`, `mc10`, `ss10`, `psp10`, `ni10`, `pb10`, `gs2`, `br`, `tin`, `vat`, `vattext`, `form1`, `leas`, `leastext`, `ownercon`, `form13`, `form20`, `form3`, `cebbill`, `front`, `bank`, `route`, `mobilecon`, `marriage`, `commenttext`, `contactnumber`, `status`, `expirdate`) VALUES
(1, '112', 'aaa', 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, '2023.2.3', 1, 1, '2023.4.6', 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, '', '705635410', 'Draft', '0000-00-00'),
(2, '1234', 'inoth', 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, '2023/09/21', 1, 1, '', 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 'hello inoth', '7045785', 'Accept', '2023-12-14'),
(3, '', '', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, '', 0, 0, '', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, '', '', '-Select-', '2023-12-08'),
(4, '', '', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, '', 0, 0, '', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, '', '', '-Select-', '2023-12-08'),
(5, '', '', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, '', 0, 0, '', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, '', '', '-Select-', '2023-12-08'),
(6, '12345', 'inoth', 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, '', 0, 0, '', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, '', '', 'Check Again', '0000-00-00'),
(7, '22222', 'test1', 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, '2023/04/3 im', 1, 1, '2023/4/8', 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, '', '0705635410', 'Accept', '2023-12-08'),
(8, '11111', 'test2', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, '', 0, 0, '', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, '', '', '-Select-', '0000-00-00'),
(9, '12345', 'inoth', 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, '', 0, 0, '', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, '', '', 'Check Again', '0000-00-00'),
(10, '', '', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, '', 0, 0, '', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, '', '', '-Select-', '2023-12-08'),
(11, '1032245', 'inoth(pvt)', 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, '2024/04/09', 1, 0, '', 1, 0, 1, 0, 1, 1, 1, 1, 1, 1, 'leas', '0705635410', 'Draft', '0000-00-00'),
(12, '1234', 'inoth', 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, '2023/09/21', 1, 1, '', 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 'hello inoth', '7045785', 'Accept', '2023-12-14'),
(13, '66666', '', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, '', 0, 0, '', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, '', '', '-Select-', '0000-00-00'),
(14, '1234', 'inoth', 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, '2023/09/21', 1, 1, '', 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 'hello inoth', '7045785', 'Accept', '2023-12-14'),
(15, '88888', '', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, '', 0, 0, '', 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, '', '', '-Select-', '0000-00-00');

-- --------------------------------------------------------

--
-- Table structure for table `log`
--

CREATE TABLE `log` (
  `fn` varchar(100) NOT NULL,
  `ln` varchar(100) NOT NULL,
  `un` varchar(100) NOT NULL,
  `pw` varchar(100) NOT NULL,
  `rpw` varchar(100) NOT NULL,
  `address` varchar(250) NOT NULL,
  `type` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `log`
--

INSERT INTO `log` (`fn`, `ln`, `un`, `pw`, `rpw`, `address`, `type`) VALUES
('inoth', 'bb', '0', 'aa', 'aa', 'aa', 'Admin'),
('inoth', 'vishwajith', '0', '123', '123', 'matara', 'Employee'),
('aa', 'aa', '0', 'aa', 'aa', 'aa', 'Admin'),
('inoth', 'inoth', '0', 'a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3', '123', 'matara', 'Admin'),
('inoth', 'vishwajith', 'inoth', 'a665a45920422f9d417e4867efdc4fb8a04a1f3fff1fa07e998e86f7f7a27ae3', '123', 'matara', 'Admin');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `company`
--
ALTER TABLE `company`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `company`
--
ALTER TABLE `company`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=16;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
