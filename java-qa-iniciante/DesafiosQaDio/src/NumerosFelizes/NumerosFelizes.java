/*
Para saber se um número é feliz, você deve obter o quadrado de cada dígito deste número, em seguida você faz a soma desses resultados. A seguir o mesmo procedimento deve ser feito com o valor resultante desta soma. Se ao repetir o procedimento diversas vezes obtivermos o valor 1, o número inicial é considerado feliz.
Tomamos o 7, que é um número feliz:
7² = 49
4² + 9² = 97
9² + 7² = 130
1² + 3² + 0² = 10
1² + 0² = 1
Podemos observar nesse exemplo que os números 49, 97, 130 e 10 também são felizes. Existem infinitos números felizes.
E um número triste? Como sabemos que um número não será feliz?
Desenvolva um programa que determine se um número é feliz ou triste.
*/

package NumerosFelizes;

import java.util.*;

public class NumerosFelizes {

  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    int n = scan.nextInt();

    scan.close();

    System.out.println(numerosFelizes(n));

  }

  public static boolean numerosFelizes(int n) {

    String texto = String.valueOf(n);

    if (texto.length() == 1) {

      return Integer.parseInt(texto) == 1;
    }

    do {

      // System.out.println("Executou o do com " + texto);

      String[] vetor = texto.split("");

      int soma = 0;

      for (int x = 0; x < vetor.length; x++) {

        int valor = Integer.parseInt(vetor[x]);

        soma += (valor * valor);

      }

      String somaStr = String.valueOf(soma);

      if (somaStr.length() == 1) {

        return Integer.parseInt(somaStr) == 1;

      }
      texto = somaStr;

    } while (texto.length() != 1);

    return false;

  }

}