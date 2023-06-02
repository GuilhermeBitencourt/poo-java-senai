/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca03;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Diretor extends CargoDeConfianca{
    final private double PREMIO = 0.1;

    public Diretor(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, Setor setor, double salarioBase, LocalDate dataAdmissao) {
        super(bonificacao, nome, cpf, rg, genero, setor, salarioBase, dataAdmissao);
    }

    public double getPremioFinal(){
     return salarioBase * PREMIO;
    }
        
    public double getSalarioFinal(){
     return salarioBase * bonificacao.DIRETOR.getValor() + salarioBase + getPremioFinal();    
    }
     public double getBonificacaoFinal(){
     return super.salarioBase * Bonificacao.DIRETOR.getValor();
     }
   

    @Override
    public String toString() {
        return "\nDiretor: " + 
                super.toString() +
                "\nBonificação: " + getBonificacaoFinal() +
                "\nPrêmio: " + getPremioFinal() +
                "\nSalario Final: " + getSalarioFinal();
    }

    

    

    
    
    
    
    
}
