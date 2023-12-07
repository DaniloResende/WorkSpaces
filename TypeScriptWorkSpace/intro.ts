console.log("Hello World");

// declarar variavel
// atribuir o valor ao declarar é opcional
// primitivos

// LET VAR CONST EXPLICAR!

let nome: string;
let idade: number = 27 // int ou float nao existem, tudo é number!
let adulto: boolean = true


//number
let minhaIdade: number = 33333
let minhaIdade2: number = 33333.21

//boolean

let isLogged: boolean = false

// nao declarar o tipo ao declarar e atribuir uma variavel!
// nao precisa, podemos evitar as anotacoes de tipo
let minhaIdade3 = 33333 // ao atribuir o valor ja esta implicito que e um number
let meuNome: string // faz sentido nesse caso, em quem nao atribuimos o valor

// any
// nao usar indiscriminadamente o any para fugir da tipagem estatica
// quando voce nao declara o tipo e o typescript nao consegue inferir o tipo ele automaticamente vira any
// recomendado nos casos em que nao se sabe o que vai ser atribuido a variavel em runtime!
let aleatorio
function retornoAleatorio(){
    return true
}
aleatorio = retornoAleatorio() 
// nesse caso este correto o uso do any! pois nao sabemos o que vai ser retornado pela funcao

// function
// em caso de funcoes, VOCE DEVE ATRIBUIR TIPOS AOS PARAMETROS e ao! ou eles irao ser any
function multiplicar(numA: number, numB: number): number {
    return numA * numB
}
// ou 

let multiplicar2 = (numA: number, numB: number): number => numA * numB

