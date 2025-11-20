package AluguerUC;

/**
 * Classe que representa um funcionário.
 */
public class Funcionario extends Utilizador {
    private int anoContrato;

    /**
     * Construtor da classe Funcionario.
     * @param nome nome do funcionário.
     * @param numeroMecanografico número mecanográfico do funcionário.
     * @param metodoDePagamento método de pagamento do funcionário.
     * @param anoContrato ano de contrato do funcionário.
     */
    public Funcionario(String nome, int numeroMecanografico, Utilizador.MetodoPagamento metodoDePagamento, int anoContrato) {
        super(nome, numeroMecanografico, metodoDePagamento);
        this.anoContrato = anoContrato;
    }
    
    /**
     * Retorna o ano de contrato do funcionário.
     * @return int
     */
    public int getAnoContrato() {
        return anoContrato;
    }

    /**
     * Define o ano de contrato do funcionário.
     * @param anoContrato ano de contrato do funcionário.
     */
    public void setAnoContrado(int anoContrato) {
        this.anoContrato = anoContrato;
    }

    /**
     * Retorna o tipo da calsse.
     * @return Funcionario
     */
    public String getType() {
        return "Funcionario";
    }

    /**
     * toString da classe Funcionario.
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() + ", Ano de Contrato: " + anoContrato;
    }
}
