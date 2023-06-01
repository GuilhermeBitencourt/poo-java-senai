/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_heranca_aula2;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Juridica extends Pessoa{
    private String cnpj;
    private String inscricaoEstudal;
    private LocalDate dataInicio;
    private LocalDate dataTermino;

    public Juridica(String cnpj, String inscricaoEstudal, LocalDate dataInicio, LocalDate dataTermino, int id, String nome, String telefone, Endereco enreco) {
        super(id, nome, telefone, enreco);
        this.cnpj = cnpj;
        this.inscricaoEstudal = inscricaoEstudal;
        this.dataInicio = dataInicio;
        this.dataTermino = dataTermino;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstudal() {
        return inscricaoEstudal;
    }

    public void setInscricaoEstudal(String inscricaoEstudal) {
        this.inscricaoEstudal = inscricaoEstudal;
    }

    public LocalDate getDataInicio() {
        return dataInicio;
    }

    public void setDataInicio(LocalDate dataInicio) {
        this.dataInicio = dataInicio;
    }

    public LocalDate getDataTermino() {
        return dataTermino;
    }

    public void setDataTermino(LocalDate dataTermino) {
        this.dataTermino = dataTermino;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nCNPJ: " + cnpj + 
                "\nInscrição Estadual: " + inscricaoEstudal + 
                "\nData Inicio: " + dataInicio + 
                "\nData Termino: " + dataTermino;
    }
    
    
    
    
    
}
