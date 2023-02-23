import java.util.Scanner;

public class Ejercicio_11_Fibonacci {
        public static void main(String[] args) {
            Scanner teclado = new Scanner(System.in);
            System.out.println("Introduce el número: ");
            int numero = teclado.nextInt();
            teclado.close();
            System.out.println("\nSu fibonacci es: " + fibonacci(numero));

        }
        public static int fibonacci(int numero) {
            if ((numero == 0) || (numero == 1))
                    return numero;
            else
                return fibonacci(numero -1) + fibonacci(numero -2);

        }
}
