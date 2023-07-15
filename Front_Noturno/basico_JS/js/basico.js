// para executar no output / console é necessário usar as teclas Crtl+Alt+N
// Não esqueca de instalar o Code Runner
// "console.log()" serve oara mostrar na tela algo
console.log("Hello world, no arquivo js!");

//contatenação
console.log(1+"1");
//JS entende que se trata de uma subtração mesmo sendo uma string e um tipo numerico
console.log(1-"1");

//declaração de variavel com a palavra reservada "VAR"
var x=10
//declaração de variavel com a palavra reservada "LET"
let y=11
//declaração de variavel com a palavra reservaada "LET"
var x = 11

/*
//"typeof" Retorna i tipo do dado (string, numerico, objeto, array...)
console.log(typeof(x)) //fala qual o tipo é a variavel

//alguns casos o JS não consegue calcular string com numerico
console.log("aula"*2) //tenta multiplicar a string e apresenta um erro "NAN"

//JS não necessita colocar um tipo do dado
//Caso queira, usamos o tipo number para numerico (int ou float/double)
let numero = Number(50) //fala qual o tipo é a variavel
//Tipo String para char e string
let numeroString = String(50) 
let casaDecimais = 10.9988

console.log(typeof(numero)) //fala qual o tipo é a variavel
console.log(numeroString) //exibe o dado atribuido 
//Exemplo onde o typeof retorna tipo NUMBER para um numeor com casas decimais
console.log(typeof(casaDecimais))
//biblioteca MATH para fazer a potencia do número
console.log(Math.pow(2, 2))

//random, para entregar número aleatorio
// a multiplicação serve para o número máximo que se deseja mostrar
//o "parseInt" converte o número random para inteiro
console.log(parseInt(Math.random()*20))


//permite a alteração de "h1" sem escolha, alterando o primeiro
document.querySelector('h1').innerHTML = "Meu título no JS"

//permite a alteração de "h1" escolhendo pelo tipo de "id"
document.getElementById('tituloId').innerHTML = "titulo do id no JS"

//permite a alteração de "h1" escolhendo pelo tipo de "classe", é necessário o uso do "." (ponto) para demonstrar que se trata de uma classe
document.querySelector('.tituloClass').innerHTML = "titulo do Class no JS"

//document.getElementsByClassName('tituloClass').innerHTML = "titulo do Class no JS"

//vetor em javaScript, segue mesmo padrão java
//Os dados tem que ser do mesmo tipo 
*/
var vetorNumerico = [1, 2, 3, 4, 5];

//recupera o indice do vetor e retorna o valor no indice
console.log(vetorNumerico[0]);

//parecido com o VOID do JAVA
function multiplicar(a, b){
    console.log(a*b)
}

//chama a função para ser execultadas
multiplicar(10, 10)

//função com retorno tipo numerico
function funcaoComRetorno(x, y){
    return x * y
}
console.log(funcaoComRetorno(10, 5))

//ArrowFunction
var mensagemOla = () => {
    return "Olá novamente"
}

console.log(mensagemOla())

document.getElementById('recebeuFoco').onfocus = 
function () {
    focado ()
}

function focado (){
    document.getElementById('recebeuFoco').style.background = "green"
}

function valorDigitado(){
    let recebido = document.getElementById('recebeuFoco').value
    alert("Valor recebido via input " + recebido)
}