using System; 

class minhaClasse {

    static void Main(string[] args) { 

            int t = Convert.ToInt32(Console.ReadLine());
            double[] arrayList = new double[4];
            long pa, pb;
            double cpa, cpb;
            int anos;

            for (int i = 0; i < t; i++)
            {
                anos = 0;
                string[] valores = Console.ReadLine().Split();
                pa = Convert.ToInt64(valores[0]);
                pb = Convert.ToInt64(valores[1]);

               //declare as variaveis corretamente
                cpa = double.Parse(valores[2]);
                cpb = double.Parse(valores[3]);

                while (pa <= pb)
                {

                   //complete o while
                   pa += Convert.ToInt64(pa*cpa)/100;
                   pb += Convert.ToInt64(pb*cpb)/100;
                   anos ++;

                    if (anos > 100)
                    {
                       //complete a condicional
                        Console.WriteLine("Mais de 1 seculo.");
                        break;
                    }
                }

                if (anos <= 100)
                {
                  Console.WriteLine("{0} anos.", anos);
                   //complete a condicional
                }

            }

    }

}