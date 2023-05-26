package endereco;

/**
 *
 * @Kaua C Dias
 */
public enum Genero {
    MASCULINO("Masculino", 'M'),
    FEMININO("Feminino", 'F');
    
    private final String texto;
    private final char caractere;

    private Genero(String texto, char caractere) {
        this.texto = texto;
        this.caractere = caractere;
    }

    public String getTexto() {
        return texto;
    }

    public char getCaractere() {
        return caractere;
    }
    
    
}
