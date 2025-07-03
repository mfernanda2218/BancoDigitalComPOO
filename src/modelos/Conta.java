package modelos;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
    protected String agencia;
    protected int numeroConta;
    protected String nomeTitular;
    protected double saldo;
    protected List<String> historico = new ArrayList<>();

    public Conta(String agencia, int numeroConta, String nomeTitular, double saldo) {
        this.agencia = agencia;
        this.numeroConta = numeroConta;
        this.nomeTitular = nomeTitular;
        this.saldo = saldo;
        this.historico = new ArrayList<>();
    }

    public abstract void imprimirExtrato();

    public void depositar(double valor) {
        this.saldo += valor;
    }

    public void sacar(double valor) throws SaldoInsuficienteException {
        if (this.saldo < valor)
            throw new SaldoInsuficienteException("Saldo insuficiente para saque.");
        this.saldo -= valor;
    }

    public void transferir(double valor, Conta destino) throws SaldoInsuficienteException {
        if (this.saldo < valor)
            throw new SaldoInsuficienteException("Saldo insuficiente para transferência.");
        this.sacar(valor);
        destino.depositar(valor);
    }

    public void registrarTransacao(String tipo, double valor) {
        String registro = tipo + " de R$ " + String.format("%.2f", valor);
        historico.add(registro);
    }

    public List<String> getHistorico() {
        return historico;
    }

    // Getters
    public String getAgencia() { return agencia; }
    public int getNumeroConta() { return numeroConta; }
    public String getNomeTitular() { return nomeTitular; }
    public double getSaldo() { return saldo; }
}
