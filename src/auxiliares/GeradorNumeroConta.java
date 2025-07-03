package auxiliares;

import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Set;

public class GeradorNumeroConta {
    private static final SecureRandom random = new SecureRandom();
    private static final Set<Integer> contasExistentes = new HashSet<>();
    private static final int TAMANHO_NUMERO = 6; // 6 dígitos, por exemplo

    public static int gerarNumeroUnico() {
        int numeroConta;
        do {
            numeroConta = 100000 + random.nextInt(900000); // Gera número de 6 dígitos
        } while (contasExistentes.contains(numeroConta));

        contasExistentes.add(numeroConta);
        return numeroConta;
    }
}
