/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividade_heranca_aula2;

/**
 *
 * @author Aluno
 */
public abstract class Pessoa {
    protected int id;
    protected String nome;
    protected String telefone;
    protected Endereco enreco;

    public Pessoa(int id, String nome, String telefone, Endereco enreco) {
        this.id = id;
        this.nome = nome;
        this.telefone = telefone;
        this.enreco = enreco;
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

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public Endereco getEnreco() {
        return enreco;
    }

    public void setEnreco(Endereco enreco) {
        this.enreco = enreco;
    }

    @Override
    public String toString() {
        return "\nID: " + id + 
                "\nNome: " + nome + 
                "\ntelefone: " + telefone + 
                "\nEndereço: " + enreco + '}';
    }
    
    
    
    
    
}
