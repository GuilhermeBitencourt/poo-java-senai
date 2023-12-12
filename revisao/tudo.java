/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public abstract class usuario {
    
    
    private int idUsuario;
    private String nome;
    private String email;
    private String logradouro;
    private String cidade;
    private String estado;
    private String CEP;
    private int numero;

    ArrayList<emprestimo>  emprestimos = new ArrayList();

    public usuario(int idUsuario, String nome, String email, String logradouro, String cidade, String estado, String CEP, int numero) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.email = email;
        this.logradouro = logradouro;
        this.cidade = cidade;
        this.estado = estado;
        this.CEP = CEP;
        this.numero = numero;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getLogradouro() {
        return logradouro;
    }

    public void setLogradouro(String logradouro) {
        this.logradouro = logradouro;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public ArrayList<emprestimo> getEmprestimos() {
        return emprestimos;
    }

    public void devolverLivro(int idEmprestimo){
        LocalDate hoje = LocalDate.now();
        int tam = emprestimos.size();
        emprestimo emp;
        boolean achou=false;
        
        int p;
        for(p=0;p<tam;p++){
            emp = emprestimos.get(p);
            if (emp.getIdEmprestimo()== idEmprestimo){
                achou=true;
                if (emp.getDataDevolucaoRealizada()==null){
                    //devolver os livros
                    emp.devolverEmp(hoje);
                }else{
                    throw new EmprestimoNaoPendenteException();
                }
            }
        }
        if (!achou){
            throw new EmprestimoNaoEncontradoException();
        }
        
        
        
    }
    
    public abstract void realizarEmprestimo(int idEmprestimo, ArrayList<livro> livros);
    
}
//===========

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao;

/**
 *
 * @author Aluno
 */
public class EmprestimoNaoEncontradoException extends RuntimeException {

    
}
//======================================
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao;

/**
 *
 * @author Aluno
 */
public class EmprestimoNaoPendenteException extends RuntimeException{

}

//=============================================
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao;

/**
 *
 * @author Aluno
 */
public class ExitePendenciaException extends RuntimeException {

}

//=====================================================
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao;

/**
 *
 * @author Aluno
 */
public class LimiteExcedidoException extends RuntimeException {

   
}
//==========================================
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao;

/**
 *
 * @author Aluno
 */
public class QuantidadeInvalidaException extends Exception{

    
}
//====================================

package revisao;

public class ValorInvalidoException extends RuntimeException {
	public ValorInvalidoException (String mensagem){
		super(mensagem);
	} 
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//===========
package revisao;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class aluno extends usuario{

    public aluno(int idUsuario, String nome, String email, String logradouro, String cidade, String estado, String CEP, int numero) {
        super(idUsuario, nome, email, logradouro, cidade, estado, CEP, numero);
    }

    @Override
    public void realizarEmprestimo(int idEmprestimo, ArrayList<livro> livros) {
        LocalDate hoje = LocalDate.now();

        for(emprestimo emp : emprestimos){
            if (emp.getDataDevolucaoRealizada()==null){
                if (emp.getDataDevolucaoPrevista().compareTo(hoje)>0){
                    throw new ExitePendenciaException();
                }

            }
        }

        if (livros.size()<=3) {

            LocalDate data = hoje.plusDays(5);

            emprestimo novoEmprestimo = new emprestimo(idEmprestimo, this, hoje, data);

            novoEmprestimo.livrosEmprestados = livros;
            
            emprestimos.add(novoEmprestimo);
        }else{
            throw new LimiteExcedidoException();
        }

    }
}

 
//==================

package revisao;

public class autor {
    int idAutor;
    String nomeAutor;

    public autor(int idAutor, String nomeAutor) {
        this.idAutor = idAutor;
        this.nomeAutor = nomeAutor;
    }

    public int getIdAutor() {
        return idAutor;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public autor() {
    }
}

//==============

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao;

/**
 *
 * @author Aluno
 */
public class categoria {
    private int idCategoria;
    private String nomeCategoria;

    public categoria(int idCategoria, String nomeCategoria) {
        this.idCategoria = idCategoria;
        this.nomeCategoria = nomeCategoria;
    }

    public int getIdCategoria() {
        return idCategoria;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    
}

//============

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao;

import java.time.LocalDate;
import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class emprestimo {
    private int idEmprestimo;
    private usuario usuario;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucaoPrevista;
    private LocalDate dataDevolucaoRealizada;

    ArrayList<livro> livrosEmprestados = new ArrayList();

    public emprestimo(int idEmprestimo, usuario usuario, LocalDate dataEmprestimo, LocalDate dataDevolucaoPrevista) {
        this.idEmprestimo = idEmprestimo;
        this.usuario = usuario;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
        this.dataDevolucaoRealizada = null;
    }

    public ArrayList<livro> getLivrosEmprestados() {
        return livrosEmprestados;
    }

    public int getIdEmprestimo() {
        return idEmprestimo;
    }

    public usuario getUsuario() {
        return usuario;
    }

    public LocalDate getDataEmprestimo() {
        return dataEmprestimo;
    }

    public LocalDate getDataDevolucaoPrevista() {
        return dataDevolucaoPrevista;
    }

    public LocalDate getDataDevolucaoRealizada() {
        return dataDevolucaoRealizada;
    }

    

    public void devolverEmp(LocalDate dtDevolucao) {
        this.dataDevolucaoRealizada = dtDevolucao;
        for(livro livroEmp : livrosEmprestados){
            livroEmp.devolver();
        }     
    }

   
    
}

//===========
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package revisao;

import java.util.ArrayList;

/**
 *
 * @author Aluno
 */
public class livro {
    private int ISBN;
    private String titulo;
    private int anoPublicacao;
    private int quantExemplares;
    private categoria categoriaLivro;

    private ArrayList<autor> autores = new ArrayList();


    public livro(int ISBN, String titulo, int anoPublicacao, int quantExemplares, categoria categoriaLivro, ArrayList<autor> autores) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        if (anoPublicacao > 0) {
            this.anoPublicacao = anoPublicacao;
        }else{
            throw new ValorInvalidoException("Ano de Publicação inválido!");
        }
        if (quantExemplares > 0){
            this.quantExemplares = quantExemplares;
        }else{
            throw new ValorInvalidoException("Quantidade de Exemplares inválido!");
        }

        this.categoriaLivro = categoriaLivro;

        if (autores.size() > 0){
            this.autores = autores;
        }else{
            throw new ValorInvalidoException("Livro sem autor!");
        }
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    public categoria getCategoriaLivro() {
        return categoriaLivro;
    }

    public int getQuantExemplares() {
        return quantExemplares;
    }

    public void setQuantExemplares(int quantExemplares) throws QuantidadeInvalidaException {
        if (quantExemplares>=0){
            this.quantExemplares = this.quantExemplares + quantExemplares;
        }else{
            throw new QuantidadeInvalidaException();
        }
    }
    
    public void devolver(){
        this.quantExemplares++;
    }
    
    
    public void emprestar(){
        this.quantExemplares--;
    }
    
    
    
    

    
}

//=======================
package revisao;

import java.time.LocalDate;
import java.util.ArrayList;

public class professor extends usuario {

    public professor(int idUsuario, String nome, String email, String logradouro, String cidade, String estado, String CEP, int numero) {
        super(idUsuario, nome, email, logradouro, cidade, estado, CEP, numero);
    }

    @Override
    public void realizarEmprestimo(int idEmprestimo, ArrayList<livro> livros) {
        LocalDate hoje = LocalDate.now();

        for (emprestimo emp : emprestimos) {
            if (emp.getDataDevolucaoRealizada() == null) {
                if (emp.getDataDevolucaoPrevista().compareTo(hoje) > 0) {
                    throw new ExitePendenciaException();
                }

            }
        }

        if (livros.size() <= 5) {

            LocalDate data = hoje.plusDays(15);

            emprestimo novoEmprestimo = new emprestimo(idEmprestimo, this, hoje, data);

            novoEmprestimo.livrosEmprestados = livros;

            emprestimos.add(novoEmprestimo);
        } else {
            throw new LimiteExcedidoException();
        }

    }
}





