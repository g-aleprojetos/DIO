using System;

public class MinhaClasse {
	public static void Main(string[] args) {
		int multiplo2 = 0;
		int multiplo3 = 0;
		int multiplo4 = 0;
		int multiplo5 = 0;

		int suavariavel = int.Parse(Console.ReadLine());
		string[] n = Console.ReadLine().Split(' ');
		int[] listaConvertida = new int[suavariavel];

		for (int i = 0; i < n.Length; i++) {
			var inteiro = int.Parse(n[i]);
			listaConvertida[i] = inteiro;
		}

		for (int i = 0; i < suavariavel; i++) {
			if (listaConvertida[i] % 2 == 0) {
				multiplo2++;
			}
		}
		for (int i = 0; i < suavariavel; i++) {
			if (listaConvertida[i] % 3 == 0) {
				multiplo3++;
			}
		}
		for (int i = 0; i < suavariavel; i++) {
			if (listaConvertida[i] % 4 == 0) {
				multiplo4++;
			}
		}
		for (int i = 0; i < suavariavel; i++) {
			if (listaConvertida[i] % 5 == 0) {
				multiplo5++;
			}
		}
		Console.WriteLine("{0} Multiplo(s) de 2", multiplo2);
		Console.WriteLine("{0} Multiplo(s) de 3", multiplo3);
		Console.WriteLine("{0} Multiplo(s) de 4", multiplo4);
		Console.WriteLine("{0} Multiplo(s) de 5", multiplo5);
	}
}