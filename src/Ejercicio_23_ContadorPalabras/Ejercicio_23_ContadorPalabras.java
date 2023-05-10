package Ejercicio_23_ContadorPalabras;

import javax.sound.midi.Soundbank;
import java.io.File;

public class Ejercicio_23_ContadorPalabras {
    public static void main(String[] args) {
        ConteoPalabras conteo = new ConteoPalabras();
        File file = new File ("input.txt");
        String[] lines = conteo.readFile(file);
        int words = lines.length;
        boolean result = conteo.showResult(words,lines);
        if (result){
            System.out.println("Todo salió bien");
        }else {
            System.out.println("Hubo un problemas en la ejecución");
        }

    }

}
// System.out.println(lines[1])