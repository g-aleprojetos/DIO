using System;

namespace desafio03
{
    class Program
    {
        static void Main(string[] args)
        {
            
            double nota;
            int qtdIgual = 0;
            double soma = 0;
            while (qtdIgual != 2)
            {
                nota = Convert.ToDouble(Console.ReadLine());
                if ( nota >= 0 && nota<= 10  )   //complete a condicional
                {
                  soma = soma + nota; 
                  qtdIgual++; 
                }
                else
                {
                    Console.WriteLine("nota invalida");
                }
                
            }
            Console.WriteLine("media = {0:0.00}", (soma /2)); //insira a variavel correta

        }
    }
}
