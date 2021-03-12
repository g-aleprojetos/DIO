valor1 = gets();
valor2 = gets();
valor3 = gets();
valor4 = gets();
valor5 = gets();


const conjuntoValores = [valor1, valor2, valor3, valor4, valor5];

let valoresNegativos = 0;
let valoresPositivos = 0;
let valoresPares = 0;
let valoresImpares = 0;

for (let i = 0; i < conjuntoValores.length; i++) {
  if (conjuntoValores[i] < 0) {
    valoresNegativos++;
  }
  
  if (conjuntoValores[i] > 0) {
    valoresPositivos++;
  }
  
  if (conjuntoValores[i] % 2 === 0) {
    valoresPares++;
  }
  
  if (conjuntoValores[i] % 2 !== 0) {
    valoresImpares++;
  }
}

console.log(`${valoresPares} valor(es) par(es)`);
console.log(`${valoresImpares} valor(es) impar(es)`);
console.log(`${valoresPositivos} valor(es) positivo(s)`);
console.log(`${valoresNegativos} valor(es) negativo(s)`);