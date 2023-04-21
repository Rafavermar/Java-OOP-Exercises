package Ejercicio_22_GestionArchivos;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Ejercicio_22_GestionArchivos {
    public static void main(String[] args) {
        File folder = new File("folder");
        File file = new File("folder\\mi primer archivo.txt");

        try {
            boolean folderCreated = folder.mkdir();
            boolean fileCreated = file.createNewFile();
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Aprendiendo a crear archivos");
            fileWriter.close();
            if (folderCreated && fileCreated) {
                System.out.println("El archivo se creó correctamente");
            } else {
                System.out.println("El archivo ya existe");
            }
        } catch (IOException e) {
            System.out.println("Excepcion al crear el archivo" + e);
        }


    }
}
