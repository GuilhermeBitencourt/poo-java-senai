/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisao;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author biten
 */
public class Main {
    public static void main(String[] args) {
        
        Medico medico = new Medico("12.123", "421.123.456.33", "12.123.123.12", "1", SetorFuncionario.SAUDE, 5000, Genero.FEMININO, EstadoCivil.CASADO, LocalDate.of(2002, Month.MARCH, 2), "Brenda", "(71)99999-9999", "brenda@gmail.com", 
                new Endereco("Rua 7 de abril", "12", "Casa", "40750-311", "São Paulo", UnidadeFederativa.SAO_PAULO));
        
        Engenheiro engenheiro = new Engenheiro("12.312", "221.223.412.33", "12.123.123.12", "2", SetorFuncionario.ENGENHARIA, 4000, Genero.MASCULINO, EstadoCivil.SEPARADO, LocalDate.of(2001, Month.JULY, 12), "Brendo", "(71)99999-9999", "brend00@gmail.com", 
                new Endereco("Rua 3 de Gonzaga", "121", "Apartamenot", "12750-311", "Salvador", UnidadeFederativa.BAHIA));
        Motoboy motoboy = new Motoboy("12.762.822.1223", "111.222.333.45", "22.123.123.12", "3", SetorFuncionario.OPERACOES, 2000, Genero.MASCULINO, EstadoCivil.SOLTEIRO, LocalDate.of(2004, Month.NOVEMBER, 16), "Carlos", "(11)99999-9999", "carlos@gmail.com", 
                new Endereco("Rua Almeida Pardas", "781", "Casa", "2231-311", "São Paulo", UnidadeFederativa.SAO_PAULO));
        Diretor diretor = new Diretor("123.456.123;,11", "12,123,456,12", "3", SetorFuncionario.JURIDICO, 6000, Genero.FEMININO, EstadoCivil.VIUVO, LocalDate.of(1996, Month.NOVEMBER, 17), "Isabele", "(71)11111-1111", "isabele@gmail.com", 
        new Endereco("Rua Bitencourt", "61", "Casa", "12683-901", "Níteroi", UnidadeFederativa.RIO_DE_JANEIRO));
        
        
        //System.out.println(medico.toString());
        //System.out.println("");
        //System.out.println(engenheiro.toString());
        //System.out.println("");
        //System.out.println(motoboy.toString());
        //System.out.println("");
        System.out.println(diretor.toString());
        
        diretor.admitir(medico);
        diretor.admitir(engenheiro);
        diretor.admitir(motoboy);
        
        
    }
}
