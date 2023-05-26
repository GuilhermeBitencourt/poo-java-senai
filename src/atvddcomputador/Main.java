package atvddcomputador;

/**
 *
 * @Kauã C Dias
 */
public class Main {
    public static void main(String[] args) {
      
        Processador processador =  new Processador("intel", "i5", 500);
        PlacaMae placaMae = new PlacaMae("Asus", "Ddr4", "Prime A320");
        Memoria memoria = new Memoria("Netac", "A320M", 4);
        DispositivoArmazenamento dispositivoArmazenamento = new DispositivoArmazenamento("Kingston", "1400 N", 500);
        Computador computador = new Computador(placaMae, memoria, processador, dispositivoArmazenamento);
        
        System.out.println("Computador do SENAI");
        System.out.println("--------------------");
        System.out.println("Modelo da placa mãe: " + computador.getPlacaMae().getModelo());
        System.out.println("Marca da placa mãe: " + computador.getPlacaMae().getMarca());
        System.out.println("Soquete da placa mãe: " + computador.getPlacaMae().getSoquete());
        System.out.println("Modelo da memória: " + computador.getMemoria().getModelo());
        System.out.println("Marca da memória: " + computador.getMemoria().getMarca());
        System.out.println("Capacidade da memória: " + computador.getMemoria().getCapacidadeArmazenamento());
        System.out.println("Modelo do processador: " + computador.getProcessador().getModelo());
        System.out.println("Marca do processador: " + computador.getProcessador().getMarca());
        System.out.println("Frequencia do processador: " + computador.getProcessador().getFrequencia());
        System.out.println("Modelo do Armazenamento: " + computador.getDispositivoArmazenamento().getModelo());
        System.out.println("Marca do Armazenamento: " + computador.getDispositivoArmazenamento().getMarca());
        System.out.println("Capacidade da placa mãe: " + computador.getDispositivoArmazenamento().getCapacidadeArmazenamento());
        
    }
}
