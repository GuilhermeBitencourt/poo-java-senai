package booltabelaverdade;

/**
 *
 * @Kauã C Dias
 */
public class Main {
    public static void main(String[] args) {
        
        //Declaração de variaveis
        boolean temSol = true;
        boolean folga = false;
        
        //O retorno só sera "irei ir passear hoje!!! =D" se TODAS as condições forem true.
        if (temSol && folga) {
            System.out.println("irei ir passear hoje!!! =D");
        } else {
            System.out.println("Não irei passear! =C");
        }
    }
}
