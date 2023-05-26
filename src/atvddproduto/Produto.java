package atvddproduto;

/**
 *
 * @Kaua C Dias
 */
public class Produto {
    private Camisa camisa; 
    private Calca calca;
    private Sapato sapato;

    public Produto(Camisa camisa, Calca calca, Sapato sapato) {
        this.camisa = camisa;
        this.calca = calca;
        this.sapato = sapato;
    }

    public Camisa getCamisa() {
        return camisa;
    }

    public void setCamisa(Camisa camisa) {
        this.camisa = camisa;
    }

    public Calca getCalca() {
        return calca;
    }

    public void setCalca(Calca calca) {
        this.calca = calca;
    }

    public Sapato getSapato() {
        return sapato;
    }

    public void setSapato(Sapato sapato) {
        this.sapato = sapato;
    }

    @Override
    public String toString() {
        return "" + "Camisa = " + camisa + ", Calca = " + calca + ", Sapato = " + sapato;
    }

    
}
