/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tostring;

/**
 *
 * @author Aluno
 */
public enum Setor {
    ENGENHARIA ("Engenharia"),
    SAUDE ("Saude"),
    JURIDCO ("Jurico");
    
    private final String nome;

    private Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    
    
}
