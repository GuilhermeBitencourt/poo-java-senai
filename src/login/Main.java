package login;

import java.util.Scanner;

/**
 *
 * @Kauã C Dias
 */
public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
                        
        System.out.println("Digite seu nome de usuario ");
        String nome = ler.nextLine();
        System.out.println("Digite sua senha");
        String senha = ler.nextLine();
        
        boolean resultadoNome = nome.equals("Marta");
        boolean resultadoSenha = senha.equals("robotica");
        
        if (resultadoNome && resultadoSenha) {
            System.out.println("Bem vindo, usuario logado!");
        } else {
            System.out.println("Nome de usuario ou senha invalido");
        }
    }
}
