/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package revisaoProva;

import java.time.LocalDate;

/**
 *
 * @author G
 */
public class Emprestimo {
    private int idEmprestimo;
    private LocalDate dataEmprestimo;
    private LocalDate dataDevolucaoPrevista;
    private LocalDate dataDevolucaoRealizada;

    public Emprestimo(int idEmprestimo, LocalDate dataEmprestimo, LocalDate dataDevolucaoPrevista, LocalDate dataDevolucaoRealizada) {
        this.idEmprestimo = idEmprestimo;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucaoPrevista = dataDevolucaoPrevista;
        this.dataDevolucaoRealizada = dataDevolucaoRealizada;
    }

    public int getIdEmprestimo() {
        return idEmprestimo;
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

    @Override
    public String toString() {
        return "idEmprestimo: " + idEmprestimo + 
                "Data de Emprestimo: " + dataEmprestimo + 
                "Data de Devoluçao Prevista: " + dataDevolucaoPrevista + 
                "Data de Devoluçao Realizada: " + dataDevolucaoRealizada;
    }
    
    
    
    
}
