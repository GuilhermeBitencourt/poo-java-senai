package funcionario;

/**
 *
 * @Kauã C Dias
 */
public enum EnumGenero {
    MASCULINO("Masculino"),
    FEMININO("Feminino");
    
    private String textoGenero;

    private EnumGenero(String textoGenero) {
        this.textoGenero = textoGenero;
    }

    public String getTextoGenero() {
        return textoGenero;
    }

       
}
