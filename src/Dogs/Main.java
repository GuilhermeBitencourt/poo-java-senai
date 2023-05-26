package Dogs;

/**
 *
 * @Kauã C Dias
 */
public class Main {
    public static void main(String[] args) {
        
        //Animais pet = new Animais();
        Animais pet = new Animais("Bob Marley", 12, "Big", "Carne");
        //Animais petDois = new Animais();
        Animais petDois = new Animais("Brother", 3, "Small", "Ração");


        
        System.out.println("Fazendinha Animal: Bom dia! o sol já nasceu, amiguinho");
        System.out.println("------------------------------------------------------");
        System.out.println("");
        
        System.out.println("Nome: " + pet.getNome() + "\nIdade: " + pet.getIdade() + "\nPorte: " + pet.getPorte() + "\nAlimento: " + pet.getAlimentacao());
               
        System.out.println("");
        System.out.println("Nome: " + petDois.getNome() + "\nIdade: " + petDois.getIdade() + "\nPorte: " + petDois.getPorte() + "\nAlimento: " + petDois.getAlimentacao());

    }
}
