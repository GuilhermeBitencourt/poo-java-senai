/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Autenticavel;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Motoboy extends Funcionario{

    private String placaDaMoto;

    public Motoboy(String placaDaMoto, String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmissao) {
        super(nome, cpf, rg, genero, salarioBase, dataNascimento, dataAdmissao);
        this.placaDaMoto = placaDaMoto;
    }

    public String getPlacaDaMoto() {
        return placaDaMoto;
    }

    public void setPlacaDaMoto(String placaDaMoto) {
        this.placaDaMoto = placaDaMoto;
    }
    
    @Override
    public double salarioFinal() {
       return salarioBase;
    }

   
    @Override
    public String toString() {
        return "\nMotoboy: " + 
                super.toString() +
               "\nPlaca Da Moto: " + placaDaMoto;
        
    }

    
    

    

   
    
    
    
    
}
