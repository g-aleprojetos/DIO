using System;

namespace desafio01
{
    class Program
    {
        static void Main(string[] args)
        {
            int x = 0;
            string[] entrada = Console.ReadLine().Split(' ');
            int a = Convert.ToInt32(entrada[0]);
            int b = Convert.ToInt32(entrada[1]);


            x = (a + b) ; //complete o código de acordo com o cálculo esperado

            Console.WriteLine("X = {0}",Convert.ToInt32(x));

        }
    }
}
