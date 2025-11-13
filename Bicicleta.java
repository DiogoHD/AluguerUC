package AluguerUC;

public class Bicicleta extends Veiculo {
    private boolean individual;

    /**
     * Chama o construtor da superclasse de forma a inicializar os atributos id e gps,
     * e define que a bicicleta é individual.
     *
     * @param id O identificador numérico do veículo alugado.
     * @param gps As coordenadas GPS atuais do veículo alugado.
     */
    public Bicicleta(int id, String gps) {
        super(id, gps);
        this.individual = true;
    }
    /**
     * Chama o construtor da superclasse de forma a inicializar os atributos id e gps,
     * e define se a bicicleta é individual, ou não.
     *
     * @param id O identificador numérico do veículo alugado.
     * @param gps As coordenadas GPS atuais do veículo alugado.
     * @param individual Um valor booleano que define se a bicicleta é individual.
     */
    public Bicicleta(int id, String gps, boolean individual) {
        super(id, gps);
        this.individual = individual;
    }

    /**
     * Verifica se a bicicleta é individual.
     *
     * @return Um valor booleano que verifica se a bicicleta é individual.
     */
    public boolean isIndividual() {
        return individual;
    }

    /**
     * Define se a bicicleta é individual.
     *
     * @param individual Um valor booleano que define se a bicicleta é individual.
     */
    public void setIndividual(boolean individual) {
        this.individual = individual;
    }

    @Override
    public String getType() {
        return "AluguerUC.Bicicleta";
    }

    @Override
    public String toString() {
        String aux;
        if (this.individual) aux = "Sim";
        else aux = "Não";

        return super.toString() +
                "\nIndividual: " + aux;
    }
}
