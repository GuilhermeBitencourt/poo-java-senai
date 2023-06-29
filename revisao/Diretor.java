/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisao;

import java.time.LocalDate;

/**
 *
 * @author biten
 */
public class Diretor extends Funcionario implements Contratatacao{

    private final double PREMIO = 0.2;

    public Diretor(String cpf, String rg, String matricula, SetorFuncionario setor, double salario, Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(cpf, rg, matricula, setor, salario, genero, estadoCivil, dataNascimento, nome, telefone, email, endereco);
    }

    public double getPREMIO() {
        return PREMIO;
    }
    
    public double getSalarioFinal(){
        return super.salario * PREMIO + super.salario;
    }

    @Override
    public void admitir(Funcionario funcionario) {
        System.out.println("\nDiretor admitiu Funcionario: " + funcionario.toString());
    }
    
    @Override
    public void demitir(Funcionario funcionario) {
        System.out.println("\nDiretor demitindo Funcionario: " + funcionario.toString());
    }

    @Override
    public String toString() {
        return "Diretor: " +
                super.toString() +
                "\nPrêmio: " + PREMIO + 
                "\nSalário Base: " + Util.formatarBRL(super.salario) + 
                "\nSalário Final: " + Util.formatarBRL(getSalarioFinal());
    }
    
    
    
    
    
    
}
