package Ejercicio_3_ForEach;// necesitamos sacar la media de los números:
// 5,8,2,3,7,12,16,24,84
// necesitamos sacar la media los números:
// 5,8,2,3,7,12,16,24,84
import java.io.PrintStream;

public class Ejercicio_3b {
    public static void main(String[] arg) {
        int[] array = new int[]{5, 8, 2, 3, 7, 12, 16, 24, 84};
        int length = array.length;
        int suma = 0;

        for (int j : array) suma += j;
        double media = suma / length;


        System.out.printf("El valor medio es: %.2f%n", media);
    }
}

