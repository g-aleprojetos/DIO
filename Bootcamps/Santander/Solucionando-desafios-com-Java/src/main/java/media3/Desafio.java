package media3;

import java.text.DecimalFormat;
import java.util.Locale;
import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        sc.useLocale(Locale.ENGLISH);
        Locale.setDefault(new Locale("en", "US"));
        DecimalFormat df = new DecimalFormat("#.#");

        float n1,n2,n3,n4,media,emexame,emexamefinal;

        n1 = sc.nextFloat();
        n2 = sc.nextFloat();
        n3 = sc.nextFloat();
        n4 = sc.nextFloat();

        media = ((n1 * 2) + (n2 * 3) + (n3 * 4) + (n4 * 1)) / 10;
        media = Float.parseFloat(df.format(media));

        System.out.printf("Media: %.1f\n",media);

        if ( media >= 7.0 ){
            System.out.printf("Aluno aprovado.\n");
        }
        else if (media < 5.0 ){
            System.out.printf("Aluno reprovado.\n");
        }
        else {
            System.out.printf("Aluno em exame.\n");
            emexame = sc.nextFloat();
            System.out.printf("Nota do exame: %.1f\n",emexame );

            emexamefinal = (emexame + media)/2;
            emexamefinal = Float.parseFloat(df.format(emexamefinal));

            if( emexamefinal >= 5.0 ){
                System.out.printf("Aluno aprovado.\n");
                System.out.printf("Media final: %.1f\n", emexamefinal );
            }
            else{
                System.out.printf("Aluno reprovado.\n");
                System.out.printf("Media final: %.1f\n", emexamefinal );
            }
        }
        sc.close();
    }
}
