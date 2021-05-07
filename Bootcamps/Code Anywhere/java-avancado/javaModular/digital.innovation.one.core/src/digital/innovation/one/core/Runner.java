package digital.innovation.one.core;
import digital.innovation.one.utils.operacao.Calculadora;
import java.sql.Date;

public class Runner {
    public static void main(String[] args) {

        Calculadora calculadora = new Calculadora();

        System.out.println(calculadora.div(9,3));
    }
}
