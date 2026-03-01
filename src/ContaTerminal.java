import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {
        // Garante que o decimal com ponto funcione (ex: 237.48)
        Locale.setDefault(Locale.US);

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Conta !");
        int numero = scanner.nextInt();
        scanner.nextLine(); // limpa o ENTER pendente

        System.out.println("Por favor, digite o número da Agência !");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente !");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo !");
        double saldo = scanner.nextDouble();

        System.out.println(
                "Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, " +
                        "sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo +
                        " já está disponível para saque."
        );

        scanner.close();
    }
}