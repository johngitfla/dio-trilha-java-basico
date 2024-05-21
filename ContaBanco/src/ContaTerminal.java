import java.util.Locale;
import java.util.Scanner;



public class ContaTerminal {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da sua conta: ");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o número da agência: ");
        String numeroAgencia = scanner.next();

        scanner.nextLine();

        System.out.println("Digite o seu nome: ");
        String nome = scanner.nextLine();

        System.out.println("Digite seu saldo: ");
        double saldo = scanner.nextDouble();

        System.out.println("Numero da conta: " + numeroConta);
        System.out.println("Número da agência: " + numeroAgencia);
        System.out.println("Seu nome: " + nome);
        System.out.println("Saldo da conta: " + saldo);
    }
}
