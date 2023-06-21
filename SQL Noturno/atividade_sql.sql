create database atividade_sql;
use atividade_sql;
create table pessoas(
nome varchar (50),
idade int,
telefone varchar(10),
endereço varchar(80),
email varchar(30)
);
INSERT INTO pessoas VALUES("Jose Maria Trindade", 65, "2345-6789", "rua perigo nº 70","jose@trindade.com"), 
("Maria", 70, 'F', 56),
("Morgana", 50, 'F', 98),
("Cristiano Ronaldo", 35, 'M', 110);
