CREATE DATABASE aula;

use aula; 

SHOW TABLES;

CREATE TABLE login ( 
	id int AUTO_INCREMENT PRIMARY KEY, 
	usuario varchar(20) not null, 
	senha varchar(20) not null); 
	
INSERT INTO login(usuario,senha) VALUES("admin","1234"); 

SELECT * FROM login; 

CREATE TABLE principal ( 
	id int AUTO_INCREMENT PRIMARY KEY, 
	nome varchar(20) not null,
	endereco varchar(20) not null,
	email varchar(20) not null,
	telefone varchar(20) not null,
	cidade varchar(20) not null); 

INSERT INTO principal (nome, endereco, email, telefone, cidade) VALUES ("admin", "rua A", "admnin@mail.com", "111-111", "Metropolis");

SELECT * FROM principal; 