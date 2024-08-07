import java.util.Scanner;

public class AntecessorNumerico {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int valor = sc.nextInt();

        int antecessor = valor - 1;

        System.out.printf("Seu antecessor é %d \n", antecessor);
    }
}
