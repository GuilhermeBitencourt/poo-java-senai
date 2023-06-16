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
public class Diretor extends CargoDeConfianca implements Autenticavel{
    private final double PREMIO;

    public Diretor(double PREMIO, Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, double salarioBase, LocalDate dataNascimento, LocalDate dataAdmissao) {
        super(bonificacao, nome, cpf, rg, genero, salarioBase, dataNascimento, dataAdmissao);
        this.PREMIO = PREMIO;
    }

    public Bonificacao getBonificacao() {
        return bonificacao;
    }

    public void setBonificacao(Bonificacao bonificacao) {
        this.bonificacao = bonificacao;
    }

    public double getPremioFinal(){
        return PREMIO * super.salarioBase;
    }
    
    
    public double getBonificacaoFinal(){
        return super.salarioBase * Bonificacao.DIRETOR.getValor();
    }
    
    @Override
    public double salarioFinal() {
        return super.salarioBase * Bonificacao.DIRETOR.getValor() + super.salarioBase + getPremioFinal();
    }

    @Override
    public String toString() {
        return "\nDiretor: " + 
                super.toString() +
                "\nPremio por cargo de Diretor: " + getPremioFinal() +
                "\nPremio por cargo de confiança: " + getBonificacaoFinal() + 
                "\nSalário Final: " + salarioFinal(); 
    }
    
    
    
    
    
}
