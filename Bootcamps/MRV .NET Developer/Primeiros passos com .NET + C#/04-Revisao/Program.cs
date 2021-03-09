using System;
using Revisao;

namespace _04_Revisao
{
    class Program
    {
        static void Main(string[] args)
        {
           Aluno[] alunos = new Aluno[5];
           var indiceAluno = 0;
            string opcaoUsuario = ObterOpcaoUsuario();

            while (opcaoUsuario.ToUpper() != "x")
            {
                switch (opcaoUsuario)
                {
                    case "1":
                        System.Console.Write("Informe o nome do aluno: ");
                        Aluno aluno = new Aluno();
                        aluno.Nome = Console.ReadLine();
                       
                        System.Console.Write("Informe a nota do aluno: ");
                        
                        if (decimal.TryParse(Console.ReadLine(), out decimal nota))
                        {
                            aluno.Nota = nota;
                        }
                        else
                        {
                           throw new ArgumentException("Valor da nota deve ser decimal"); 
                        }

                        alunos[indiceAluno] = aluno;
                        indiceAluno++;
                        break;

                    case "2":
                        foreach(var a in alunos)
                        {
                            if (!string.IsNullOrEmpty(a.Nome))
                            {
                                 System.Console.WriteLine($"Aluno: {a.Nome} - Nota: {a.Nota}");
                            }
                        }
                        break;

                    case "3":
                        //todo: calcular media geral
                        break;

                    default:
                        throw new ArgumentOutOfRangeException();
                }

                opcaoUsuario = ObterOpcaoUsuario();

            }
        }

        private static string ObterOpcaoUsuario()
        {
            System.Console.WriteLine();
            System.Console.WriteLine("Informe a opção desejada\n");
            System.Console.WriteLine("1- Inserir novo aluno");
            System.Console.WriteLine("2- Listar alunos");
            System.Console.WriteLine("3- Calcular média geral");
            System.Console.WriteLine("x- Sair");
            System.Console.WriteLine();

            string opcaoUsuario = Console.ReadLine();
            return opcaoUsuario;
        }
    }
}
