package Notas;

/**
 *
 * @Kauã C Dias
 */
public class Main {
    public static void main(String[] args) {
        
        //variaveis
        String nome = "Ferran Soriano";
        double notaUm = 8;
        double notaDois = 6.8;
               
        //Operação
        double media = (notaUm+notaDois)/2;
               
        //resultados
        System.out.println("O aluno " + nome + " ficou com média " + media);
        
        //SE
        if (media>=7) {
            System.out.println("Aprovado");
        } else {
            System.out.println("Reprovado");
        }
        
    }
}
