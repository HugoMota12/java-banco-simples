import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int escolha = 0;
        String nome;
        String conta = "Corrente";
        double saldo = 0;
        Scanner input = new Scanner(System.in);

        System.out.println("Dados de cadastro do cliente:");
        System.out.println("Digite o nome do cliente: ");
        nome = input.nextLine();

        System.out.println(); // espaço no terminal.

        System.out.println("***********************");
        System.out.println("Dados iniciais do cliente: ");
        System.out.println("Nome : " + nome);
        System.out.println("Tipo de conta : " + conta);
        System.out.println("Saldo : " + saldo);
        System.out.println("***********************");

        System.out.println();

        while (escolha != 4) {
        System.out.println("Digite uma operação a ser realizada.");
        System.out.println("1. Consultar saldos");
        System.out.println("2. Receber valor");
        System.out.println("3. Transferir valor");
        System.out.println("4. Sair.");
        escolha = input.nextInt();

        System.out.println();

            if (escolha == 1) {
                System.out.println("O saldo atual é : " + saldo);
                System.out.println();
            } else if (escolha == 2) {
                System.out.println("Digite o valor a receber:");
                double valorReceber = input.nextDouble();
                if (valorReceber == 0) {
                    System.out.println("Nenhum valor foi depositado na conta");
                }
                else if (valorReceber < 0) {
                    System.out.println("Não é possível receber um número negativo");
                }
                else {
                saldo += valorReceber;
                }
                System.out.println("Saldo atual: " + saldo);
                System.out.println();
            } else if (escolha == 3) {
                System.out.println("Digite o valor a ser transferido:");
                double valorTransferido = input.nextDouble();
                if (valorTransferido > saldo) { // Um valor transferido não pode logicamente ser maior que seu saldo.
                    System.out.println(" o seu saldo é insuficiente.");
                    System.out.println();
                }
                else if (valorTransferido == 0) {
                    System.out.println("Nenhum valor foi trasnferido.");
                }
                else {
                    saldo -= valorTransferido;
                    System.out.println("Valor transferido com sucesso");
                }
                System.out.println("Saldo atualizado: " + saldo);
                System.out.println();
            } else if (escolha == 4) {
                System.out.println("Encerrando programa.");
            }
            else {
                System.out.println("opcao invalida");
            }
        }
        input.close();
    }
}