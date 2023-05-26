package notaleitura;

import java.util.Scanner;

/**
 *
 * @Kauã C Dias
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Sistema de Notas da Escola Comendador Bernardo Martins Catharino");
        System.out.println("-----------------------------------------------------------------");
        System.out.println("Digite seu nome completo: ");
        String nome = ler.nextLine();
        System.out.println("Digite a nota da avaliação parcial: ");
        Double notaUm = ler.nextDouble();
        System.out.println("Digite a nota da avaliação final: ");
        Double notaDois = ler.nextDouble();
        
        Double media = (notaUm + notaDois)/2;
            
        if (media>=7) {
            System.out.println("\nAprovado"); 
        } else {
            System.out.println("\nReprovado");
        }
        
        System.out.println("\nO aluno " + nome + " ficou com a média " + media);
    }
}
