import java.util.ArrayList;
/**
 * Classe que representa um docente.
 */
public class Docente extends Funcionario {
    private ArrayList<String> faculdades;

    /**
     * Construtor da classe Docente.
     * @param nome nome do docente.
     * @param numeroMecanografico numero mecanografico do docente.
     * @param metodoDePagamento metodo de pagamento do docente.
     * @param anoContrato ano de contrato do docente.
     */
    public Docente(String nome, int numeroMecanografico, Utilizador.MetodoPagamento metodoDePagamento, int anoContrato) {
        super(nome, numeroMecanografico, metodoDePagamento, anoContrato);
        this.faculdades = new ArrayList<String>();
    }

    /**
     * Construtor da classe Docente.
     * @param nome nome do docente.
     * @param numeroMecanografico numero mecanografico do docente.
     * @param metodoDePagamento metodo de pagamento do docente.
     * @param anoContrato ano de contrato do docente.
     * @param faculdades lista de faculdades do docente.
     */
    public Docente(String nome, int numeroMecanografico, MetodoPagamento metodoDePagamento, int anoContrato, ArrayList<String> faculdades) {
        super(nome, numeroMecanografico, metodoDePagamento, anoContrato);
        this.faculdades = faculdades;
    }

    /**
     * Adiciona uma faculdade à lista de faculdades do docente.
     * @param faculdade
     */
    public void addFaculdade(String faculdade) {
        this.faculdades.add(faculdade);
    }

    /**
     * Devolve a lista de faculdades do docente.
     * @return ArrayList<String>
     */
    public ArrayList<String> getFaculdades() {
        return faculdades;
    }

    /**
     * Mostra as faculdades do docente.
     */
    public void showFaculdades() {
        for (String faculdade : faculdades) {
            System.out.println(faculdade);
        }
    }

    /**
     * Retorna o tipo da classe.
     * @return String
     */
    @Override
    public String getType() {
        return "Docente";
    }

    /**
     * toString da classe Docente.
     * @return String
     */
    @Override
    public String toString() {
        return super.toString() + ", Faculdades: " + faculdades;
    }
}
