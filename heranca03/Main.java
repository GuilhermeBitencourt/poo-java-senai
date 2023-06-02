/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca03;

import java.time.LocalDate;
import java.time.Month;

public class Main {

    public static void main(String[] args) {
        
        Diretor diretor = new Diretor(Bonificacao.DIRETOR, "Guilherme", "475.648.102-66", "15.123.456-45", Genero.MASCULINO, Setor.FINANCEIRO, 2500, LocalDate.of(2003, Month.APRIL, 15));
        Gerente gerente = new Gerente(Bonificacao.DIRETOR, "Brenda", "231.654.987-66", "16.123.456-45", Genero.FEMININO, Setor.SAUDE, 3000, LocalDate.of(2001, Month.JULY, 15));
        
        
        System.out.println(diretor.toString());
        System.out.println("");
        System.out.println(gerente.toString());
        
    }
    
}
