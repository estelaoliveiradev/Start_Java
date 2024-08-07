import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insira o valor 1: ");
        var valor1 = Integer.parseInt(input.nextLine());

        System.out.println("Insira o valor 2: ");
        var valor2 = Integer.parseInt(input.nextLine());

        int diferenca;
        diferenca = valor1 - valor2;

        System.out.printf("A diferenca entre o valor1 e o valor2 é %d \n", diferenca);
    }
}
