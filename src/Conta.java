import java.util.ArrayList;
import java.util.List;

public class Conta implements InterfaceConta{
    private String agencia;
    private int numeroConta;
    private String nomeTitular;
    private double saldo;
    // deve ser um método private List<String> historicoDeTransacoes;

    
    
    public Conta(String agencia, int numeroConta, String nomeTitular, double saldo) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
    }

    public Conta() {
    }

    public String getAgencia() {
        return agencia;
    }

    public int getNumeroConta() {
        return numeroConta;
    }

    public String getNomeTitular() {
        return nomeTitular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    //operações cabiveis na movimentação de contas em bancos
    @Override
	public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Corrente ===");
        System.out.println("Agência: " + this.agencia);
        System.out.println("Número: " + this.numeroConta);
        System.out.println("Nome titular: " + this.nomeTitular);
        System.out.printf("Saldo: %.2f%n", this.saldo);
        System.out.println("Histórico de transações:" + getHistoricoDeTransacoes());
        
	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;
	}

	@Override
	public void sacar(double valor) {
		if(this.saldo >= valor) {
			this.saldo -= valor;
		} else {
			System.out.println("Saldo insuficiente.");
		}
	}

	@Override
	public void transferir(double valor, InterfaceConta contaDestino) {
		if(this.saldo >= valor) {
			this.sacar(valor);
			contaDestino.depositar(valor);
		} else {
			System.out.println("Saldo insuficiente para transferência.");
		}
    }

    protected List<String> historicoDeTransacoes = new ArrayList<>();

    public void registrarTransacao(String tipo, double valor, java.time.LocalDateTime data) {
        String descricaoOperacao = tipo + " de R$ " + String.format("%.2f", valor) + " em " + data;
        historicoDeTransacoes.add(descricaoOperacao);
    }

    public List<String> getHistoricoDeTransacoes() {
        return historicoDeTransacoes;
    }

    
}
