package Banco;

/**
 *
 * @Kauã C Dias
 */
public class Funcionario {
    
    private String nome;
    private String endereco;
    private Conta contaBanco;

    public Funcionario(String nome, String endereco, Conta contaBanco) {
        this.nome = nome;
        this.endereco = endereco;
        this.contaBanco = contaBanco;
    }

    
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public Conta getContaBanco() {
        return contaBanco;
    }

    public void setContaBanco(Conta contaBanco) {
        this.contaBanco = contaBanco;
    }
    
    
}
