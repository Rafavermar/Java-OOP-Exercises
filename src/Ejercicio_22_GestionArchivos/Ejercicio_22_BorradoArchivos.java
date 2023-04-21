package Ejercicio_22_GestionArchivos;

import java.io.File;

public class Ejercicio_22_BorradoArchivos {
    public static void main(String[] args) {
        File file = new File("mi primer archivo.txt");
        if (file.delete()) {
            System.out.println("El archivo se borró correctamente");
        } else {
            System.out.println("no se pudo borrar el archivo");
        }
        }
    }

