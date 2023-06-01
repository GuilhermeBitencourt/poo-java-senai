/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_heranca_aula2;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author Aluno
 */
public class Fisica extends Pessoa{
    private Genero genero;
    private String cpf;
    private String rg;
    private LocalDate dataNascimento;
    private double salario;

    public Fisica(Genero genero, String cpf, String rg, LocalDate dataNascimento, double salario, int id, String nome, String telefone, Endereco enreco) {
        super(id, nome, telefone, enreco);
        this.genero = genero;
        this.cpf = cpf;
        this.rg = rg;
        this.dataNascimento = dataNascimento;
        this.salario = salario;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
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

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getIdade () {
        return Period.between(dataNascimento, LocalDate.now()).getYears(); 
    }

    @Override
    public String toString() {
        return  super.toString() +
                "\nGenero: " + genero.getTexto() + 
                "\nCPF: " + cpf + 
                "\nRG: " + rg + 
                "\nData de Nascimento: " + dataNascimento + 
                "\nSalario: " + salario;
    }
    
    
    
    
    
}
