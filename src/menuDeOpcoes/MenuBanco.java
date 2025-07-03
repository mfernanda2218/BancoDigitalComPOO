package menuDeOpcoes;
public enum MenuBanco {
    CRIAR_CONTA("Transferência"),
    ACESSAR_CONTA("Deposito");

    private final String descricao;

    MenuBanco(String descricao) {
        this.descricao = descricao;
    }

    public String getdescricao() {
        return descricao;
    }
}
