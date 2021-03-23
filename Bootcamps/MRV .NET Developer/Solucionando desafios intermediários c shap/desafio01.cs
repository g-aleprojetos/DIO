using System; 

class minhaClasse {

    static void Main(string[] args) { 

        string [] selections = Console.ReadLine().Split(' ');
        int A = int.Parse(selections[0]);
        int B = int.Parse(selections[1]);
        int C = int.Parse(selections[2]);
        int D = int.Parse(selections[3]);

        if ((B>C)&&(D>A)&&(C+D)&&((A+B)>(C>0))&&(D>0)&&(A % 2 == 0)) { //complete a condicional
          Console.WriteLine("Valores aceitos");
        } else {
          Console.WriteLine("Valores nao aceitos");
        };
    }

}