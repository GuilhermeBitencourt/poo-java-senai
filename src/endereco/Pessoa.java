package endereco;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @Kaua C Dias
 */
public class Pessoa {
    private int id;
    private String nome;
    private LocalDate dataNascimento;
    private String telefone;
    private String email;
    private Genero genero;
    private Endereco endereco;

    public Pessoa(int id, String nome, LocalDate dataNascimento, String telefone, String email, Genero genero, Endereco endereco) {
        this.id = id;
        this.nome = nome;
        this.dataNascimento = dataNascimento;
        this.telefone = telefone;
        this.email = email;
        this.genero = genero;
        this.endereco = endereco;
    }
    
    public int getIdade() {
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    
    
}
