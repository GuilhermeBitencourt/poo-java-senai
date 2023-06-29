/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package revisao;

/**
 *
 * @author biten
 */
public enum Setor {
    
    TECNOLOGIA ("Tecnologia"),
    MATERIAL_CONSTRUCAO("Material de Construção"),
    MATERIA_PRIMA("Materia Prima"),
    ALIMENTICIO("Alimenticio");
    
    protected String nome;

    private Setor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
    
    
    
}
