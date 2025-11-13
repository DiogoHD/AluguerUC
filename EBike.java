package AluguerUC;

/**
 * Casse representativa de uma bicicleta elétrica
 *
 * <p>Estende da classe {@link VeiculoEletrico} de forma a representar o objeto AluguerUC.Bicicleta Elétrica
 * (E-bike), que pode possuir, ou não, uma bateria removível.</p>
 *
 * @since 1.0
 * @see VeiculoEletrico
 * @see Veiculo
 * @author Diogo Neves
 * @author Mário Santos
 * @version 1.0 (11/11/2025)
 */
public class EBike extends VeiculoEletrico {
    private boolean bateriaRemovivel;

    /**
     * Chama o construtor da superclasse de forma a inicializa os atributos
     * id, gps e nível de bateria, e define que a bicicleta elétrica não tem um ecrã LCD.
     *
     * @param id O identificador numérico do veículo alugado.
     * @param gps As coordenadas GPS atuais do veículo alugado.
     * @param nivelBateria O nivel de bateria de um veículo elétrico,
     *                     representado no formato de percentagem (0<x<100).
     *                     Ex: 28.9 corresponde a 28.9% ou 0.289.
     */
    public EBike(int id, String gps, int nivelBateria) {
        super(id, gps, nivelBateria);
        this.bateriaRemovivel = false;
    }

    /**
     * Chama o construtor da superclasse de forma a inicializar os atributos
     * id, gps e nível de bateria, e define se a bicicleta elétrica uma bateria removível.
     *
     * @param id O identificador numérico do veículo alugado.
     * @param gps As coordenadas GPS atuais do veículo alugado.
     * @param nivelBateria O nivel de bateria de um veículo elétrico,
     *                     representado no formato de percentagem (0<x<100).
     *                     Ex: 28.9 corresponde a 28.9% ou 0.289.
     * @param bateriaRemovivel Um valor booleano que define se a trotinete possui uma bateria removível.
     */
    public EBike(int id, String gps, int nivelBateria, boolean bateriaRemovivel) {
        super(id, gps, nivelBateria);
        this.bateriaRemovivel = bateriaRemovivel;
    }

    /**
     * Verifica se a bicicleta elétrica possui uma bateria removível.
     *
     * @return Um valor booleano que verifica se a bicicleta elétrica possui uma bateria removível.
     */
    public boolean isBateriaRemovivel() {
        return bateriaRemovivel;
    }

    /**
     * Define se a bicicleta elétrica possui uma bateria removível.
     *
     * @param bateriaRemovivel Um valor booleano que define se a bicicleta elétrica possui uma bateria removível.
     */
    public void setBateriaRemovivel(boolean bateriaRemovivel) {
        this.bateriaRemovivel = bateriaRemovivel;
    }

    /**
     * Retorna o tipo da classe.
     * @return Retorna a String E-Bike.
     */
    @Override
    public String getType() {
        return "E-Bike";
    }

    @Override
    public String toString() {
        String aux;
        if (this.bateriaRemovivel) aux = "Sim";
        else aux = "Não";

        return super.toString() +
                "\nBateria removível: " + aux;
    }
}
