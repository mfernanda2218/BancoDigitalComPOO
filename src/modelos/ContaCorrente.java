package modelos;
public class ContaCorrente extends Conta {
    public ContaCorrente(String agencia, int numeroConta, String nomeTitular, double saldo) {
        super(agencia, numeroConta, nomeTitular, saldo);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("\n=== Extrato Conta Corrente ===");
        System.out.println("Titular: " + nomeTitular);
        System.out.println("Agência: " + agencia);
        System.out.println("Número: " + numeroConta);
        System.out.printf("Saldo: R$ %.2f%n", saldo);
        System.out.println("Histórico:");
        for (String h : historico) System.out.println("- " + h);
    }
}
