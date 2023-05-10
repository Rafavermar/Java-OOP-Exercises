package Ejercicio_23_ContadorPalabras;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class ConteoPalabras {
    public String[] readFile(File file){
        String lines = "";
        try {
            Scanner sc = new Scanner(file);
            while(sc.hasNextLine()){
                lines += sc.nextLine();
            }
        } catch(FileNotFoundException e){
            System.out.println("Excepción al leer el archivo" + e);
        }

        return lines.split(" ");
    }

    public boolean showResult(int words, String[] lines){
        boolean result = false;
        File file = new File("result.txt");
        try{
            FileWriter fw = new FileWriter((file));
            String aux = "";
            for (String line : lines){
                aux += line;
                aux += " ";
            }
            fw.write("el archivo tiene " + words + " palabras" + "\n" + aux);
            fw.close();
            result = true;

        }catch(IOException e){
            System.out.println("Excepcion al crear el archivo: " + e);
        }
        return result;

    }
}
