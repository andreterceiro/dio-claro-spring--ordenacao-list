public class Pessoa {
    /**
     * Nome de uma pessoa
     */
    private String nome;

    /**
     * Idade de uma pessoa
     */
    private int idade;

    /**
     * Altura de uma pessoa
     */
    private double altura;


    /**
     * Construtor
     * 
     * @param nome   Nome de uma pessoa
     * @param idade  Idade de uma pessoa
     * @param altura Altura de uma pessoa
     */
    public Pessoa(String nome, int idade, double altura) {
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }

    /**
     * Getter de this.nome
     */
    public String getNome() {
        return this.nome;
    }

    /**
     * Getter de this.idade
     */
    public int getIdade() {
        return this.idade;
    }

    /**
     * Getter de this.altura
     */
    public Double getAltura() {
        return this.altura;
    }

    /**
     * Método que retorna uma representação string do objeto
     */
    public String toString() {
        return "{Pessoa:" + 
            " nome='" + this.nome + "'," +
            " idade='" + this.idade + "'," +
            " altura='" + this.altura + "'}";
    }
}
