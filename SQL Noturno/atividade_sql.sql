create database atividade_sql;
use atividade_sql;

drop table pessoas;
create table pessoas(
nome varchar (100),
idade int,
telefone varchar(15),
endereço varchar(550),
email varchar(60)
);

INSERT INTO pessoas VALUES ("Kevin Carlos Eduardo Corte Real", 40,"6138899757","QS 501 393 Samambaia Sul, Brasilia - DF","kevin_carlos_cortereal@globo.com"),
("Gael Gabriel Severino da Mata",67,"6139651122","Quadra QS 1029 Conjunto 3 numero 261,Samambaia Norte Brasília -DF  ","gaelgabrieldamata@ramiresmotors.com.br"),
("Raquel Aurora Mariane de Paula",59,"6139695796","Quadra QSC 19 Chácara 27 Conjunto B numero 803 Brasília -DF","raquel.aurora.depaula@geometrabte.com.br"),
("Isis Emilly Daiane Ramos",25,"6129001336","Conjunto SHA Conjunto 3 Chácara 83B numero 635 SH Arniqueira, Águas Claras, Brasília - DF","isis-ramos75@trincheira.com.br"),
("Joana Carolina Isadora Barbosa",47,"6126861483","Trecho Trecho 03 Chácara 130, 589 Setor de Habitações Individuais Norte Brasília -DF","joana_carolina_barbosa@macroengenharia.com"),
("Raimundo Miguel Cardoso",55,"61999390400","Quadra 31 numero 543,Vila São José (São Sebastião) Brasília -DF","raimundo-cardoso96@nipnet.com.br"),
("Eloá Eduarda Almada",49,"61994714893","Área ADE Conjunto 20, 839 Samambaia Sul Brasília - DF","eloa_almada@gruposeteestrelas.com.br"),
("Erick Iago Luiz Cavalcanti",35,"61986837281","Quadra CSC 3, 549, Taguatinga Sul Brasília - DF","erick.iago.cavalcanti@dhl.com"),
("Kaique Carlos Eduardo Fernando Barros",57,"61981449922","Quadra Quadra 1 Chácara 3A, 291,Veredas (Brazlândia) Brasília - DF","kaique_barros@sebrace.com.br"),
("Otávio Sérgio Diego Sales",56,"61997090014","Condomínio Solar de Brasília, 447, Setor Habitacional Jardim Botânico, Brasília - DF","otavio@gastrolight.com.br"),
("Paulo Benjamin Thomas Assunção",25,"61986668688","Quadra Quadra 217 Conjunto 2, 780,Samambaia Norte Brasília - DF","paulo-assuncao95@vitacard.com.br"),
("Márcia Fátima Souza",39,"61991403924","Núcleo Rural Incra 6, 500,Brazlândia, Brasília - DF","marciaf@gastrolight.com.br"),
("Nelson Marcelo Heitor Araújo",25,"61989112801","Quadra QN 26 Conjunto 2 631,Riacho Fundo II Brasília - DF","nelson_araujo@gastrolight.com.br"),
("Sueli Letícia Alves",48,"6199410-2786", "Quadra CSG 6, 653,Taguatinga Sul Taguatinga Brasília - DF","suelileticiaalves@afujita.com.br"),
("Heloise Brenda da Silva",25,"6199308-4049","Quadra QR 117 Conjunto Q 974, Santa Maria, Brasília - DF","heloise_dasilva@fanger.com.br");

insert into pessoas values ("Sueli Letícia Alves",48,"6199410-2786", "Quadra CSG 6, 653,Taguatinga Sul Taguatinga Brasília - DF",null),
("Heloise Brenda da Silva",25,"6199308-4049","Quadra QR 117 Conjunto Q 974, Santa Maria, Brasília - DF",null);

#mostre os dados inseridos.
select * from pessoas;

#mostre os dados das pessoas que moram na mesma cidade e são maiores de 18 anos;
select * from pessoas where endereço like "%Taguatinga sul%" and idade > 18;

#insira mais de um telefone para uma pessoa;
#INSERT INTO pessoas VALUES ("Kevin Carlos Eduardo Corte Real", 40,"6138899757","6138899757","QS 501 393 Samambaia Sul, Brasilia - DF","kevin_carlos_cortereal@globo.com"),
#INSERT INTO pessoas VALUES ("Kevin Carlos Eduardo Corte Real", 40,"6138899757 6138899757","QS 501 393 Samambaia Sul, Brasilia - DF","kevin_carlos_cortereal@globo.com"),

#mostre quantas pessoas residem no mesmo estado
select count(*) as "Quantidade" from pessoas where endereço like "%DF%";
select * from pessoas where endereço like "%df%";

#mostre os dados das pessoas onde a idade é igual a 30 anos;
select * from pessoas where idade >= 30;

#conta e agrupa por nome os dados onde a idade é maior que 15
select count(*) as quantidade, nome from pessoas where idade > 15 group by nome; 

#pesquisa os nomes onde o e-mail tem o valor nulo
select nome from pessoas where email is null;

#retira a proteção do banco de dados para que seja feita as alterações que pode até prejudicar o banco
set sql_safe_updates = 0;

#alteração do email da pessoa quando se sabe o nome completo
update pessoas set email = 'meuemail@gmail.com' where nome = "Heloise Brenda da Silva";

#alteração do email da pessoa quando se sabe apenas parte do dado
update pessoas set email = 'nossoemail@gmail.com' where nome like "%Heloise%";

#exibe o nome e email da pessoa pesquisada
select nome, email from pessoas where nome = "Heloise Brenda da Silva";

#procura na tabela onde o e-mail é nulo e a pessoa tenha no nome "Sueli";
update pessoas set email = 'email@gmail.com' where email is null and nome like "%sueli%";

#exibi os dados em ordem alfabetica descendente através do nomes
select * from pessoas order by nome desc;

#exibi os dados em ordem alfabetica ascendente através do nomes
select * from pessoas order by nome asc;

#exibi os dados em ordem alfabetica ascendente através do e-mail
select * from pessoas order by email asc;

create table produto (
	nome_do_produto varchar (30),
    preço double
    );
    
#comando para inserir um novo campo "quantidade"    
alter table produto add quantidade int;

#comando para exibir o banco criado
desc produto;