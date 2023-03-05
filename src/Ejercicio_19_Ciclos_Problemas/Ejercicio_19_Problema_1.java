package Ejercicio_19_Ciclos_Problemas;

import java.util.Scanner;

public class Ejercicio_19_Problema_1 {

    public static void main( String[] args ) {
        /* Desarrollar programa que obtenga la media de calificación de un alumno con 5 materias.
        - Solicitar y almacenar la información de las 5 materias
        - Sumar el total de las calificaciones
        - Obtener el promedio
        */

        float [] calificaciones = new float[5];
        Scanner sc = new Scanner(System.in);

        float suma = 0;
        float media = 0;

        for (int i = 0; i < calificaciones.length; i++) {
            System.out.println("Introduce la calificación " + (i+1));
            calificaciones[i] = sc.nextFloat();
            /* pendiente de terminar ejercicio, a continuacion foreach */
        }





    }
}
