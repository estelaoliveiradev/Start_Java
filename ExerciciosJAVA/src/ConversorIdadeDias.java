import java.util.Scanner;

public class ConversorIdadeDias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite sua idade em anos: ");
        int idade = sc.nextInt();

        int diasano = 365;
        int idadeconvertidadia = idade * diasano;

        System.out.printf("Você tem %d dias de idade", idadeconvertidadia);
    }
}
