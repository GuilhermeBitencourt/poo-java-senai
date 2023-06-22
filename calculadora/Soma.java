
package calculadora;

public class Soma implements OperacaoMatematica{

    @Override
    public double calcular(double a, double b) {
     return a + b;
    }

    @Override
    public int calcular(int a, int b) {
        return a + b;
    }

    @Override
    public String calcular(String a, String b) {
        return a + b;
    }
    
    
}
