
package calculadora;

public class Main {
    public static void main(String[] args) {
        Soma soma = new Soma();
        Subtracao subtracao = new Subtracao();
        Multiplicacao multiplicacao = new Multiplicacao();
        Divisao divisao = new Divisao();
        
        
        System.out.println("Realizando todas as operações matematicas" 
                + "\nSoma = " + soma.calcular("o", "lá!")
                + "\nSubtração = " + subtracao.calcular(20.0, 10.0)
                + "\nDivisão = " + divisao.calcular(20, 10)
                + "\nMultiplicação = " + multiplicacao.calcular(20, 10));
        
    }
    
}
