package mamao;

/**
 *
 * @Kauã C Dias
 */
public class Main {
    public static void main(String[] args) {
        //Declaração de variaveis
        String nome = "Mercadinho da CBX";
        float valor = 25;
        
        //Operação
        float dividir = valor / 5;
        
        //Exibindo resultados
        System.out.println("Obrigado por comprar no mercadinho da CBX");
        System.out.println("A 1ª prestação custará " + dividir);
        System.out.println("A 2ª prestação custará " + dividir);
        System.out.println("A 3ª prestação custará " + dividir);
        System.out.println("A 4ª prestação custará " + dividir);
        System.out.println("A 5ª prestação custará " + dividir);
        System.out.println("Total: " + valor);
    }
}
