import java.util.ArrayList;
import java.util.List;

public class Banco{
    private List<Conta> contas = new ArrayList<>();

    public void cadastrarConta(Conta conta) {
        contas.add(conta);
    }

    public Conta buscarConta(int numero) {
        for (Conta conta : contas) {
            if (conta.getNumeroConta() == numero) {
                return conta;
            }
        }
        return null;
    }

    public List<Conta> getContas() {
        return contas;
    }
}
