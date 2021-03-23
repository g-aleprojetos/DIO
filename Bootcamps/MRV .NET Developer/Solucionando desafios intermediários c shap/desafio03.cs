using System; 

class minhaClasse {

    static void Main(string[] args) { 

  
            decimal valor;

            valor = decimal.Parse(Console.ReadLine());

            Console.WriteLine("NOTAS:");
            Console.WriteLine("{0} nota(s) de R$ 100.00", (int) valor / 100);
            valor = valor % 100;
            Console.WriteLine("{0} nota(s) de R$ 50.00", (int) valor / 50);
            valor = valor % 50;
            Console.WriteLine("{0} nota(s) de R$ 20.00", (int) valor / 20);
            valor = valor % 20;
            Console.WriteLine("{0} nota(s) de R$ 10.00", (int) valor / 10);
            valor = valor % 10;
            Console.WriteLine("{0} nota(s) de R$ 5.00", (int) valor / 5);
            valor = valor % 5;
            Console.WriteLine("{0} nota(s) de R$ 2.00", (int) valor / 2);
            valor = valor % 2;

            valor = valor * 100;

            Console.WriteLine("MOEDAS:");
            Console.WriteLine("{0} moeda(s) de R$ 1.00", (int)valor / 100);
            valor = valor % 100;
            Console.WriteLine("{0} moeda(s) de R$ 0.50", (int)valor / 50);
            valor = valor % 50;
            Console.WriteLine("{0} moeda(s) de R$ 0.25", (int)valor / 25);
            valor = valor % 25;
            Console.WriteLine("{0} moeda(s) de R$ 0.10", (int)valor / 10);
            valor = valor % 10;
            Console.WriteLine("{0} moeda(s) de R$ 0.05", (int)valor / 5);
            valor = valor % 5;
            Console.WriteLine("{0} moeda(s) de R$ 0.01", (int)valor);

    }


    

}