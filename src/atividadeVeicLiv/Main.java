package atividadeVeicLiv;

/**
 *
 * @Kauã C Dias
 */
public class Main {
    public static void main(String[] args) {
        
    Livro info = new Livro("Sapiens", "Yuval Noah Harari", "1212-122-122-111", 300, 80);
    Veiculo infos = new Veiculo("JPN-1611", "Verde", 5, 55, 220, "3L/km");
    
        System.out.println("Placa: " + infos.getPlaca() + "\nCor: " + infos.getCor() + "\nNumero de Passageiros: " + infos.getNumeroPassageiros() + "\nVelocidade maxima: " + infos.getVelocidadeMax() + "\nCapacidade do tanque: " + infos.getCapacidadeTanque() + "\nConsumo médio: " + infos.getConsumoMedio());
        System.out.println("");
        System.out.println("Nome: " + info.getTitulo() + "\nAutor: " + info.getAutor() + "\nISBM: " + info.getIsbn() + "\nNumero de paginas: " + info.getNumeroPaginas() + "\nValor: " + info.getValor());
    }
}
