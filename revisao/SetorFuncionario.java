/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package revisao;

/**
 *
 * @author biten
 */
public enum SetorFuncionario {
    ENGENHARIA("Engenharia"),
    SAUDE("Saúde"),
    JURIDICO("Juridico"),
    RECURSOS_HUMANOS("Recursos Humanos"),
    MARKETING("Marketing"),
    OPERACOES("Operações");
    
    protected String nome;

    private SetorFuncionario(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    
    
}
