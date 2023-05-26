package criterioescola;

import java.util.Scanner;

/**
 *
 * @Kauã C Dias
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Digite seu nome completo ");
        String nome = ler.nextLine();
        System.out.println("Digite a primeira nota ");
        double notaUm = ler.nextDouble();
        System.out.println("Digite a segunda nota ");
        double notaDois = ler.nextDouble();
        
        double media = (notaUm + notaDois)/2;
        
        if (media>=7) {
            System.out.println("Aluno " + nome + " Aprovado");
        } else if (media>5 && media<7){
            System.out.println("Aluno " + nome + " necessita Verificação Suplementar");
        } else{
            System.out.println("Aluno " + nome + " Reprovado");
        }
        
        System.out.println("\nSua média é: " + media);
    }
}
