package auxiliares;

import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Set;

public class GeradorAgencia {
    private static final SecureRandom random = new SecureRandom();
    private static final Set<String> agenciasExistentes = new HashSet<>();

    public static String gerarAgenciaUnica() {
        String agencia;
        do {
            int numeroPrincipal = 1000 + random.nextInt(9000); // Gera de 1000 a 9999
            int digitoVerificador = random.nextInt(10); // Gera de 0 a 9
            agencia = String.format("%04d-%d", numeroPrincipal, digitoVerificador);
        } while (agenciasExistentes.contains(agencia));

        agenciasExistentes.add(agencia);
        return agencia;
    }
}

