package modelos;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private List<Conta> contas = new ArrayList<>();

    public void cadastrarConta(Conta conta) {
        contas.add(conta);
    }

    public Conta buscarContaPorNumero(int numeroConta) {
        for (Conta conta : contas) {
            if (conta.getNumeroConta() == numeroConta) {
                return conta;
            }
        }
        return null;
    }

    public void listarContasAtivas() {
        for (Conta conta : contas) {
            System.out.println("Conta: " + conta.getNumeroConta() + " | Titular: " + conta.getNomeTitular());
        }
    }
}
