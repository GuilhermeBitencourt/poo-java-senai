/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca03;

/**
 *
 * @author Aluno
 */
public enum Genero {
    MASCULINO ("Masculino"),
    FEMININO ("Feminino");
    
    protected final String texto;

    private Genero(String texto) {
        this.texto = texto;
    }

    
    public String getTexto() {
        return texto;
    }

    
    
    
    
}