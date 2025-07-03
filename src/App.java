import auxiliares.GeradorNumeroConta;
import auxiliares.GeradorAgencia;
import java.security.SecureRandom;
//import java.util.Set;
//import java.util.HashSet;
import java.util.Scanner;
import menuDeOpcoes.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Olá! Seja bem-vindo(a) ao Banco Digital em Java!");
        System.out.println("O que deseja fazer?");
        System.out.println("1 - Criar uma nova conta");
        System.out.println("2 - Acessar minha conta bancária");
        
        Scanner scanner = new Scanner(System.in);
        int opcao;
        for (MenuBanco menu : MenuBanco.values()) {
            System.out.println(menu.ordinal() + 1 + " - " + menu.getdescricao());
        }
        System.out.print("Escolha uma opção: ");
        opcao = scanner.nextInt();

        if (opcao == 1) {
            scanner.nextLine();
            System.out.print("Insira o nome do titular: ");
            String nomeTitular = scanner.nextLine();
            int numeroConta = GeradorNumeroConta.gerarNumeroUnico();
            String agencia = GeradorAgencia.gerarAgenciaUnica();
            double saldo = 0;
            Conta conta = new Conta(agencia, numeroConta, nomeTitular, saldo );

            System.out.println("Conta criada com sucesso!");
            System.out.println("Titular: " + conta.getNomeTitular());
            System.out.println("Número da conta: " + conta.getNumeroConta());
            System.out.println("Agência: " + agencia);
            
        }

    }
}
