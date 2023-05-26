package nomesenha;

/**
 *
 * @Kauã C Dias
 */
public class Main {
    public static void main(String[] args) {
        
        //Declaração de variaveis
        String nomeUsuario = "Marta";
        int senha = 123;
        
        //Compracao de Strings e inteiros
        boolean resultadoNome = nomeUsuario.equals("Marta");
        boolean resultadoSenha = (senha == 456);
        
        //Exibindo resultados 
        System.out.println("O nome do usuario está correto? " + resultadoNome);
        System.out.println("A senha está correta? " + resultadoSenha);
    }
}
