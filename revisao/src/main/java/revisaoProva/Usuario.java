/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisaoProva;

/**
 *
 * @author G
 */
public abstract class Usuario {
    private int idNome;
    private String nome;
    private String email;
    private String Endereco;
    private Emprestimo listaEmprestimo;

    public Usuario(int idNome, String nome, String email, String Endereco, Emprestimo listaEmprestimo) {
        this.idNome = idNome;
        this.nome = nome;
        this.email = email;
        this.Endereco = Endereco;
        this.listaEmprestimo = listaEmprestimo;
    }

    public int getIdNome() {
        return idNome;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getEndereco() {
        return Endereco;
    }

    public Emprestimo getListaEmprestimo() {
        return listaEmprestimo;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setEndereco(String Endereco) {
        this.Endereco = Endereco;
    }
    
    
    
    
    
    
    
    
}
