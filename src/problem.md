####1、遇到的问题
1.1代码生成器报NullPointingException
* mysql和mybatis驱动不匹配，修改改最新版本号即可
~~~~   <dependency>
        <groupId>mysql</groupId>
        <artifactId>mysql-connector-java</artifactId>
        <version>8.0.25</version>
        <scope>runtime</scope>
        </dependency>
~~~~
1.2 push到github上报连接异常
* 在凭证管理中删除github凭证

1.3 sql脚本
````
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
````
