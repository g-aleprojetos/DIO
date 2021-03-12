var valores = [];
var positivos = [];
for (i = 0; i < 6; i++) {
  valores[i] = gets();
  if (valores[i] > 0) {
    positivos.push(valores[i]);
  }

}
console.log(positivos.length + " valores positivos");