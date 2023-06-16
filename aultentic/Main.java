/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aultentic;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
     Gerente gerente = new Gerente();
     Motoboy motoboy = new Motoboy();
    
        if (motoboy instanceof Autenticavel) {
            System.out.println("Acesso permitido!");
        }else{
            System.out.println("Permiossão negada!");
        }
        
        
    }
    
    
}
