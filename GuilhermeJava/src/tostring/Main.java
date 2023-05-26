/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tostring;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("RUA 2 DE JULHO", "427", "CASA", "40750-380", "Salvador", UnidadeFederativa.BAHIA);
        Funcionario funcionario = new Funcionario(213, "Guilherme", "475-648-018-99", "15-213-546-66", "213-546", LocalDate.of(2003, Month.JUNE, 20), Genero.MASCULINO, Setor.SAUDE, 5.000, "4002-8922", "bitencourt0563@gmail.com", endereco, 0);
        
        System.out.println("===Funcionario===");
        System.out.println("Dados: " +funcionario.toString());
        
        
        
    }
}
