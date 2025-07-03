public class ContaCorrente extends Conta{

	@Override
	public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
		System.out.println("Agência: " + this.getAgencia());
		System.out.println("Número: " + this.getNumeroConta());
		System.out.printf("Saldo: %.2f%n", this.getSaldo());
	}

	@Override
	public void depositar(double valor) {
		setSaldo(getSaldo() + valor);
	}

	@Override
	public void sacar(double valor) {
		if(getSaldo() >= valor) {
			setSaldo(getSaldo() - valor);
		} else {
			System.out.println("Saldo insuficiente.");
		}
	}

	@Override
	public void transferir(double valor, InterfaceConta contaDestino) {
		if(getSaldo() >= valor) {
			this.sacar(valor);
			contaDestino.depositar(valor);
		} else {
			System.out.println("Saldo insuficiente para transferência.");
		}
	}
}
