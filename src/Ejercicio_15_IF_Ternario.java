import javax.swing.*;
import java.util.Scanner;

public class Ejercicio_15_IF_Ternario {
    public static void main(String[] args) {
        System.out.println("Introduzca numero: ");
        Scanner teclado = new Scanner(System.in);
        int num = teclado.nextInt();

        String resultado = num >= 0 ? (num == 0 ? "El número es cero" : "El número es positivo") : "El número es negativo";
        resultado = resultado + (num % 2 == 0 ? " y par" : " e impar");
        resultado = resultado + (num % 5 == 0 ? " y múltiplo de 5" : " y no es múltiplo de 5");
        System.out.println(resultado);

        int x = 5;
        String res = x > 0 ? (x % 2 == 0 ?
                (x < 10 ? "El número es positivo, par y menor a 10" : "El número es positivo, par y mayor o igual a 10") : (x < 10 ? "El número es positivo, impar y menor a 10" : "El número es positivo, impar y mayor o igual a 10"))
                : "El número es negativo o cero";
        System.out.println(res);

    }

    }
