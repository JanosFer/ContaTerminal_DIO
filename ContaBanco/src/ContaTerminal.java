import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        Scanner ler = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Por favor, digite o nome do cliente: ");
        nomeCliente = ler.next();

        System.out.println("Por favor, digite o número da Agência: ");
        agencia = ler.next();

        System.out.println("Por favor, digite o número da Conta: ");
        numero = ler.nextInt();

        System.out.println("Por favor, digite o saldo da conta: ");
        saldo = ler.nextDouble();

        System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+saldo+" já está disponível para saque.");
        ler.close();
    }
}
