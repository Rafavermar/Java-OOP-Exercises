package Ejercicio_22_GestionArchivos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Ejercicio_22_LeyendoArchivos {
    public static void main(String[] args) {
    File file = new File("mi primer archivo.txt");
    try {
        Scanner sc = new Scanner(file);
        while (sc.hasNextLine()) {
            String data = sc.nextLine();
            System.out.println(data);
        }

    } catch (FileNotFoundException e) {
        System.out.println("Excepcion al abrir el archivo" + e);
    }

    }
}
