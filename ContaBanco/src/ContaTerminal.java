
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Informações da Conta
        System.out.println("Por favor, digite número da sua conta corrente:");
        int numero = scanner.nextInt();
        scanner.nextLine();  // Consome a quebra de linha

        System.out.println("Por favor, digite número da sua agencia como dígito:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do cliente:");
        String nomeDoCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo da sua conta:");
        Double saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeDoCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " +  agencia + ", número da conta " + numero + " e seu saldo é: R$" + saldo + ", e já está disponível para saque.");

        scanner.close();
    }
}
