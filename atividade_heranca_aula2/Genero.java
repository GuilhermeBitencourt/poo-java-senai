/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_heranca_aula2;

/**
 *
 * @author Aluno
 */
public enum Genero {
    MASCULINO ("Masculino"),
    FEMININOO ("Feminino");
    
    private final String texto;

    private Genero(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }

    
    
    
    
    
    
}
