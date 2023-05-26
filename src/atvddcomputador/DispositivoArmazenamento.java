package atvddcomputador;
/**
 *
 * @Kaua C Dias
 */

public class DispositivoArmazenamento {
    private String marca;
    private String modelo;
    private double capacidadeArmazenamento;

    public DispositivoArmazenamento(String marca, String modelo, double capacidadeArmazenamento) {
        this.marca = marca;
        this.modelo = modelo;
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public double getCapacidadeArmazenamento() {
        return capacidadeArmazenamento;
    }

    public void setCapacidadeArmazenamento(double capacidadeArmazenamento) {
        this.capacidadeArmazenamento = capacidadeArmazenamento;
    }
    
    
}
