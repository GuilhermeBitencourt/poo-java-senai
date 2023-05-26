package aritmeticoscomleitura;

import java.util.Scanner;

/**
 *
 * @Kauã C Dias
 */
public class Main {
    public static void main(String[] args) {
        
        Scanner ler = new Scanner(System.in);
        System.out.println("Vamos calcular!");
        System.out.println("Digite um número");
        int numeroUm = ler.nextInt();
        System.out.println("Digite outro número");
        int numeroDois = ler.nextInt();
        
        int multiplicar = numeroUm * numeroDois;
        int dividir = numeroUm / numeroDois;
        int somar = numeroUm + numeroDois;
        int subtrair = numeroUm - numeroDois;
                
        System.out.println("O resultado da multiplicação é: " + multiplicar);
        
        System.out.println("O resultado da divisão é: " + dividir);
        
        System.out.println("O resultado da soma é: " + somar);
        
        System.out.println("O resultado da subtração é: " + subtrair);
        
        ler.close();
    }
    
}
