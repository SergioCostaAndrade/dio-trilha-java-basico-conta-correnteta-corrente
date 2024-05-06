import java.util.Locale;
import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        System.out.printf("Digite o Numero da Conta");
        int numeroConta = scanner.nextInt();
        System.out.printf("Digite o Numero da Agência");
        String numeroAgencia = scanner.next();
        System.out.printf("Digite o Saldo da Conta");
        double saldoConta = scanner.nextDouble() ;
        System.out.printf("Digite o Nome do Cliente");
        String nomeCliente = scanner.next();
        System.out.printf("Digite o Sobrenome do Cliente");
        String sobrenomeCliente = scanner.next();
        System.out.printf("Olá " +  nomeCliente + " " + sobrenomeCliente +
        " obrigado por criar uma conta em nosso banco, sua agência é " +
                numeroAgencia + " conta " +
                String.valueOf(numeroConta) +
                " e seu saldo R$ " + String.valueOf(saldoConta) +
                " já está disponível para saque.");
    }
}
