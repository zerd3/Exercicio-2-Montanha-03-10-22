import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner console = new Scanner(System.in);

        System.out.println("Digite um número: ");
        int numero = console.nextInt();

        System.out.println("O número informado foi " + numero);
    }
}
