package obanco;

/**
 *
 * @Kauã C Dias
 */
public class Main {
    public static void main(String[] args) {
        
        Conta contaBanco = new Conta("inter", 100, 200, "Corrente", 12, 22);
        Funcionario funcionario = new Funcionario(25, "kcd", "rmbsp", 10, "kaskakska", contaBanco);
    
        System.out.println("Nome: " + funcionario.getNome());
        System.out.println("Endereço: " + funcionario.getEndereco());
        System.out.println("Conta: " + funcionario.getContaBanco().getConta());
        System.out.println("Banco: " + funcionario.getContaBanco().getBanco());
        System.out.println("Agencia: " + funcionario.getContaBanco().getAgencia());
        System.out.println("Tipo: " + funcionario.getContaBanco().getTipoConta());
        System.out.println("Saldo: " + funcionario.getContaBanco().getSaldoAtual());
        System.out.println("Limite: " + funcionario.getContaBanco().getLimiteDisponivel());
    }
}
