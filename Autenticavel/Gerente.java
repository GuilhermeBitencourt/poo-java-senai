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
public class Gerente extends CargoDeConfianca implements Autenticavel{

    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmissao) {
        super(bonificacao, nome, cpf, rg, genero, salarioBase, dataNascimento, dataAdmissao);
    }

    @Override
    public double salarioFinal() {
        return super.salarioBase * Bonificacao.GERENTE.getValor() + super.salarioBase ;
    }
    
    public double  bonificacaoFinal(){
        return super.salarioBase * Bonificacao.GERENTE.getValor();
    }

    @Override
    public String toString() {
        return "\nGerente: " +
                super.toString() + 
                "\nBonificação: " + bonificacaoFinal() + 
                "\nSalário Final: " + salarioFinal();
    }

    
    

    
    
    
    
}
