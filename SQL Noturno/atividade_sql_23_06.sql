#1.Nas aulas que tivemos até agora, 
#explique detalhadamente como criar:
# um banco de dados
# uma tabela
# iserir dados na tabela e 
# consultar todos os dados de uma tabela;

#2.Escolha 4 comandos do banco de dados
# e explique o que cada um faz, use suas palavras.

#3.Crie um banco de dados para
#salvar dados de produtos:
#tabela deve possuir: 
#descrição, unidade de medida(ex.: und, lts, mts), valor unitário, quantidade;

#Cadastre 5 produtos e mostre os produtos cadastrados;
#Concatene uma mensagem para mostrar os dados de determinado produto: “há 4 pendrives no estoque, com valor unitário de 35,25 reais;

# Importante antes de executar qualquer comando é necessário selecionar as linhas, caso contrário será executado todo o código podendo ocasionar erros
# Para a criação de um novo banco de dados acessamos o aplicativo "MySQL Workbench"
# Em seguida clicamos no icone "+SQL", onde é aberto um novo documento
# Para a criação da tabela utilizamos o comando a seguir: create database atividade_sql_23_06;

# Para utilizar a tabela criada executamos o seguinte comando: use atividade_sql_23_06;

# Para a criação dos dados dos produtos usamos o comando: create table( as variaveis ou nomes das colunas);

# Para inserção de dados usamos o comando a seguir lembrando de respeitar a ordem de criação das colunas e separando por virgulas: INSERT INTO produtos VALUES ( valores );

create database atividade_sql_23_06;
use atividade_sql_23_06;
drop table produtos;
create table produtos(
descricao varchar (500),
uMedida enum("und","lts","mts"),
valUnit double,
quantidade int
);

INSERT INTO produtos VALUES ("pen-drive",1,32.25,25),
							("corda",3,2.50,300),
                            ("gasolina","lts",5.6,56),
                            ("caderno","und",12.25,16),
                            ("extrato de tomate",1,5.75,27),
                            ("maisena",1,7.50,72);
                            
 select * from produtos;                           
 select concat ("Há ",quantidade," ",descricao," no estoque, com o valor unitário de ",valUnit," reais") from produtos;

#comando para alterar o nome da coluna para não perder os dados
alter table produtos rename column uMedida to Unidade_Medida;

select * from produtos;    

#exibi os dados em ordem alfabetica ascendente através da descrição
select * from produtos order by descricao asc;

#alteração da quantidade produtos, fazendo a busca do valor em descricao e alterando para a quantidade informada 
update produtos set quantidade = 45 where descricao = "pen-drive";

#exibe a descrição e a quantidade pesquisando no banco de produtos
select descricao,quantidade from produtos;