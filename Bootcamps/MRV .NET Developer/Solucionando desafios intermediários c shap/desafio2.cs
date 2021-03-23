using System; 

class minhaClasse {

    static void Main(string[] args) { 

            double a, b, c, result;
            string[] valor = Console.ReadLine().Split();
            a = Convert.ToDouble(valor[0]);
            b = Convert.ToDouble(valor[1]);
            c = Convert.ToDouble(valor[2]);
            

            if(( (a + b)> c ) && ((b + c)>a ) && ((a + c)> b )) //complete a condicional
            {
               result= (a + b + c);
               Console.WriteLine("Perimetro = {0:0.0}", result); //complete a saida
            }
            else
            {
              result = ((a + b) * c) / 2;
              Console.WriteLine("Area = {0:0.0}",result); //complete a saida
            }

    }

}