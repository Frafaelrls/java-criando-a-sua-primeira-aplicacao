import java.util.Random;
import java.util.Scanner;

public class Advinhacao {
    public static void main(String[] args) {
        int numeroSecreto = new Random().nextInt(100);
        int tentativas = 0;
        while (tentativas < 5) {
            System.out.println(numeroSecreto);
            Scanner leitura = new Scanner(System.in);
            System.out.println("Informe um numero entre 1 e 100: ");
            int chute = leitura.nextInt();
            tentativas++;
            if (chute == numeroSecreto) {
                System.out.println("Você acertou!");
                System.out.printf("O numero secreto era: %d", numeroSecreto);
                break;
            } else if (chute < numeroSecreto) {
                System.out.printf("O numero secreto é maior do que: %d%n", chute);
            } else {
                System.out.printf("O numero secreto é menor que: %d%n", chute);
            }
        }

        if (tentativas == 5) {
            System.out.printf("Você não conseguiu acertar, o número correto era: %d", numeroSecreto);
        }
    }
}
