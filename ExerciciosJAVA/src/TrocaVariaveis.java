
public class TrocaVariaveis {
    public static void main(String[] args) {

        int variavelA = 10;
        int variavelB = 20;
        System.out.println("Valores iniciais:");
        System.out.println("A: " + variavelA);
        System.out.println("B: " + variavelB);

        // Troca os valores utilizando uma variavel temporária
        int temp = variavelA;
        variavelA = variavelB;
        variavelB = temp;

        //Exibe os valores após a troca
        System.out.println("Valores após a troca:");
        System.out.println("A: " + variavelA);
        System.out.println("B: " + variavelB);
    }
}
