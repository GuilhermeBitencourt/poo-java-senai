package atvddproduto;

/**
 *
 * @Kaua C Dias
 */
public class Camisa {
    private String marca;
    private String cor;
    private String tamanho;
    private double preco;

    public Camisa(String marca, String cor, String tamanho, double preco) {
        this.marca = marca;
        this.cor = cor;
        this.tamanho = tamanho;
        this.preco = preco;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getTamanho() {
        return tamanho;
    }

    public void setTamanho(String tamanho) {
        this.tamanho = tamanho;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return "" + "Marca = " + marca + ", Cor = " + cor + ", Tamanho = " + tamanho + ", Preco = " + preco;
    }
    
    
}