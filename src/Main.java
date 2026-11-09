import javax.print.DocFlavor;
import java.util.Scanner;

public class Main {
    public static void main (String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Quantos números o usuário deseja inserir? ");
        int quantidade = scanner.nextInt();

        int[] vetorinteiro = new int[quantidade];

        for (int i = 0; i < quantidade; i ++){
            System.out.println("Digite o valor de cada um: ");
            vetorinteiro[i] = scanner.nextInt();
        } for (int i = 0 ; i < vetorinteiro.length; i++){
            if (vetorinteiro[i] % 2 == 0) {
                vetorinteiro[i] = vetorinteiro[i] * 2;

            } else {
                vetorinteiro[i] = (int) Math.pow(vetorinteiro[i], 2);
            }
            System.out.println("Posição " + i + ": " + vetorinteiro[i]);
        }
    }
}