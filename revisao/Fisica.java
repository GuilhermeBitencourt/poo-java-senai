/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisao;

import java.time.LocalDate;
import java.time.Period;

/**
 *
 * @author biten
 */
public abstract class Fisica extends Pessoa {
    
    protected Genero genero;
    protected EstadoCivil estadoCivil;
    protected LocalDate dataNascimento;

    public Fisica(Genero genero, EstadoCivil estadoCivil, LocalDate dataNascimento, String nome, String telefone, String email, Endereco endereco) {
        super(nome, telefone, email, endereco);
        this.genero = genero;
        this.estadoCivil = estadoCivil;
        this.dataNascimento = dataNascimento;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public EstadoCivil getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(EstadoCivil estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public LocalDate getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(LocalDate dataNascimento) {
        this.dataNascimento = dataNascimento;
    }
    
    public int getIdade(){
        return Period.between(dataNascimento, LocalDate.now()).getYears();
    }
    
    
    @Override
    public String toString() {
        return 
                super.toString() +
                "\nGênero: " + genero.getTexto() + 
                "\nEstado Civil: " + estadoCivil.getTexto() + 
                "\nData de Nascimento: " + Util.formatarData(dataNascimento) + 
                "\nIdade: " + getIdade();
    }

    
    
    
    
}
