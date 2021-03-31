using System;
using System.Collections.Generic;

class MinhaClasse {
  public static void Main (string[] args) {
    var totalDeCasosDeTeste = int.Parse(Console.ReadLine());
      String[] listaCompras;
        SortedSet<string> lista;

        for (int i = 0; i < totalDeCasosDeTeste; i++)
        {
            listaCompras = Console.ReadLine().Split(' ');
            lista = new SortedSet<string>(listaCompras);

            foreach (var n in lista)
            {
                Console.Write(n.Replace(" ",""));
                Console.Write(' ');
            }
            lista.Clear();
            Console.WriteLine();
        }
  }
}