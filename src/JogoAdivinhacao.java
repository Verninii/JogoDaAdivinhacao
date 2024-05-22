import java.util.Random;
import java.util.Scanner;

public class JogoAdivinhacao {
    public static void main(String[] args) {
        Random aleatorio = new Random();
        Scanner leitor = new Scanner(System.in);

        int sorteio = aleatorio.nextInt(101)+1;
        System.out.println(sorteio);

        int x = 0;
        int tentativas = 0;

        while (x < 10) {
            System.out.println("Qual valor você acha que é? ");
            tentativas = leitor.nextInt();
            x = x + 1;
            if (tentativas == sorteio) {
                System.out.println("Parabéns você acertou, o número é: " + sorteio);
            } else if (tentativas > sorteio) {
                System.out.println("O número sugerido é maior que o número secreto, tente novamente!");
            } else {
                System.out.println("O número sugerido é menor que o número secreto, tente novamente!");
            }

        }
        System.out.println("Você usou todas as suas tentativas!!!");
    }
}
