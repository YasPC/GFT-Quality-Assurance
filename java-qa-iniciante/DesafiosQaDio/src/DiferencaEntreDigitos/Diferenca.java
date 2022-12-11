/**Desafio
O desafio consiste em um número inteiro n, onde será necessário calcular a diferença entre o produto e a soma dos seus digitos.

Entrada 
• Para encontrar o produto do valor, os dígitos deverão ser multiplicados.

• A soma, basta realizar uma adição entre os dígitos.

• A diferença, é necessário substrair o resultado final dos dois valores.

Saída
A saída deverá retornar o valor final da diferença entre o produto e a soma dos digitos. Explicação:
Produto de dígitos = 2 * 3 * 4 = 24
Soma dos dígitos = 2 + 3 + 4 = 9
Resultado = 24 - 9 = 15 */
package DiferencaEntreDigitos;

import java.util.Scanner;

public class Diferenca {
    public static void main(String[] args) {

        try (Scanner scan = new Scanner(System.in)) {
            int numero = scan.nextInt();

            String numeroEmString = String.valueOf(numero);
            String[] split = numeroEmString.split("");

            int soma = 0;
            int multiplicacao = 1;
            int diferenca = 0;

            for (int i = 0; i < split.length; i++) {
                int item = Integer.parseInt(split[i]);
                soma = soma + item;
                multiplicacao = multiplicacao * item;
            }

            diferenca = multiplicacao - soma;
            System.out.println(diferenca);
        } catch (NumberFormatException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }
}
