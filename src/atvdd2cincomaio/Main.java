package atvdd2cincomaio;

import java.util.Scanner;

/**
 *
 * @Kauã C Dias
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        //scann + ctrl + espaço + ler = new Scanner(System.in)
        
        
        final String CPF = "123.526.555-88";
        
        System.out.println("Digite seu nome: ");
        String nome = ler.nextLine();
        System.out.println("Digite sua idade: ");
        int idade = ler.nextInt();
        System.out.println("Digite seu peso: ");
        double peso = ler.nextDouble();
        //tipo da variavel + nome da variavel = ler.nextTipodaVariavel        
        
        System.out.println("");
        System.out.println("Seu nome é: " + nome);
        System.out.println("Sua idade é: " + idade);
        System.out.println("Seu peso é: " + peso);
        System.out.println("Seu CPF é: " + CPF);
        
        ler.close();
        //fechar processo de leitura
    }
}
