package yasmin;

public class OperadoresRelacionais {

    /**
     * @param args
     */
    public static void main(String[] args) {

        // classe Operadores.java
        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("Numero 1 é igual a  numero 2" + simNao);

        if (numero1 > numero2)

            System.out.println("Numero 1 maior que numero 2" + simNao);

        if (numero1 < numero2)

            System.out.println("Numero 1 menor que numero 2" + simNao);

        if (numero1 >= numero2)

            System.out.println("Numero 1 maior ou igual que numero 2" + simNao);

        if (numero1 <= numero2)

            System.out.println("Numero 1 menor ou igual que numero 2" + simNao);

        if (numero1 != numero2)

            System.out.println("Numero 1 é diferente de numero 2" + simNao);
    }

}
