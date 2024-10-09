import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número: ");
        int numero = scanner.nextInt();

        if (numeroFibonacci(numero)) {
            System.out.println(numero + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(numero + " NÃO pertence à sequência de Fibonacci.");
        }

        scanner.close();
    }

    public static boolean numeroFibonacci(int numero) {
        int valor1 = 0, valor2 = 1;

        while (valor1 < numero) {
            int guardarValor = valor1;
            valor1 = valor2;
            valor2 = guardarValor + valor2;
        }

        return valor1 == numero;
    }
}
