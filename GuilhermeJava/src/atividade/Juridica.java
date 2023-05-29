/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade;

/**
 *
 * @author Aluno
 */
//extends vai criar uma extenção da classe "pessoa"
public class Juridica extends Pessoa {
    
    private String cnpj;
    private String inscricaoEstadual;

    //Os atributos do Pai tem que parecer no construtor
    public Juridica(String cnpj, String inscricaoEstadual, String nome, String telefone) {
        super(nome, telefone);
        this.cnpj = cnpj;
        this.inscricaoEstadual = inscricaoEstadual;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getInscricaoEstadual() {
        return inscricaoEstadual;
    }

    public void setInscricaoEstadual(String inscricaoEstadual) {
        this.inscricaoEstadual = inscricaoEstadual;
    }
    
    
    @Override
    public String toString() {
        return super.toString() + // o "super.toString() +" vai buscar o toSting da classe superior no caso a classe PAI.
                "\nCNPJ: " + cnpj + 
                "\nInscrição Estadual: " + inscricaoEstadual;
    }

    
    
    
}
