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
public class Gerente extends CargoDeConfianca{

    public Gerente(Bonificacao bonificacao, String nome, String cpf, String rg, Genero genero, Setor setor, double salarioBase, LocalDate dataAdmissao) {
        super(bonificacao, nome, cpf, rg, genero, setor, salarioBase, dataAdmissao);
    }

    
    public double getSalarioFinal(){
     return super.salarioBase * Bonificacao.GERENTE.getValor() + super.salarioBase;
    }
    
    public double  getBonificacaoFinal () {
    return super.salarioBase * Bonificacao.GERENTE.getValor();
    }
 
    
    
    @Override
    public String toString() {
        return "\nDiretor: " + 
                super.toString() +
                "\nBonificação: " + getBonificacaoFinal() +
                "\nSalario Final: " + getSalarioFinal();
    }
    
    
    
}
