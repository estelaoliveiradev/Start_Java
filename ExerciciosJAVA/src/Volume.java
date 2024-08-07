import java.util.Scanner;

public class Volume {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Insira a altura: ");
        var altura = Float.parseFloat(input.nextLine());

        System.out.println("Insira a largura: ");
        var largura = Float.parseFloat(input.nextLine());

        System.out.println("Insira a profundidade: ");
        var profundidade = Float.parseFloat(input.nextLine());

        float volume;
        volume = altura * largura * profundidade;

        // para formatar com duas casas decimais, usa esse %.2f - qtd depende de quantas casas decimais você quer
        System.out.printf("Seu volume é %.2f  \n", volume);
    }
}
