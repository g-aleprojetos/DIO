import java.io.IOException;
import java.util.Scanner;

public class minhaClasse {
	
    public static void main(String[] args) throws IOException {
        Scanner leitor = new Scanner(System.in);

        int par = 0;
        int impar = 0;
        int positivo = 0;
        int negativo = 0;
        int [] n = new int[5] ;

        for(int i = 0; i < n.length; i++){
            n[i] = leitor.nextInt();
        }

       
        for (int i = 0; i < n.length; i++) {

           if(n[i] % 2 == 0){
            par++;
           }else{
               impar++;
           }

           if(n[i] != 0) {
            if(n[i] > 0){
                positivo++;
            }else{
                negativo++;
            }
           }
         }
        System.out.println(par + " valor(es) par(es)");
        System.out.println(impar + " valor(es) impar(es)");
        System.out.println(positivo + " valor(es) positivo(s)");
        System.out.println(negativo + " valor(es) negativo(s)");
    

    }
	
}