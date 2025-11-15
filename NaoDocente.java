
/**
 * Classe que representa um funcionário que não é docente.
 */
public class NaoDocente extends Funcionario {
    private String servico;

    /**
     * Construtor da classe NaoDocente.
     * @param nome nome do funcionário não docente.
     * @param numeroMecanografico número mecanográfico do funcionário não docente.
     * @param metodoDePagamento método de pagamento do funcionário não docente.
     * @param anoContrato ano de contrato do funcionário não docente.
     * @param servico tipo de serviço do funcionário não docente.
     */
    public NaoDocente(String nome, int numeroMecanografico, MetodoPagamento metodoDePagamento, int anoContrato, String servico) {
        super(nome, numeroMecanografico, metodoDePagamento, anoContrato);
        this.servico = servico;
    }

    /**
     * Retorna o serviço do funcionário não docente.
     * @return String
     */
    public String getServico() {
        return servico;
    }

    /**
     * Define o serviço ao funcionário não docente.
     * @param servico tipo de serviço do funcionário não docente.
     */
    public void setServico(String servico) {
        this.servico = servico;
    }

    /**
     * Retorna o tipo da classe.
     * @return String
     */
    @Override
    public String getType() {
        return "NaoDocente";
    }

    /**
     * ToString da classe NaoDocente.
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() + ", Servico: " + servico;
    }
}
