# Read Me First
The following was discovered as part of building this project:

* The JVM level was changed from '1.8' to '17', review the [JDK Version Range](https://github.com/spring-projects/spring-framework/wiki/Spring-Framework-Versions#jdk-version-range) on the wiki for more details.

# Getting Started

### Reference Documentation
For further reference, please consider the following sections:

* [Official Apache Maven documentation](https://maven.apache.org/guides/index.html)
* [Spring Boot Maven Plugin Reference Guide](https://docs.spring.io/spring-boot/docs/3.1.0/maven-plugin/reference/html/)
* [Create an OCI image](https://docs.spring.io/spring-boot/docs/3.1.0/maven-plugin/reference/html/#build-image)
* [Spring Web](https://docs.spring.io/spring-boot/docs/3.1.0/reference/htmlsingle/#web)
* [Spring Boot DevTools](https://docs.spring.io/spring-boot/docs/3.1.0/reference/htmlsingle/#using.devtools)

### Guides
The following guides illustrate how to use some features concretely:

* [Building a RESTful Web Service](https://spring.io/guides/gs/rest-service/)
* [Serving Web Content with Spring MVC](https://spring.io/guides/gs/serving-web-content/)
* [Building REST services with Spring](https://spring.io/guides/tutorials/rest/)
* [Accessing data with MySQL](https://spring.io/guides/gs/accessing-data-mysql/)

## 表结构
    CREATE TABLE `m_user`(
	`id` BIGINT (20) NOT NULL AUTO_INCREMENT,
	`username` VARCHAR (64)DEFAULT NULL,
	`avatar` VARCHAR (255) DEFAULT NULL,
	`email` VARCHAR (64) DEFAULT NULL,
	`password` VARCHAR (64)DEFAULT NULL,
	`status` INT(5) NOT NULL,
	`created` DATETIME DEFAULT NULL,
	`last_login` DATETIME DEFAULT NULL,
	PRIMARY KEY( `id` ),
	KEY `UK_USERNAME` (`username`)USING BTREE
	)ENGINE=INNODB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
	
	CREATE TABLE `m_blog`(
	`id` BIGINT (20)NOT NULL AUTO_INCREMENT,
	`user_id` BIGINT (20)NOT NULL,
	`title` VARCHAR (255)NOT NULL,
	`desription` VARCHAR (255) NOT NULL,
	`content` LONGTEXT,
	`created` DATETIME NOT NULL ON UPDATE CURRENT_TIMESTAMP,
	`status` TINYINT (4) DEFAULT NULL,
	PRIMARY KEY ( `id`)
	)ENGINE=INNODB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4;
## 代码