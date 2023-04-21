package Ejercicio_23_ContadorPalabras;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ConteoPalabras {
    public String readFile(File file){
        String lines = "";
        try {
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                lines += sc.nextLine();
            }
        } catch(FileNotFoundException e){
            System.out.println("Excepción al leer el archivo" + e);
        }

        return lines;
    }
}
