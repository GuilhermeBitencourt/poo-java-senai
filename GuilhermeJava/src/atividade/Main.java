/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package atividade;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
// Class Principal
public class Main {
    public static void main(String[] args) {
        //Criação de um objeto, o LocalDate vai pedir a data de nascimento do usuario
        Fisica pessoaFisica = new Fisica("123-564-78", "12-546-897-12", LocalDate.of(2003, Month.JULY, 18), "Guilherme", "71988419619");
        Juridica pessoaJuridica = new Juridica("123-546-45", "45.456123", "Brenda", "71988419699");
        
        //Vai printar o Objeto
        System.out.println(pessoaFisica.toString());
        System.out.println("");
        System.out.println(pessoaJuridica.toString());
    }
    
    
    
}
