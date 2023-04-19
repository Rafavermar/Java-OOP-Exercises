package Ejercicio_9_Factorial_recursividad;

import java.util.Scanner;

public class Ejercicio_9_Factorial_recursividad {

    public static void main (String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = teclado.nextInt();
        teclado.close();
        System.out.println("\n El factorial de " + numero + " es:" + factorial(numero));


    }

    public static int factorial (int numero) {
        if (numero == 0)
            return 1;
        else
            return numero * factorial(numero-1);
    }
}
