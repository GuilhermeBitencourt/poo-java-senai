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
public class Main {
    public static void main(String[] args) {
        VideoGame videoGame = new VideoGame();
        
        videoGame.ligar();
        videoGame.jogar(new Xadrez());
        videoGame.fechar();
        videoGame.desligar();
        
        videoGame.ligar();
        videoGame.jogar(new TiroAoAlvoOnline());
        videoGame.fechar();
        videoGame.desligar();
        
        videoGame.ligar();
        videoGame.jogar(new PingPong());
        videoGame.fechar();
        videoGame.desligar();
        
        
        
    }
}
