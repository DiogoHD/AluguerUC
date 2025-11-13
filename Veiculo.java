package AluguerUC;

/**
 * Classe representativa de um veículo
 *
 * <p>Classe usada para representar os veículos alugados,
 * possuindo um id (int) e a sua localização GPS atual (String)</p>
 *
 * @since 1.0
 * @author Diogo Neves
 * @author Mário Santos
 * @version 1.0 (11/11/2025)
 */
public class Veiculo {
    private int id;
    private String gps;

    /**
     * Cria um veículo alugado, atribuindo-lhe um id e a sua localização gps.
     * @param id O identificador numérico do veículo alugado.
     * @param gps As coordenadas GPS atuais do veículo alugado.
     */
    public Veiculo(int id, String gps) {
        this.id = id;
        this.gps = gps;
    }

    /**
     * Retorna o id do veículo.
     *
     * @return O identificador numérico do veículo alugado.
     */
    public int getId() {
        return this.id;
    }

    /**
     * Atribui o id do veículo.
     *
     * @param id O novo identificador numérico a atribuir ao veículo alugado.
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * Retorna as coordenadas GPS do veículo.
     *
     * @return As coordendas GPS atuais do veículo alugado.
     */
    public String getGps() {
        return this.gps;
    }

    /**
     * Atribui o gps do veículo.
     *
     * @param gps As novas coordenadas GPS a atribuir ao veículo alugado.
     */
    public void setGps(String gps) {
        this.gps = gps;
    }

    /**
     * Retorna o tipo da classe.
     * @return Retorna a String Veículo.
     */
    public String getType() {
        return "Veículo";
    }

    @Override
    public String toString() {
        return this.getType() +
                "\nID: " + this.id +
                "\nGPS: " + this.gps;
    }
}
