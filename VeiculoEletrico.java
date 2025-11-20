package AluguerUC;

/**
 * Classe representativa de um veículo elétrico.
 *
 * <p>Estende da classe {@link Veiculo} de forma a incluir
 * o nível de bateria de um veíuclo.</p>
 * <p>Não pode ser instanciada.</p>
 *
 * @since 1.0
 * @see Veiculo
 * @author Diogo Neves
 * @author Mário Santos
 * @version 1.0 (11/11/2025)
 */
public abstract class VeiculoEletrico extends Veiculo {
    private float nivelBateria;

    /**
     * Chama o construtor da superclasse de forma a inicializar
     * os atributos id e gps, e define o nível de bateria.
     *
     * @param id O identificador numérico do veículo alugado.
     * @param gps As coordenadas GPS atuais do veículo alugado.
     * @param nivelBateria O nivel de bateria de um veículo elétrico,
     *                     representado no formato de percentagem (0<x<100).
     *                     Ex: 28.9 corresponde a 28.9% ou 0.289.
     */
    public VeiculoEletrico(int id, String gps, int nivelBateria) {
        super(id, gps);
        this.nivelBateria = nivelBateria;
    }

    /**
     * Retorna o nível da bateria do veículo.
     *
     * @return O nível da bateria do veículo no formato de percentagem. (0<x<100)
     */
    public float getNivelBateria() {
        return this.nivelBateria;
    }

    /**
     * Atribui o nível da bateria.
     *
     * @param nivelBateria O nível da bateria do veículo no formato de percentagem. (0<x<100)
     */
    public void setNivelBateria(float nivelBateria) {
        this.nivelBateria = nivelBateria;
    }

    /**
     * Retorna o tipo da classe.
     * @return Retorna a String Veículo Elétrico.
     */
    @Override
    public String getType() {
        return "Veículo Elétrico";
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nNível de Bateria: " + this.nivelBateria + "%";
    }
}
