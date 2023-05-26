package atv5maio;

import java.util.Scanner;

/**
 *
 * @Kauã C Dias
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite seu nome: ");
        String nome = ler.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = ler.nextInt();
    
        System.out.println("Seu nome é: " + nome);
        System.out.println("Seu nome é: " + idade);
        
        ler.close();
    }
    
}
