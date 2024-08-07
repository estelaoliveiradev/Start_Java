import java.util.Scanner;

public class NomeSobrenome {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner input = new Scanner(System.in);

        System.out.println("Qual é seu nome? ");
        String nome = input.nextLine();

        System.out.println("Qual é seu sobrenome? ");
        String sobrenome = input.nextLine();

        System.out.printf("Seu nome é %s %s \n", nome, sobrenome);


    }
}