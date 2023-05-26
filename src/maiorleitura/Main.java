package maiorleitura;

import java.util.Scanner;

/**
 *
 * @Kauã C Dias
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Escreva um número");
        int numeroUm = ler.nextInt();
        System.out.println("Escreva outro número");
        int numeroDois = ler.nextInt();
        
        if (numeroUm>numeroDois) {
            System.out.println("O maior numero é: " + numeroUm);
        } else if (numeroDois>numeroUm) {
            System.out.println("O maior numero ´é: " + numeroDois);
        }
        else {
            System.out.println("Os numeros sao iguais");
        }
            
        System.out.println("-------------------------------------");
        System.out.println("Vamos descobrir o menor de outros dois numeros");
        System.out.println("Escreva um numero");
        int numeroTres = ler.nextInt();
        System.out.println("Digite outro numero");
        int numeroQuatro = ler.nextInt();
        
        if (numeroTres<numeroQuatro) {
            System.out.println("o menor numero é: " + numeroTres);
        } else if (numeroQuatro<numeroTres) {
            System.out.println("O menor numero é: " + numeroQuatro);
        }
        else {
            System.out.println("Os numeros sao iguais");
        }
        ler.close();
    }
}
