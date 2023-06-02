/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emrpresa;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class PrestacaoServico extends Juridico{
    private LocalDate contratoInicial;
    private LocalDate contratoFim;

    public PrestacaoServico(LocalDate contratoInicial, LocalDate contratoFim, String cnpj, String inscricaoEstadual, int id, String nome, String telefone, String email, Endereco endereco) {
        super(cnpj, inscricaoEstadual, id, nome, telefone, email, endereco);
        this.contratoInicial = contratoInicial;
        this.contratoFim = contratoFim;
    }

    

    public LocalDate getContratoInicial() {
        return contratoInicial;
    }

    public void setContratoInicial(LocalDate contratoInicial) {
        this.contratoInicial = contratoInicial;
    }

    public LocalDate getContratoFim() {
        return contratoFim;
    }

    public void setContratoFim(LocalDate contratoFim) {
        this.contratoFim = contratoFim;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Contrato Inicial: " + contratoInicial + 
                "Contrato Final: " + contratoFim ;
    }
    
    
    
}
