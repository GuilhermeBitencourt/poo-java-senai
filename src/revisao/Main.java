package revisao;

/**
 *
 * @Kauã C Dias
 */
public class Main {
    public static void main(String[] args) {

    Pessoa personagem = new Pessoa();
    
    personagem.setNome("Cinderela");
    personagem.setIdade(25);
    personagem.setPeso(55);
    personagem.setAltura(180);
    
        System.out.println("Nome: " + personagem.getNome());
        System.out.println("Idade: " + personagem.getIdade());
        System.out.println("Peso: " + personagem.getPeso() + " kg");
        System.out.println("Altura: " + personagem.getAltura() + " cm");
    }
}
