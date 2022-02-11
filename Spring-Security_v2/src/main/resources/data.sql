drop database if exists spring_security_aToZ;
create database spring_security_aToZ;

use spring_security_aToZ;

drop table if exists users;
drop table if exists authorities;

create table users(
id int not null auto_increment,
username varchar(45) not null,
password varchar(45) not null,
enabled INT NOT NULL,
primary key(id));

CREATE TABLE authorities (
  id int NOT NULL AUTO_INCREMENT,
  username varchar(45) NOT NULL,
  authority varchar(45) NOT NULL,
  PRIMARY KEY (id));
  
INSERT ignore INTO users VALUES (null, 'sekh', '12345', '1');
INSERT IGNORE INTO authorities VALUES (NULL, 'sekh', 'write');

CREATE TABLE customer (
  id int NOT NULL AUTO_INCREMENT,
  email varchar(45) NOT NULL,
  pwd varchar(45) NOT NULL,
  role varchar(45) NOT NULL,
  PRIMARY KEY (`id`)
);

INSERT INTO customer (`email`, `pwd`, `role`)
 VALUES ('sekh@example.com', '54321', 'admin');
