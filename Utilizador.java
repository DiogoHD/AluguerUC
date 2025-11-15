
/**
 * Classe que representa um utilizador.
 * 
 * 

 */

public class Utilizador {

    /**
     * Enum para os métodos de pagamento disponíveis (Cartao de Credito e Referencia Multibanco).
     */
    public enum MetodoPagamento {
        CARTAO_CREDITO("Cartao de Credito"),
        REFERENCIA_MB("Referencia Multibanco");
        private final String descricao;

        MetodoPagamento(String descricao) {
            this.descricao = descricao;
        }

        public String getDescricao() {
            return descricao;
        }

        public String toString() {
            return descricao;
        }
    }


    private String nome;
    private int numeroMecanografico;
    private MetodoPagamento metodoDePagamento;

    /**
     * Constructor da classe Utilizador.
     * @param nome nome do utilizador.
     * @param numeroMecanografico numero mecanográfico do utilizador.
     * @param metodoDePagamento método de pagamento do utilizador.
     */
    public Utilizador(String nome, int numeroMecanografico, MetodoPagamento metodoDePagamento) {
        this.nome = nome;
        this.numeroMecanografico = numeroMecanografico;
        this.metodoDePagamento = metodoDePagamento;
    }

    /**
     * Retorna o metodo de pagamento do utilizador.
     * @return String
     */
    public String getMetodoDePagamento() {
        return metodoDePagamento.getDescricao();
    }

    /**
     * Retorna o numero mecanografico do utilizador.
     * @return int
     */
    public int getNumeroMecanografico() {
        return numeroMecanografico;
    }

    /**
     * Retorna o nome do utilizador.
     * @return String
     */
    public String getNome() {
        return nome;
    }

    /**
     * Define o nome do utilizador.
     * @param nome
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * Define o numero mecanográfico do utilizador.
     * @param numeroMecanografico
     */
    public void setNumeroMecanografico(int numeroMecanografico) {
        this.numeroMecanografico = numeroMecanografico;
    }

    /**
     * Retorna o tipo dea classe.
     * @return String
     */
    String getType() {
        return "Utilizador";
    }

    /**
     * toString da classe Utilizador.
     * @return String
     */
    public String toString() {
        return "Nome: " + nome + ", Numero Mecanografico: " + numeroMecanografico + ", Metodo de Pagamento: " + metodoDePagamento.getDescricao();
    }
}
