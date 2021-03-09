using System;

namespace _04_Revisao
{
    class Program
    {
        static void Main(string[] args)
        {
            System.Console.WriteLine();
            System.Console.WriteLine("Informe a opção desejada\n");
            System.Console.WriteLine("1- Inserir novo aluno");
            System.Console.WriteLine("2- Listar alunos");
            System.Console.WriteLine("3- Calcular média geral");
            System.Console.WriteLine("x- Sair");
            System.Console.WriteLine();

            string opcaoUsuario = Console.ReadLine();

            while(opcaoUsuario.ToUpper() != "x")
            {
               switch(opcaoUsuario)
               {
                    case "1":
                        //todo: adicionar aluno
                        break;

                    case "2":
                        //todo: listar alunos
                        break;

                    case "3":
                        //todo: calcular media geral
                        break;

                    default:
                    throw new ArgumentOutOfRangeException();
               } 

                          System.Console.WriteLine();
            System.Console.WriteLine("Informe a opção desejada\n");
            System.Console.WriteLine("1- Inserir novo aluno");
            System.Console.WriteLine("2- Listar alunos");
            System.Console.WriteLine("3- Calcular média geral");
            System.Console.WriteLine("x- Sair");
            System.Console.WriteLine();

            opcaoUsuario = Console.ReadLine();
            
            }
        }
    }
}
