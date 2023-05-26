package atvddcomputador;
/**
 *
 * @Kauã C Dias
 */
public class Computador {
    private PlacaMae placaMae;
    private Memoria memoria;
    private Processador processador;
    private DispositivoArmazenamento dispositivoArmazenamento;

    public Computador(PlacaMae placaMae, Memoria memoria, Processador processador, DispositivoArmazenamento dispositivoArmazenamento) {
        this.placaMae = placaMae;
        this.memoria = memoria;
        this.processador = processador;
        this.dispositivoArmazenamento = dispositivoArmazenamento;
    }

    public PlacaMae getPlacaMae() {
        return placaMae;
    }

    public void setPlacaMae(PlacaMae placaMae) {
        this.placaMae = placaMae;
    }

    public Memoria getMemoria() {
        return memoria;
    }

    public void setMemoria(Memoria memoria) {
        this.memoria = memoria;
    }

    public Processador getProcessador() {
        return processador;
    }

    public void setProcessador(Processador processador) {
        this.processador = processador;
    }

    public DispositivoArmazenamento getDispositivoArmazenamento() {
        return dispositivoArmazenamento;
    }

    public void setDispositivoArmazenamento(DispositivoArmazenamento dispositivoArmazenamento) {
        this.dispositivoArmazenamento = dispositivoArmazenamento;
    }

    
}
