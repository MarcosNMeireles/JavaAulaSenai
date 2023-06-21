#cria o banco com o nome 
CREATE DATABASE banco_teste;

#define o banco a ser utilizado, colocando em uso
USE banco_teste;

#cria a tabela
CREATE TABLE pessoa(
	nome VARCHAR(50),
    idade INT,
    sexo CHAR(1),
    peso DOUBLE
);

#descreve a tabela
desc pessoa;

#insere o produto na tabela
INSERT INTO pessoa VALUES ("marcos Nunes", 41, 'm', 90);

INSERT INTO pessoa (nome, idade) VALUES ("Marcos Nunes", 41);

INSERT INTO pessoa VALUES  ("JOSE", 65, 'M',70),
("MARIA de lourdes da silva", 70,'F',56),
("MORGANA", 50, 'F', 98),
("CRISTIANO", 35,'M', 110);

INSERT INTO pessoa VALUES ("MARIA de lourdes da silva", 70,'F',56);
#pesquisa todos os dados da tabela
SELECT * FROM pessoa;

#seleciona apenas o campo nome na tabela pessoa onde a idade for igual a 41
select nome from pessoa where idade = 41;

select sexo from pessoa where nome = "marcos Nunes";

select sexo from pessoa where nome like "%lourdes%";

select * from pessoa where sexo = 'm' or idade > 41;

select * from pessoa where sexo = 'm' and idade >= 41;

select count(*) from pessoa;

select count(*) as "Quantidade de Pessoas" from pessoa;

create table produto (
	descricaoProduto varchar(100),
    #quando há o parentes indica a quantidade de casas (total) e a quantidade de numeros 
    #após a virgula que será mostrado
	preco double (6,2),
    #enum é um tipo de dado com opções pré definidas
    status_pedido enum("entregue", "preparando", "saiu para entrega")
);
#para acessar o dado do enum, podemos usar o nome da opção ou a casa que ele ocupa (indice), começando com o numeral 1
insert into produto values ("sanduba", 9.5632, "entregue");
select * from produto;
