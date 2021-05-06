import java.util.Scanner;

public class Main{
	public static void main(String[] args){

        int horas = 0;
        int velocidadeMedia = 0;

        Scanner scan = new Scanner(System.in);

        String [] dados = scan.nextLine().split(" ");
        horas = Integer.parseInt(dados[0]);
        velocidadeMedia = Integer.parseInt(dados[1]);


        System.out.printf("%.3f\n", ( horas  * velocidadeMedia  )/12.0);
	}
}