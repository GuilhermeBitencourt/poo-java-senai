package endereco;

import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @Kaua C Dias
 */
public class Main {
    public static void main(String[] args) {
        Endereco endereco = new Endereco("Rua XYZ", "10", "Apt 2", "42333-222", "Salvador", UnidadeFederativa.BAHIA);
        Pessoa pessoa = new Pessoa(1, "Lucas Jorge", LocalDate.of(2000, Month.JULY, 25), "71 9 8888-5555", "meudeus@hotmail.com", Genero.MASCULINO, endereco);
    
        
        System.out.println("Nome: " + pessoa.getNome() + "\nData de Nascimento: " + pessoa.getDataNascimento() + " Idade: " + pessoa.getIdade() + "\nTelefone: " + pessoa.getTelefone() + "\nEmail: " + pessoa.getEmail() + "\nGenero: " + pessoa.getGenero().getTexto() + "\nEndereço: " + pessoa.getEndereco().toString());
    }
}

