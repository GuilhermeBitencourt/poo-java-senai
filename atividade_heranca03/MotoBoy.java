/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_heranca03;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class MotoBoy extends Funcionario{
    private String placaDeMoto;

    public MotoBoy(String placaDeMoto, String nome, String cpf, String rg, Genero genero, Setor setor, double salarioBase, LocalDate dataAdmissao) {
        super(nome, cpf, rg, genero, setor, salarioBase, dataAdmissao);
        this.placaDeMoto = placaDeMoto;
    }

    
    
    
    public double getSalarioFinal(){
        return salarioBase;
    
    }

    public String getPlacaDeMoto() {
        return placaDeMoto;
    }

    public void setPlacaDeMoto(String placaDeMoto) {
        this.placaDeMoto = placaDeMoto;
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nPlaca Da Moto:" + placaDeMoto;
    }
    
    
    
    
    
   
    
    
    
    
}
