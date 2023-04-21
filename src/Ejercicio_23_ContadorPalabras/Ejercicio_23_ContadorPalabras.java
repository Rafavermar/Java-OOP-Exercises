package Ejercicio_23_ContadorPalabras;

import java.io.File;

public class Ejercicio_23_ContadorPalabras {
    public static void main(String[] args) {
        ConteoPalabras conteo = new ConteoPalabras();
        File file = new File ("input.txt");
        String lines = conteo.readFile(file);
        System.out.println(lines);

    }

}
// SIN TERMINAR!! MINUTO 7:36