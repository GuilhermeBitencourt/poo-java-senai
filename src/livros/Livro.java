package livros;

/**
 *
 * @Kauã C Dias
 */
public class Livro {
    public static void main(String[] args) {
        
    Caracteristicas livroUm =  new Caracteristicas();
    Caracteristicas livroDois = new Caracteristicas();
    
    
        System.out.println("Biblioteca da Cidade Baixa");
        System.out.println("---------------------------------------------------------------------------------------");
    
    livroUm.setTitulo("Futebol ao sol e à sombra");
    livroUm.setAutor("Eduardo Galeano");
    livroUm.setPaginas(115);
    livroUm.setValor(30);
    
        System.out.println("Livro 1: \n" + livroUm.getTitulo() + "\nAutor: " + livroUm.getAutor() + "\nNumero de Paginas: " + livroUm.getPaginas() + "\nValor: " + livroUm.getValor());   
    
    livroDois.setTitulo("Fechado por motivo de Futebol");
    livroDois.setAutor("Eduardo Galeano");
    livroDois.setPaginas(150);
    livroDois.setValor(40);    
    
        System.out.println("");
        System.out.println("Livro 2: \n" + livroDois.getTitulo() + "\nAutor: " + livroDois.getAutor() + "\nNumero de Paginas: " + livroDois.getPaginas() + "\nValor: " + livroDois.getValor());   
    }
}

