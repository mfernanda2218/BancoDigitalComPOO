package menuDeOpcoes;
public enum OperacoesNaConta {
    TRANSFERENCIA("Transferência"),
    DEPOSITO("Deposito"),
    SAQUE("Saque");

    private final String descricao;

    OperacoesNaConta(String descricao) {
        this.descricao = descricao;
    }

    public String getdescricao() {
        return descricao;
    }

}
