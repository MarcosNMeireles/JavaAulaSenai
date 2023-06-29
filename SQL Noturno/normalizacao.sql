#Criando o banco
create database normalizacao;

#definindo o uso do banco criado
use normalizacao;
#1ª forma normal
/*
para uma tabela estar na primeira forma normal,
é necessário que não existam grupos de valores repetidos,
seus valores devem ser atomicos (únicos) e a tabela 
deve possuir um identificador que identifique o dado como único
*/


#2ª forma normal
/*
Para estar na segunda forma normal os atributos devem
depender da chave primaria em sua 
totalidade não apenas parte dela
*/

#3ª forma normal
/*
Para a tabela estar na terceira forma normal 
ela precisa estar de acordo com a 1ª e a 2ª forma normal
não existir dependencias transitivas
Nenhm atributo não_chave não pode depender de outro atributo não_chave
*/

#1ª forma normal
/*
#1ª forma normal
para uma tabela estar na primeira forma normal,
é necessário que não existam grupos de valores repetidos,
seus valores devem ser atomicos (únicos) e a tabela 
deve possuir um identificador que identifique o dado como único
*/
create table pessoa(
	id integer primary key auto_increment,
	nome varchar(30),
	sobrenome varchar(50),
	idade int,
	sexo varchar(15),
	email varchar(100),
	cpf varchar(14) not null unique,
	cidade varchar(50),
	bairro varchar(50),
	cep varchar(10),
	complemento varchar(100),
	logradouro varchar(100),
	estado varchar(50),
	uf char (2),
	numero varchar(10),
	telefone varchar(16),
	ddd char(3),
	celular varchar(16),
	fixo varchar(16),
	comercial varchar(16)
);
#alterando o nome da coluna com a gráfia errada "enail" para a gráfia correta "email"
alter table pessoa rename column enail to email;

#inserindo os dados na tabela com a 1ª forma normal
INSERT INTO pessoa VALUES (null,"Kevin","Carlos Eduardo",40,"m","kevin_carlos_cortereal@globo.com","123.456.789-10","Brasilia","Samambaia Sul","7223600","Samambaia","minha casa","Distrito Federal","DF","393","38899757","061",null,null,null);

select * from pessoa;

#2ª forma normal
/*
#2ª forma normal
Para estar na segunda forma normal os atributos devem
depender da chave primaria em sua 
totalidade não apenas parte dela
*/

create table pessoa2(
	#definindo a chave primaria, onde ela é auto-incremetada
	idPessoa integer primary key auto_increment,
	nome varchar(50),
	sobrenome varchar(50),
	cpf varchar(14) not null unique,
	sexo varchar(10),
	id_pessoa integer,
    
	#A constraint é para falar que é uma regra a ser seguida
	constraint fk_id_endereco_endereco
    
    #foreign key define que a chave interna (id_pessoa) se trata de uma chave estrangeira, 
    #criando uma correlação com a chave externa (idEndereco)
	foreign key (id_pessoa) references endereco(idEndereco)
);

create table endereco(
	#definindo a chave primaria, onde ela é auto-incremetada
	idEndereco integer primary key auto_increment, 
	cep varchar(13),
	bairro varchar(100),
	cidade varchar(100),
	uf char(2)
);
# inserindo valores na tabela endereço
insert into endereco value(null,"72.200-000","samambaia","brasilia","DF");

# inserindo valores na tabela pessoa2, onde o último campo se refere ao identificador 1 da tabela endereço
insert into pessoa2 values(null,"marcos","meireles","123.456.789-10","masculino",1);

# inserindo valores na tabela endereço
insert into endereco value(null,"72.350-100","Gama","brasilia","DF");
# inserindo valores na tabela pessoa2, onde o último campo se refere ao identificador 2 da tabela endereço
insert into pessoa2 values(null,"pedro","cardoso","987.456.789-10","masculino",2);

# inserindo valores na tabela endereço
insert into endereco value(null,"72.800-101","samambaia","brasilia","DF");
# inserindo valores na tabela pessoa2, onde o último campo se refere ao identificador 3 da tabela endereço
insert into pessoa2 values(null,"Manoel","cardoso","977.466.789-10","masculino",3);

# inserindo valores na tabela endereço
insert into endereco value(null,"72.650-040","samambaia","brasilia","DF");
# inserindo valores na tabela pessoa2, onde o último campo se refere ao identificador 4 da tabela endereço
insert into pessoa2 values(null,"maria","cardoso","654.654.789-10","feminino",4);

#visualizando a tabela pessoa2 por completo
select * from pessoa2;

#visualizando a tabela endereço por completo
select * from endereco;

#fazendo a uniao das duas tabelas existentes pessoa2 e endereço
select * from endereco inner join pessoa2 on endereco.idEndereco=pessoa2.id_pessoa;

#fazendo a uniao das duas tabelas existentes pessoa2 e endereço e exibindo apenas os campos solicitados no inicio.
select nome, cpf, cep, bairro, cidade, uf from pessoa2 inner join endereco on pessoa2.id_pessoa = endereco.idEndereco;

drop table pessoa2;
drop table endereco;

create table telefone(
	#definindo a chave primaria, onde ela é auto-incremetada
	idTelefone integer primary key auto_increment,
    ddd varchar(5),
    numero varchar(10),
    id_pessoa integer,
    constraint fk_id_pessoa_pessoa
	foreign key (id_pessoa) references pessoa2(idPessoa)
    );

insert into telefone values (null,"061","9999-9999",1);
insert into telefone values (null,"062","9999-7777",2);
insert into telefone values (null,"061","9852-1234",3);
insert into telefone values (null,"061","97863-1457",4);

select * from endereco inner join pessoa2 inner join telefone on endereco.idEndereco=pessoa2.id_pessoa;

#3ª forma normal
/*
#3ª forma normal
Para a tabela estar na terceira forma normal 
ela precisa estar de acordo com a 1ª e a 2ª forma normal
não existir dependencias transitivas
Nenhm atributo não_chave não pode depender de outro atributo não_chave
*/
create table produto (
	idProduto integer primary key auto_increment,
    nome_produto varchar(50),
    quantidade int,
    valor double
);