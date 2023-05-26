package atvddproduto;

/**
 *
 * @Kaua C Dias
 */
public class Main {
    public static void main(String[] args) {
        
        Camisa camisa = new Camisa("Lacoste", "Branca", "M", 69.00);
        Calca calca = new Calca("Hering", "Cinza", 39, 119.00);
        Sapato sapato = new Sapato("Adidas", "Preto", 39, 99.00);
        Produto produto = new Produto(camisa, calca, sapato);
        
        System.out.println("Brechó Burguês");
        System.out.println("---------------");
        System.out.println("");
        System.out.println("Kit 1 - Camisa + Calça + Sapato: ");
        System.out.println("");
        System.out.println("Camisa: " + produto.getCamisa().toString());
        System.out.println("Calça: " + produto.getCalca().toString());
        System.out.println("Sapato: " + produto.getSapato().toString());
        
        
    }
}
