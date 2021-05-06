import java.io.IOException;
import java.util.Scanner;

public class Classe{
    
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int A = leitor.nextInt();
        int B = leitor.nextInt();

        double resto = B % A;
        System.out.println(resto);
        if ( B % A == 0 || A % B == 0) {
            System.out.println("Sao Multiplos");
        } else {
            System.out.println("Nao sao Multiplos");
        }
    }
    
}