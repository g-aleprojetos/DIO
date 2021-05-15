package one.digitalinnovation.comparators;

import java.util.Comparator;

public class EstudanteOrdemIdadeReversaComparator implements Comparator<Estudante>{

    @Override
    public int compare(Estudante estudante1, Estudante estudante2) {
        return estudante2.getIdade() - estudante1.getIdade();
    }


}
