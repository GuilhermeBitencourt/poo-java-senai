package atividadeVeicLiv;

/**
 *
 * @Kauã C Dias
 */
public class Veiculo {
    
    private String placa;
    private String cor;
    private int numeroPassageiros;
    private double capacidadeTanque;
    private double velocidadeMax;
    private String consumoMedio;

    public Veiculo(String placa, String cor, int numeroPassageiros, double capacidadeTanque, double velocidadeMax, String consumoMedio) {
        this.placa = placa;
        this.cor = cor;
        this.numeroPassageiros = numeroPassageiros;
        this.capacidadeTanque = capacidadeTanque;
        this.velocidadeMax = velocidadeMax;
        this.consumoMedio = consumoMedio;
    }


    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getNumeroPassageiros() {
        return numeroPassageiros;
    }

    public void setNumeroPassageiros(int numeroPassageiros) {
        this.numeroPassageiros = numeroPassageiros;
    }

    public double getCapacidadeTanque() {
        return capacidadeTanque;
    }

    public void setCapacidadeTanque(double capacidadeTanque) {
        this.capacidadeTanque = capacidadeTanque;
    }

    public double getVelocidadeMax() {
        return velocidadeMax;
    }

    public void setVelocidadeMax(double velocidadeMax) {
        this.velocidadeMax = velocidadeMax;
    }

    public String getConsumoMedio() {
        return consumoMedio;
    }

    public void setConsumoMedio(String consumoMedio) {
        this.consumoMedio = consumoMedio;
    }
    
    
}

