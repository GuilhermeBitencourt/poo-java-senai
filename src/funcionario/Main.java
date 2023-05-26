package funcionario;

/**
 *
 * @Kauã C Dias
 */
public class Main {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario(1, "Jorge Aragão", 5000.00, EnumSetor.MARKETING, EnumGenero.MASCULINO, 31);
        
        System.out.println("Funcionario: " + funcionario.getNome());
        System.out.println("Salario: " + funcionario.getSalario());
        System.out.println("Setor: " + funcionario.getSetor().getTexto());
        System.out.println("Genero: " + funcionario.getGenero().getTextoGenero());
        System.out.println("Idade: " + funcionario.getIdade());
    }
        
}
