import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int M = input.nextInt();
        int S = input.nextInt();

        double percentual = (S * 100 / M);
        System.out.format("O desconto foi de %.0f%%%n", (100 - percentual));

    }

}
