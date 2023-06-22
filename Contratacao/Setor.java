/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contratacao;

/**
 *
 * @author Aluno
 */
public enum Setor {
    RECURSOS_HUMANOS("Recursos Humanos"),
    FINANCEIRO ("Financeiro"),
    OPERACOES ("Operações");
    
    protected String nome;

    private Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    
    
}
