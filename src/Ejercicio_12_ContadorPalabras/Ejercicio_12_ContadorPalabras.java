package Ejercicio_12_ContadorPalabras;

import java.util.Scanner;

public class Ejercicio_12_ContadorPalabras {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una cadena de texto: ");
        String cadenaUsuario = teclado.nextLine();
        System.out.println("\nLa cadena tiene " +cuentaPalabras(cadenaUsuario) + " palabras");


    }
    public static int cuentaPalabras(String cadena) {
        String[] palabras = cadena.trim().split(" +");
        return palabras.length;
    }
}
