import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args){
        try {
            Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Digite o primeiro parâmetro: ");
            int parametroUm = scanner.nextInt();
            System.out.println("Digite o segundo parâmetro: ");
            int parametroDois = scanner.nextInt();
            contar(parametroUm, parametroDois);

            
        } catch (ParametrosInvalidosException e) {
            System.out.println("O segundo parametro deve ser maior que o primeiro");
        }

    }


    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException{
        if(parametroUm > parametroDois){
            throw new ParametrosInvalidosException();
        }
        int contagem = parametroDois - parametroUm;
            for(int numero = 1; numero <= contagem; numero++){
                System.out.println("Imprimindo " + numero);
            }
    }
}
