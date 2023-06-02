/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package emrpresa;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        
        Fornecedor fornecedor = new Fornecedor("Televisão", "123456", "45.123.123", 1, "Guilherme", "7188844-1234", "bgbg0563@gmail.com", 
                 new Endereco("Rua 2 de julho", "402", "casa", "40750-380", "Salvador", UnidadeFederativa.BAHIA));
        PrestacaoServico prestadorServico = new PrestacaoServico(LocalDate.of(2020, Month.MARCH, 10), LocalDate.of(2022, Month.MARCH, 18), "12.123", "12.456", 5, "Isabele", "7191234-1234", "isabele@gmail.com", 
                 new Endereco("Rua 3 de abril", "123", "Casa", "40750-123", "Rio de Janeiro", UnidadeFederativa.RIO_DE_JANEIRO));
        Medico medico = new Medico("231.321", "465.6564.123-45", "12.456.897.12", "41.456.1", Setor.SAUDE, 5000, Genero.FEMININO, EstadoCivil.CASADO, LocalDate.of(1999, Month.MARCH, 25), 2, "Brenda", "7199999-9999", "brenda@gmail.com", 
                new Endereco("Rua 2 de juhlo", "499", "Casa", "40750-999", "Salvcador", UnidadeFederativa.BAHIA));
        Engenheiro engenheiro = new Engenheiro("12.456", "475.123.456","15.456.123.45", "006", Setor.SAUDE, 12500, Genero.MASCULINO, EstadoCivil.CASADO, LocalDate.of(2002, Month.APRIL, 5), 3, "Guilherme", "7194444-1234", "gbgb0563@gmail.com", 
                new Endereco("rua gonzaga", "888", "Apartamento", "40750-888", "São Paulo", UnidadeFederativa.SAO_PAULO));
        
        
        System.out.println(fornecedor.toString());
        
        
        
        
        
    }
}
