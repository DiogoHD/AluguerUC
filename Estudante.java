/**
 * Classe que representa um estudante.
 */
public class Estudante extends Utilizador {
    private String curso;
    private int polo;

    /**
     * Constructor da classe Estudante.
     * @param nome nome do estudante.
     * @param numeroMecanografico número mecanográfico do estudante.
     * @param metodoDePagamento método de pagamento do estudante.
     * @param curso curso do estudante.
     * @param polo Pólo mais frequentado pelo estudante.
     */
    public Estudante(String nome, int numeroMecanografico, MetodoPagamento metodoDePagamento, String curso, int polo) {
        super(nome, numeroMecanografico, metodoDePagamento);
        this.curso = curso;
        this.polo = polo;
    }

    /**
     * Retorna o curso do estudante.
     * @return Sring
     */
    public String getCurso() {
        return curso;
    }

    /**
     * Retorna o Pólo do estudante.
     * @return int
     */
    public int getPolo() {
        return polo;
    }

    /**
     * Define o curso do estudante.
     * @param curso curso do estudante.
     */
    public void setCurso(String curso) {
        this.curso = curso;
    }

    /**
     * Define o Pólo do estudante.
     * @param polo Pólo mais frequentado pelo estudante.
     */
    public void setPolo(int polo) {
        this.polo = polo;
    }

    /**
     * Retorna o tipo da classe.
     * @return String
     */
    @Override
    public String getType() {
        return "Estudante";
    }

    /**
     * toString da classe Estudante.
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() + ", Curso: " + curso + ", Polo: " + polo;
    }
}
