import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    /**
     * Construtor
     */
    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }

    /**
     * Adiciona uma pessoa à lista
     */
    public void adicionarPessoa(String nome, int idade, double altura) {
        Pessoa pessoa = new Pessoa(nome, idade, altura);
        this.pessoaList.add(pessoa);
    }

    /**
     * Ordena as pessoas por idade e retorna uma lista de pessoas
     *
     * @return Retorna uma lista de pessoas
     */
    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(this.pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    /**
     * Ordena as pessoas por altura e retorna uma lista de pessoas
     *
     * @return Retorna uma lista de pessoas
     */
    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(this.pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPessoaPorAltura());
        return pessoasPorAltura;
    }
}

