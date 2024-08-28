import java.util.Comparator;

public class ComparatorPessoaPorAltura implements Comparator<Pessoa> {

    /**
     * Método que efetua a comparação de duas pessoas pela altura
     */
    @Override
    public int compare(Pessoa pessoa1, Pessoa pessoa2) {
        return Double.compare(pessoa1.getAltura(), pessoa2.getAltura());   
    }   
}
