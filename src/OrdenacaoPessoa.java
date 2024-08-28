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

    /** 
     * main method to manual tests through console
     * 
     * @params args Params passed through console (ignored)
     */
    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("Nome 1", 20, 1.56);
        ordenacaoPessoa.adicionarPessoa("Nome 2", 30, 1.80);
        ordenacaoPessoa.adicionarPessoa("Nome 3", 25, 1.70);
        ordenacaoPessoa.adicionarPessoa("Nome 4", 17, 1.56);

        System.out.println(ordenacaoPessoa.pessoaList);
        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }
}

