import auxiliares.GeradorAgencia;
import auxiliares.GeradorNumeroConta;
import java.util.Scanner;
import modelos.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Banco banco = new Banco();

        System.out.println("Olá! Seja bem-vindo(a) ao Banco Digital em Java!");

        OUTER:
        while (true) {
            System.out.println("\nMenu Principal:");
            System.out.println("1 - Criar uma nova conta");
            System.out.println("2 - Acessar minha conta bancária");
            System.out.println("3 - Listar contas ativas");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();
            switch (opcao) {
                case 1 ->                     {
                        System.out.print("Insira o nome do titular: ");
                        String nomeTitular = scanner.nextLine();
                        System.out.print("Tipo de conta (1 - Corrente | 2 - Poupança): ");
                        int tipo = scanner.nextInt();
                        scanner.nextLine();
                        int numeroConta = GeradorNumeroConta.gerarNumeroUnico();
                        String agencia = GeradorAgencia.gerarAgenciaUnica();
                        Conta novaConta;
                        if (tipo == 1) {
                            novaConta = new ContaCorrente(agencia, numeroConta, nomeTitular, 0.0);
                        } else {
                            novaConta = new ContaPoupanca(agencia, numeroConta, nomeTitular, 0.0);
                        }       banco.cadastrarConta(novaConta);
                        System.out.println("\nConta criada com sucesso!");
                        System.out.println("Titular: " + novaConta.getNomeTitular());
                        System.out.println("Agência: " + novaConta.getAgencia());
                        System.out.println("Número da conta: " + novaConta.getNumeroConta());
                    }
                case 2 ->                     {
                        System.out.print("Informe o número da conta: ");
                        int numeroConta = scanner.nextInt();
                        scanner.nextLine();
                        Conta conta = banco.buscarContaPorNumero(numeroConta);
                        if (conta == null) {
                            System.out.println("Conta não encontrada!");
                            continue;
                        }       System.out.println("Conta acessada com sucesso!");
                        boolean operando = true;
                        while (operando) {
                            System.out.println("\nOperações disponíveis:");
                            System.out.println("1 - Ver extrato");
                            System.out.println("2 - Depositar");
                            System.out.println("3 - Sacar");
                            System.out.println("4 - Transferir");
                            System.out.println("0 - Voltar");
                            
                            int escolha = scanner.nextInt();
                            scanner.nextLine();
                            
                            switch (escolha) {
                                case 1 -> conta.imprimirExtrato();
                                case 2 -> {
                                    System.out.print("Valor do depósito: ");
                                    double valorDep = scanner.nextDouble();
                                    conta.depositar(valorDep);
                                    conta.registrarTransacao("Depósito", valorDep);
                                }
                                case 3 -> {
                                    System.out.print("Valor do saque: ");
                                    double valorSaque = scanner.nextDouble();
                                    try {
                                        conta.sacar(valorSaque);
                                        conta.registrarTransacao("Saque", valorSaque);
                                    } catch (SaldoInsuficienteException e) {
                                        System.out.println(e.getMessage());
                                    }
                                }
                                case 4 -> {
                                    System.out.print("Número da conta destino: ");
                                    int destino = scanner.nextInt();
                                    System.out.print("Valor da transferência: ");
                                    double valor = scanner.nextDouble();
                                    
                                    Conta contaDestino = banco.buscarContaPorNumero(destino);
                                    if (contaDestino == null) {
                                        System.out.println("Conta destino não encontrada!");
                                    } else {
                                        try {
                                            conta.transferir(valor, contaDestino);
                                            conta.registrarTransacao("Transferência enviada para conta " + destino, valor);
                                            contaDestino.registrarTransacao("Transferência recebida de conta " + conta.getNumeroConta(), valor);
                                        } catch (SaldoInsuficienteException e) {
                                            System.out.println(e.getMessage());
                                        }
                                    }
                                }
                                case 0 -> operando = false;
                                default -> System.out.println("Opção inválida!");
                            }
                        }                          }
                case 3 -> banco.listarContasAtivas();
                case 0 -> {
                    System.out.println("Obrigado por utilizar nosso sistema!");
                    break OUTER;
                }
                default -> System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }
}
