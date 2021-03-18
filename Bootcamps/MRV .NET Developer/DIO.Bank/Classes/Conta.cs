using System;

namespace DIO.Bank
{
    public class Conta
    {
        private TipoConta TipoConta { get; set; }
        private double Saldo { get; set; }
        private double Credito { get; set; }
        private string Nome { get; set; }


        public Conta(TipoConta tipoConta, double saldo, double credito, string nome)
        {
            this.TipoConta = tipoConta;
            this.Saldo = saldo;
            this.Credito = credito;
            this.Nome = nome;
        }

        public bool Sacar(double valorSaque)
        {
            //validação de saldo suficiente
            if(this.Saldo - valorSaque < (this.Credito *-1))
            {
                System.Console.WriteLine("Saldo insuficiente!");
                return false;
            }

            this.Saldo -= valorSaque;

            System.Console.WriteLine("Saldo atual da conta de {0} é {1}", this.Nome, this.Saldo);
            //https://docs.microsoft.com/pt-br/dotnet/standard/base-types/composite-formatting

            return true;
        }

        public void Depositar(double valorDeposito)
        {
            this.Saldo += valorDeposito;
            
            System.Console.WriteLine("Saldo atual da conta de {0} é {1}", this.Nome, this.Saldo);
        }

        public void Tranferir(double valorTransferencia, Conta contaDestino)
        {
            if(this.Sacar(valorTransferencia))
            {
                contaDestino.Depositar(valorTransferencia);
            }
        }

        public override string ToString()
        {
            string retorno = "";
            retorno += "Tipo de conta " + this.TipoConta + "|";
            retorno += "Nome " + this.Nome + "|";
            retorno += "saldo " + this.Saldo + "|";
            retorno += "Crédito " + this.Credito;
            return retorno;
        }
    }
}