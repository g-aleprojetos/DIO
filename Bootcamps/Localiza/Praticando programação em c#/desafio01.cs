using System; 

public class URI {

	public static void Main(string[] args) { 

          float x, y;
          
          string[] arrValor = Console.ReadLine().Replace(",",".").Split(' ');
          x = float.Parse(arrValor[0]);
          y = float.Parse(arrValor[1]);
		
		if(x == 0.0 && y == 0.0){
		Console.WriteLine("Origem");
		}
		else if(y == 0){
		  Console.WriteLine("Eixo X");
		}
		else if(x == 0){
		  Console.WriteLine("Eixo Y");
		}
		else if (x > 0 && y > 0){
			Console.WriteLine("Q1");
		}
		else if (x < 0 && y > 0){
			Console.WriteLine("Q2");
		}
		else if (x < 0 && y < 0){
			Console.WriteLine("Q3");
		}
		else if (x > 0 && y < 0){
			Console.WriteLine("Q4");
		}
			

    }

}