package Ejercicio_19_PromedioArray;

import java.util.Scanner;

public class infra {
    public float promediocalif(float[] calificaciones){
        float suma = 0;
        for (float calificacion : calificaciones){
            suma += calificacion;
        }
        float promedio = suma / calificaciones.length;
        return promedio;
    }



public String introducirNombreAlumno() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Introduce nombre del Alumno:");
    String nombre = sc.nextLine();
    return nombre;
    }

    public float[] introducirCalif() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce Calificación para la Asignatura 1:");
        float calif1 = sc.nextFloat();
        System.out.println("Introduce Calificación para la Asignatura 2:");
        float calif2 = sc.nextFloat();
        System.out.println("Introduce Calificación para la Asignatura 3:");
        float calif3 = sc.nextFloat();
        System.out.println("Introduce Calificación para la Asignatura 4:");
        float calif4 = sc.nextFloat();
        System.out.println("Introduce Calificación para la Asignatura 5:");
        float calif5 = sc.nextFloat();
        float [] calificaciones = {calif1, calif2, calif3, calif4, calif5};
        return calificaciones;
    }
}