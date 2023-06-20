CREATE DATABASE banco_teste;
USE banco_teste;

CREATE TABLE pessoa(
	nome VARCHAR(50),
    idade INT,
    sexo CHAR(1),
    peso DOUBLE
);

desc pessoa;

INSERT INTO pessoa VALUES ("marcos Nunes", 41, 'm', 90);

SELECT * FROM pessoa;