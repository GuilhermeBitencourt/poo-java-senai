/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package heranca;

/**
 *
 * @author Aluno
 */
public class Main {
    public static void main(String[] args) {
        
        Motoboy funcionarioMotoboy = new Motoboy("15-456-456", "Fabiano", "475.456.78", "15.987.654-25", 1200);
        Engenheiro funcionarioEngenheiro = new Engenheiro("41.55565", "Brenda", "475-648-108-66", "15.456.789-55", 5500);
        Medico funcionarioMedico = new Medico("55.123", "Isabele","845.456.12", "15.546.213.12", 11000);
        
        System.out.println(funcionarioMedico.toString());
        System.out.println("");
        System.out.println(funcionarioEngenheiro.toString());
        System.out.println("");
        System.out.println(funcionarioMotoboy.toString());
        
        
        
    }
}
