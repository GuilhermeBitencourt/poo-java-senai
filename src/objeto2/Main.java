package objeto2;

import java.util.Scanner;

/**
 *
 * @Kauã C Dias
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        
        Personagem dc = new Personagem();
        Personagem marvel = new Personagem();
        
        System.out.println("Escreva o nome de um personagem da DC");
        dc.setNome(ler.nextLine());
        System.out.println("Escreva a habilidade deste personagem");
        dc.setHabilidade(ler.nextLine());
        
        System.out.println("Escreva o nome de um personagem da Marvel");
        marvel.setNome(ler.nextLine());
        System.out.println("Escreva a habilidade deste personagem");
        marvel.setHabilidade(ler.nextLine());
        
        System.out.println("");
        System.out.println("Peronagem DC: " + dc.getNome() + ". Habilidade: " + dc.getHabilidade());
        System.out.println("Personagem Marvel: " + marvel.getNome() + ". Habilidade: " + marvel.getHabilidade());
    }
}
