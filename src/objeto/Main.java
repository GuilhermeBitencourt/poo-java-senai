package objeto;

/**
 *
 * @Kauã C Dias
 */
public class Main {
    public static void main(String[] args) {
    
    Personagem heroi = new Personagem();
    
    heroi.setNome("Batman");
    heroi.setHabilidade("Inteligente");
    
        System.out.println("O personagem da DC " + heroi.getNome() + " é " + heroi.getHabilidade() );
        
    heroi.setNome("Homem Aranha");
    heroi.setHabilidade("Mobilidade");
    
        System.out.println("O personagem da Marvel " + heroi.getNome() + " tem como habilidade: " + heroi.getHabilidade());
    }
}
