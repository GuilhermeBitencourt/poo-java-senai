/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisao;

/**
 *
 * @author biten
 */
public class Produto extends Fornecedor{
    
    private String nomeProduto;
    private String categoria;
    private double preco;

    public Produto(String nomeProduto, String categoria, double preco, Setor setor, Produto produto, String cnpj, String inscricaoEstadual, String nome, String telefone, String email, Endereco endereco) {
        super(setor, produto, cnpj, inscricaoEstadual, nome, telefone, email, endereco);
        this.nomeProduto = nomeProduto;
        this.categoria = categoria;
        this.preco = preco;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nProduto: " + 
                "\nNome do Produto: " + nomeProduto + 
                "\nCategoria: " + categoria + 
                "\nPreço: " + Util.formatarBRL(preco);
    }

    
    
    
}
