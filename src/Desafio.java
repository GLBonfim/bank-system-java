import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        String nome = "Ronaldo Fenomeno";
        String tipoConta = "Conta Corrente";
        double saldoConta = 2500.00;
        int opcao = 0;

        System.out.println("**************************************");
        System.out.println("Dados iniciais do cliente:");
        System.out.println("\nNome do Cliente: " + nome);
        System.out.println("Tipo de Conta: " + tipoConta);
        System.out.println("Saldo Atual: " + saldoConta);
        System.out.println("\n**************************************");

        String menu = """
                ** Operações: **
                \n1 - Consultar saldo
                2 - Transferir
                3 - Receber
                4 - Finalizar
                
                """;


        while (opcao != 4){
            System.out.println(menu);
            opcao = leitor.nextInt();
            if (opcao == 1){
                System.out.println("Seu saldo atual é: " + saldoConta);
            } else if (opcao == 2) {
                System.out.println("Qual o valor da transferência? ");
                double transferencia = leitor.nextDouble(); // Usando double para o valor da transferência
                if (transferencia <= saldoConta) {
                    saldoConta -= transferencia; // Subtrai o valor da transferência do saldo
                    System.out.println("Saldo atual da conta: " + saldoConta);
                } else {
                    System.out.println("Saldo insuficiente para a transferência.");
                }
            } if (opcao == 3){
                System.out.println("Qual é o valor recebido: ");
                double receber = leitor.nextDouble(); // Usando double para o valor a receber
                saldoConta += receber;
                System.out.println("Saldo atual da conta: " + saldoConta);
            } else if (opcao == 4) {
                System.out.println("Obrigado por usar nossos serviços!!");
                break;

            }
        }
        }
    }
