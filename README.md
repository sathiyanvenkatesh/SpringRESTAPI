# SpringRESTAPI
Sample project to create SpringRESTAPI with HIBERNATE .

Database Setup
Here  am using MySql DB .
 MySql script to create a simple database and table structure to be used in our application,
 simply paste the script in query editor and run to make a DB skeleton.


--Cretae New DB -employee_db
CREATE DATABASE IF NOT EXISTS `employee_db` /*!40100 DEFAULT CHARACTER SET latin1 */;
USE `employee_db`;
-- Dumping structure for table employee_db.employee
CREATE TABLE IF NOT EXISTS `employee` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT,
  `first_name` varchar(45) DEFAULT NULL,
  `last_name` varchar(45) DEFAULT NULL,
  `email` varchar(45) DEFAULT NULL,
  `phone` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=latin1;

-- Dumping data for table employee_db.employee: ~1 rows (approximately)
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` (`id`, `first_name`, `last_name`, `email`, `phone`) VALUES
 (2, 'Foo', 'Foo2', 'Foo@gmail.com', '90908989899');
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
/*!40014 SET FOREIGN_KEY_CHECKS=1 */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;

