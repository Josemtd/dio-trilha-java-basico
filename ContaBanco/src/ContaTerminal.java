import java.util.Scanner;
import java.util.Locale;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        System.out.println("Por favor, digite o número da sua conta");
        int numero = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o código da agência da sua conta");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome da sua conta");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo da sua conta");
        double saldo = scanner.nextDouble();
        
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponivel para saque.");
    }
}
