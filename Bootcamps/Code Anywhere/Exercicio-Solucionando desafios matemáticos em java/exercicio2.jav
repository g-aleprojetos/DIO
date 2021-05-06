import java.util.Scanner; 

public class Classe{
	public static void main(String[] args){
      double area ;
      double raio;

      Scanner scan = new Scanner(System.in);
      raio = Double.parseDouble(scan.nextLine());

      area = 3.14159 * (Math.pow( raio ,2));

      System.out.printf("A=%.4f\n", area);
	}
}