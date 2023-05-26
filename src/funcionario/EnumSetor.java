package funcionario;

/**
 *
 * @Kauã C Dias
 */
public enum EnumSetor {
    FINANCEIRO("Financeiro"),
    RH("RH"),
    VENDAS("Vendas"),
    MARKETING("Marketing");
    
    private String texto;

    private EnumSetor(String texto) {
        this.texto = texto;
    }

    public String getTexto() {
        return texto;
    }
  

}
