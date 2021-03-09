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
                        decimal notaTotal = 0;
                        var nrAlunos = 0;
                        for(int i = 0; i < alunos.Length; i++)
                        {
                            if (!string.IsNullOrEmpty(alunos[i].Nome))
                            {
                                notaTotal = notaTotal + alunos[i].Nota;
                                nrAlunos++;
                            }
                        }
                        var mediaGeral = notaTotal / nrAlunos;
                        Conceito conceitoGeral;

                        if ( mediaGeral < 2 )
                        {
                            conceitoGeral = Conceito.E;
                        }
                        else if( mediaGeral >= 2 && mediaGeral < 4 )
                        {
                            conceitoGeral = Conceito.D;
                        }
                        else if( mediaGeral >= 4 && mediaGeral < 6)
                        {
                            conceitoGeral = Conceito.C;
                        }
                        else if ( mediaGeral >= 6 && mediaGeral < 8 )
                        {
                            conceitoGeral = Conceito.B;
                        }
                        else
                        {
                            conceitoGeral = Conceito.A;
                        }


                        System.Console.WriteLine($"Média geral: {mediaGeral} - Conceito: {conceitoGeral}");
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
            System.Console.WriteLine("****************************");
            System.Console.WriteLine("* Informe a opção desejada *");
            System.Console.WriteLine("*                          *");
            System.Console.WriteLine("* 1- Inserir novo aluno    *");
            System.Console.WriteLine("* 2- Listar alunos         *");
            System.Console.WriteLine("* 3- Calcular média geral  *");
            System.Console.WriteLine("* x- Sair                  *");
            System.Console.WriteLine("****************************");
            System.Console.WriteLine();

            string opcaoUsuario = Console.ReadLine();
            return opcaoUsuario;
        }
    }
}
