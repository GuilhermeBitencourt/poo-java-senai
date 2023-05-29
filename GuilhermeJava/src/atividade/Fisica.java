/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Aluno
 */
//extends vai criar uma extenção da classe "pessoa"
public class Fisica extends Pessoa {
    private String cpf;
    private String rg;
    private LocalDate dataNascimento;

    //Os atributos do Pai tem que parecer no construtor
    public Fisica(String cpf, String rg, LocalDate dataNascimento, String nome, String telefone) {
        super(nome, telefone); // Atributos da classe Pai
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }


    public int getIdade() { //Retornando a idade do usuario, pegando a sua data de mascimento e pegando o ano atual
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    @Override
    public String toString() {
        return super.toString() + // o "super.toString() +" vai buscar o toSting da classe superior no caso a classe PAI.
                "\nCPF: " + cpf + ", \nRG: " + rg + ", \nData de Nascimento: " + dataNascimento + "\nIdade: " + this.getIdade();
    }

   

   
    
    
    
    
    
}
