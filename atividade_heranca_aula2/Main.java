/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_heranca_aula2;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        
         //Endereco endereco = new Endereco("Rua 2 de julho", "427-E", "Casa", "40759-999", "Salvador", UnidadeFederativa.SAO_PAULO);
    Fisica pessoaFisica = new Fisica(Genero.FEMININOO, "213.546.99", "15.213.654.78", LocalDate.of(1995, Month.APRIL, 25),5400, 1, "Brenda Bitencourt", "4002-8922", 
             new Endereco("Rua 2 de Julho", "427", "Casa", "40750-399", "Salvador", UnidadeFederativa.RIO_DE_JANEIRO));
    Juridica pessoaJuridica = new Juridica("213.546.897", "45.123", LocalDate.of(2020, Month.MARCH, 15), LocalDate.of(2022, Month.JULY, 25), 2, "Isabele", "(71)99999-2131", 
             new Endereco("Rua Gonzaga", "213", "Apartamento", "41235-880", "São Paulo", UnidadeFederativa.SAO_PAULO));
        
 
        System.out.println("Dados de Pessos Fisica ");
        System.out.println(pessoaFisica.toString());
    
        System.out.println("Dados de Pessos Juridica ");
        System.out.println(pessoaJuridica.toString());
    
    }
          

}
