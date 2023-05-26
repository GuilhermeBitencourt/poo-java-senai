package obanco;
/**
 *
 * @Kaua C Dias
 */
public class Conta {
    private String banco;
    private int conta;
    private int agencia;
    private String tipoConta;
    private double saldoAtual;
    private double limiteDisponivel;

    public Conta(String banco, int conta, int agencia, String tipoConta, double saldoAtual, double limiteDisponivel) {
        this.banco = banco;
        this.conta = conta;
        this.agencia = agencia;
        this.tipoConta = tipoConta;
        this.saldoAtual = saldoAtual;
        this.limiteDisponivel = limiteDisponivel;
    }

    
    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getConta() {
        return conta;
    }

    public void setConta(int conta) {
        this.conta = conta;
    }

    public int getAgencia() {
        return agencia;
    }

    public void setAgencia(int agencia) {
        this.agencia = agencia;
    }

    public String getTipoConta() {
        return tipoConta;
    }

    public void setTipoConta(String tipoConta) {
        this.tipoConta = tipoConta;
    }

    public double getSaldoAtual() {
        return saldoAtual;
    }

    public void setSaldoAtual(double saldoAtual) {
        this.saldoAtual = saldoAtual;
    }

    public double getLimiteDisponivel() {
        return limiteDisponivel;
    }

    public void setLimiteDisponivel(double limiteDisponivel) {
        this.limiteDisponivel = limiteDisponivel;
    }
    
    
    
}
