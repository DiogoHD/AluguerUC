package AluguerUC;

/**
 * Casse representativa de uma trotinete elétrica
 *
 * <p>Estende da classe {@link VeiculoEletrico} de forma a representar o objeto AluguerUC.Trotinete,
 * que pode possuir, ou não, um ecrã LCD.</p>
 *
 * @since 1.0
 * @see VeiculoEletrico
 * @see Veiculo
 * @author Diogo Neves
 * @author Mário Santos
 * @version 1.0 (11/11/2025)
 */
public class Trotinete extends VeiculoEletrico {
    private boolean ecraLCD;

    /**
     * Chama o construtor da superclasse de forma a inicializar
     * os atributos id, gps e nível de bateria, e define que a trotinete não tem um ecrã LCD.
     *
     * @param id O identificador numérico do veículo alugado.
     * @param gps As coordenadas GPS atuais do veículo alugado.
     * @param nivelBateria O nivel de bateria de um veículo elétrico,
     *                     representado no formato de percentagem (0<x<100).
     *                     Ex: 28.9 corresponde a 28.9% ou 0.289.
     */
    public Trotinete(int id, String gps, int nivelBateria) {
        super(id, gps, nivelBateria);
        this.ecraLCD = false;
    }

    /**
     * Chama o construtor da superclasse de forma a inicializar
     * os atributos id, gps e nível de bateria, e define se tem um ecrã LCD.
     *
     * @param id O identificador numérico do veículo alugado.
     * @param gps As coordenadas GPS atuais do veículo alugado.
     * @param nivelBateria O nivel de bateria de um veículo elétrico,
     *                     representado no formato de percentagem (0<x<100).
     *                     Ex: 28.9 corresponde a 28.9% ou 0.289.
     * @param ecraLCD Um valor booleano que define se a trotinete possui um ecrã LCD.
     */
    public Trotinete(int id, String gps, int nivelBateria, boolean ecraLCD) {
        super(id, gps, nivelBateria);
        this.ecraLCD = ecraLCD;
    }

    /**
     * Verifica se a trotinete possui um ecrã LCD.
     *
     * @return Um valor booleano que verifica se a trotinete possui um ecrã LCD.
     */
    public boolean isEcraLCD() {
        return ecraLCD;
    }

    /**
     * Define se a trotinete possui um ecrã LCD.
     *
     * @param ecraLCD Um valor booleano que define se a trotinete possui um ecrã LCD.
     */
    public void setEcraLCD(boolean ecraLCD) {
        this.ecraLCD = ecraLCD;
    }

    /**
     * Retorna o tipo da classe.
     * @return Retorna a String Trotinete.
     */
    @Override
    public String getType() {
        return "Trotinete";
    }

    @Override
    public String toString() {
        String aux;
        if (this.ecraLCD) aux = "Sim";
        else aux = "Não";

        return super.toString() +
                "\nEcrã LCD: " + aux;
    }
}
