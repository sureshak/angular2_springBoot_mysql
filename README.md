# angular2_springBoot_mysql

##spring-boot-demo (API service)
	Code written in spring-boot framework. make application run on a port ( Here it is 8080 ).
	Example URL : http://localhost:8080 

##angular-demo (Front end)
  This is the source code for angular 2 front end application. Run this app in a port except 8080 (Here it is 4203,Mentioned in spring ArticleController).
  	Example URL : http://localhost:4200


MySQL database schema : 

##run the following commands in mysql.

CREATE DATABASE IF NOT EXISTS `concretepage`;
USE `concretepage`;
CREATE TABLE IF NOT EXISTS `articles` (
  `article_id` int(5) NOT NULL AUTO_INCREMENT,
  `title` varchar(200) NOT NULL,
  `category` varchar(100) NOT NULL,
  `author` varchar(100) NOT NULL,
  PRIMARY KEY (`article_id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=latin1;


INSERT INTO `articles` (`article_id`, `title`, `category`,`author`) VALUES
	(1, 'A', 'Angular','test1'),
	(2, 'S', 'Spring Boot',`test2`),
	(3, 'J', 'Java',`test3`),
	(4, 'A', 'Android',`test4`); 