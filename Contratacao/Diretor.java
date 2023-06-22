/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Contratacao;

import java.time.LocalDate;

/**
 *
 * @author Aluno
 */
public class Diretor extends Funcionario implements Contratacao{
    private final double PREMIO = 0.2;

    public Diretor(String nome, LocalDate dataNascimento, Genero genero, Setor setor, double salarioBase) {
        super(nome, dataNascimento, genero, setor, salarioBase);
    }

    public double getPREMIO() {
        return PREMIO;
    }

    @Override
    public double getSalarioFinal() {
        return (super.salarioBase * PREMIO) + super.salarioBase;
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("Admitindo Funcionario" + funcionario.toString());
    }

    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("Demitindo Funcionario" + funcionario.toString());
    }
    
    
    

    
}
