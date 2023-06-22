
package calculadora;

public class Subtracao implements OperacaoMatematica{

    @Override
    public double calcular(double a, double b) {
     return a - b;
    }

    @Override
    public int calcular(int a, int b) {
        return a - b;
    }

    @Override
    public String calcular(String a, String b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }


    
}
