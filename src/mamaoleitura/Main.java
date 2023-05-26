package mamaoleitura;

import java.util.Scanner;

/**
 *
 * @Kauã C Dias
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        
        System.out.println("Bem vindo a Loja Mamão com açucar");
        System.out.println("Digite o valor da compra");
        float valor = ler.nextFloat();
        
        float dividir = valor / 5;
        
        System.out.println("Sua compra custa " + valor + " reais");
        System.out.println("Deseja parcelar em 5 vezes? \n Digite 1 para Sim \n Digite 0 para não");
        int parcelar = ler.nextInt();
        if (parcelar == 1) {
            System.out.println("A 1º parcela custará " + dividir + " reais");
            System.out.println("A 2º parcela custará " + dividir + " reais");
            System.out.println("A 3º parcela custará " + dividir + " reais");
            System.out.println("A 4º parcela custará " + dividir + " reais");
            System.out.println("A 5º parcela custará " + dividir + " reais");
        } else {
            System.out.println("Obrigado por comprar conosco. Pague " + valor + " ao caixa");
        }
        System.out.println("");
    }
}
