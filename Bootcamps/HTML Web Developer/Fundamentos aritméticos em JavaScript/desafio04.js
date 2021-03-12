let valor = parseInt(gets());

let NotasCem = parseInt(valor / 100)
let NotasCinquenta = parseInt((valor%100)/50)
let NotasVinte = parseInt(((valor%100)%50)/20)
let NotasDez = parseInt((((valor%100)%50)%20)/10)
let NotaCinco = parseInt(((((valor%100)%50)%20)%10)/5)
let NotaDois = parseInt((((((valor%100)%50)%20)%10)%5)/2)
let NotaUm = parseInt(((((((valor%100)%50)%20)%10)%5)%2/1))

console.log(valor)
console.log(`${NotasCem} nota(s) de R$ 100,00`)
console.log(`${NotasCinquenta} nota(s) de R$ 50,00`)
console.log(`${NotasVinte} nota(s) de R$ 20,00`)
console.log(`${NotasDez} nota(s) de R$ 10,00`)
console.log(`${NotaCinco} nota(s) de R$ 5,00`)
console.log(`${NotaDois} nota(s) de R$ 2,00`)
console.log(`${NotaUm} nota(s) de R$ 1,00`)