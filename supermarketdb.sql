-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jun 16, 2024 at 09:54 PM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `supermarketdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `orderdetails`
--

CREATE TABLE `orderdetails` (
  `orderID` int(100) NOT NULL,
  `customerName` varchar(50) NOT NULL,
  `contactNumber` int(10) NOT NULL,
  `email` varchar(50) NOT NULL,
  `product` varchar(50) NOT NULL,
  `quantity` int(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `orderdetails`
--

INSERT INTO `orderdetails` (`orderID`, `customerName`, `contactNumber`, `email`, `product`, `quantity`) VALUES
(20, 'Gihan sanjula', 714858298, 'sanjulagihan@gmail.com', 'Yogurt', 10),
(22, 'Nuwan', 1256894, 'piyumantha123@gmail.com', 'Beef Steak', 30),
(23, 'Supun', 1248965, 'nishantha45@gmail.com', 'Cereal', 50),
(24, 'Isuruni', 768621702, 'isuruni28@gmail.com', 'Butter', 50),
(25, 'oshanda', 781333565, 'oshanda2000@gmail.com', 'Butter', 5),
(27, 'Lakshan ', 714858569, 'thenuka@Gmail.com', 'Eggs', 50),
(28, 'nethmi', 7845236, 'nethmi@gmail.com', 'Yogurt', 50);

-- --------------------------------------------------------

--
-- Table structure for table `products`
--

CREATE TABLE `products` (
  `id` int(10) NOT NULL,
  `name` varchar(50) NOT NULL,
  `price` decimal(50,0) NOT NULL,
  `quantity` int(100) NOT NULL,
  `description` text NOT NULL,
  `category` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `products`
--

INSERT INTO `products` (`id`, `name`, `price`, `quantity`, `description`, `category`) VALUES
(17, 'Yogurt', 90, 10, 'made by milk', 'Dairy'),
(19, 'Spinach', 120, 100, 'Fresh spinach leaves', 'Vegetables'),
(20, 'Tomato', 80, 150, 'Ripe red tomatoes', 'Vegetables'),
(22, 'Onion', 50, 180, 'Fresh onions', 'Vegetables'),
(23, 'Beef Steak', 1150, 100, 'Premium beef steak', 'Meat'),
(24, 'Pork Chops', 700, 50, 'Tender pork chops', 'Meat'),
(25, 'Shrimp', 1500, 25, 'Fresh shrimp', 'Seafood'),
(26, 'Cod Fillet', 80, 35, 'Wild-caught cod fillet', 'Seafood'),
(27, 'Bagels', 100, 55, 'Freshly baked bagels', 'Bakery'),
(28, 'Croissant', 150, 50, 'Buttery croissants', 'Bakery'),
(29, 'Cereal', 300, 40, 'Whole grain cereal', 'Grocery'),
(30, 'Pasta', 200, 120, 'Italian pasta', 'Grocery'),
(31, 'Rice', 100, 150, 'Basmati rice', 'Grocery'),
(32, 'Olive Oil', 650, 50, 'Extra virgin olive oil', 'Grocery'),
(34, 'Soda', 150, 100, 'Carbonated soda', 'Beverages'),
(35, 'Coffee', 100, 60, 'Ground coffee beans', 'Beverages'),
(36, 'Green Tea', 500, 70, 'Organic green tea', 'Beverages'),
(37, 'Toothpaste', 250, 80, 'Fluoride toothpaste', 'Personal Care'),
(38, 'Shampoo', 500, 60, 'Herbal shampoo', 'Personal Care'),
(39, 'Body Wash', 400, 70, 'Moisturizing body wash', 'Personal Care'),
(40, 'Laundry Detergent', 800, 40, 'Liquid laundry detergent', 'Household'),
(41, 'Dish Soap', 250, 90, 'Lemon-scented dish soap', 'Household'),
(42, 'Apple', 45, 200, 'Red Apples', 'Fruits'),
(43, 'Vatika Nature Oil', 2350, 100, 'Garlic Enriched Hair Oil', 'Dairy'),
(44, 'Apple', 45, 100, 'red apple', 'Fruits'),
(45, 'pine apple', 80, 200, 'frsh ', 'Fruits');

-- --------------------------------------------------------

--
-- Table structure for table `singup`
--

CREATE TABLE `singup` (
  `id` int(100) NOT NULL,
  `name` varchar(50) NOT NULL,
  `userName` varchar(25) NOT NULL,
  `email` varchar(50) NOT NULL,
  `password` varchar(12) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `singup`
--

INSERT INTO `singup` (`id`, `name`, `userName`, `email`, `password`) VALUES
(1, 'Gihan Sanjula', 'sanjula_77', 'sanjulagihan94@gmail.com', 'Sanjula@4858'),
(2, 'Aruna Shantha', 'aruna123', 'shantha@gmail.com', '5544'),
(3, 'Kamal', 'kaml_00', 'kamal125@gmail.com', '1111'),
(4, 'pasindu', 'priyalanka', 'pas', '2000'),
(5, 'lahiru', 'sampath', 'lahiru@gmail.com', '12345678'),
(6, 'oshanda', 'Kali', 'shandaindeewara2000@gmail.com', '12345'),
(7, 'Nethmi Dilunika', 'Nethu', 'nethmidilunika321@gmail.com', 'Malsha2000#'),
(8, 'Gihan sanjula', 'sanjula77', 'gihan23@gmal.com', '4858@'),
(9, 'Sandaruwan', 'sanjula99', 'giahna23@gmail.com', '4858@'),
(10, 'Gigan Sandaruwan', 'sanjula_88', 'gihan@gmail.com', '12345');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `orderdetails`
--
ALTER TABLE `orderdetails`
  ADD PRIMARY KEY (`orderID`);

--
-- Indexes for table `products`
--
ALTER TABLE `products`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `singup`
--
ALTER TABLE `singup`
  ADD PRIMARY KEY (`id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `orderdetails`
--
ALTER TABLE `orderdetails`
  MODIFY `orderID` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=29;

--
-- AUTO_INCREMENT for table `products`
--
ALTER TABLE `products`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=46;

--
-- AUTO_INCREMENT for table `singup`
--
ALTER TABLE `singup`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=11;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
