/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package videogame;

/**
 *
 * @author Aluno
 */
public class Xadrez implements Jogo{

   
    @Override
    public void jogar() {
        System.out.println("===Xadrez===");
        System.out.println("Arrumando o tabuleiro");
        System.out.println("Escolhendo o time");
    }

    @Override
    public void fechar() {
        System.out.println("Partida Finalizada");
    }
    
}
