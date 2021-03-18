using System;
using System.Collections.Generic;

namespace DIO.Bank
{
    class Program
    {
        static List<Conta> listContas = new List<Conta>();
        static void Main(string[] args)
        {
            string opcaoUsuario = obterOpcaoUsuario();

            while(opcaoUsuario.ToUpper() != "X")
            {
                switch(opcaoUsuario)
                {
                    case "1":
                        ListarContas();
                        break;

                    case "2":
                        InserirConta();
                        break;

                    case "3":
                        Transferir();
                        break;

                    case "4":
                        Sacar();
                        break;

                    case "5":
                        depositar();
                        break;

                    case "6":
                       Console.Clear();
                        break;

                    default:
                        throw new ArgumentOutOfRangeException();

                }

                opcaoUsuario = obterOpcaoUsuario();
            }

            System.Console.WriteLine("Obrigado por utilizar nossos serviços.");
            Console.ReadLine();
        }

        private static void Transferir()
        {
            System.Console.Write("Digite o numero da conta de origem: ");
            int indiceContaOrigem = int.Parse(Console.ReadLine());

            System.Console.Write("Digite o numero da conta de destino: ");
            int indiceContaDestino = int.Parse(Console.ReadLine());

            System.Console.Write("Digite o valor a ser transferido: ");
            double valorTransferencia = double.Parse(Console.ReadLine());

            listContas[indiceContaOrigem].Tranferir(valorTransferencia, listContas[indiceContaDestino]);
        }

        private static void depositar()
        {
           System.Console.WriteLine("Digite o número da conta: ");
           int indiceConta = int.Parse(Console.ReadLine());

           System.Console.WriteLine("Digite o valor a ser depositado: ");
           double valorDeposito = double.Parse(Console.ReadLine());

           listContas[indiceConta].Depositar(valorDeposito);
        }

        private static void Sacar()
        {
            System.Console.Write("Digite o número da conta: ");
            int indiceConta = int.Parse(Console.ReadLine());

            System.Console.WriteLine("Digite o valor a ser sacado: ");
            double valorSaque = double.Parse(Console.ReadLine());

            listContas[indiceConta].Sacar(valorSaque);
        }

        private static void ListarContas()
        {
           System.Console.WriteLine("Listar Contas");

           if(listContas.Count == 0)
           {
               System.Console.WriteLine("nenhuma conta cadastrada.");
               return;
           }

           for(int i = 0; i < listContas.Count; i++)
           {
               Conta conta = listContas[i];
               System.Console.Write("#{0} - ", i);
               System.Console.WriteLine(conta);
           }
        }

        private static void InserirConta()
        {
            System.Console.WriteLine("Inserir nova conta");

            System.Console.Write("Digite 1 para conta Fisica ou 2 para conta juridica: ");
            int entradaTipoConta = int.Parse(Console.ReadLine());

            System.Console.Write("Digite o nome do Cliente: ");
            string entradaNome = Console.ReadLine();

            System.Console.Write("Digite o saldo inicial: ");
            double entradaSaldo = double.Parse(Console.ReadLine());

            System.Console.Write("Digite o crédito: ");
            double entradaCredito = double.Parse(Console.ReadLine());

            Conta novaConta = new(tipoConta: (TipoConta)entradaTipoConta,
                                saldo: entradaSaldo,
                                credito: entradaCredito,
                                nome: entradaNome);

            listContas.Add(novaConta);
        }

        private static string obterOpcaoUsuario()
        {
            System.Console.WriteLine();
            System.Console.WriteLine("DIO Bank a seu dispor!!!");
            System.Console.WriteLine();
            System.Console.WriteLine("Informe a opção desejada: ");

            System.Console.WriteLine("1- Listar contas");
            System.Console.WriteLine("2- Inserir nova conta");
            System.Console.WriteLine("3- Transferir");
            System.Console.WriteLine("4- Sacar");
            System.Console.WriteLine("5- Depositar");
            System.Console.WriteLine("C- limpar tela");
            System.Console.WriteLine("X- Sair");
            System.Console.WriteLine();

            string opcaoUsuario = Console.ReadLine().ToUpper();
            System.Console.WriteLine();
            return opcaoUsuario;
        } 
    }
}
