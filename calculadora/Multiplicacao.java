/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author Aluno
 */
public class Multiplicacao implements OperacaoMatematica{

    @Override
    public double calcular(double a, double b) {
    return a*b;
    }

    @Override
    public int calcular(int a, int b) {
    return a * b;
    }

    @Override
    public String calcular(String a, String b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
    
}
