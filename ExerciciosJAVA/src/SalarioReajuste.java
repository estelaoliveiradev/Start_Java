import java.util.Scanner;

public class SalarioReajuste   {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite seu salário: ");
        float salario = sc.nextFloat();

        System.out.println("Digite o reajuste: ");
        float reajuste = sc.nextFloat();

        int decimal = 1;
        float calculo = salario * (reajuste + decimal);

        System.out.printf("Seu salário com reajuste %.2f ", calculo);
    }
}
