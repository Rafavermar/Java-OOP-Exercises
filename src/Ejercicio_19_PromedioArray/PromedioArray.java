package Ejercicio_19_PromedioArray;
/* Desarrollar un programa que obtenga el promedio de calificación de un alumno con 5 materias */
import java.util.Scanner;
public class PromedioArray {

    public static void main(String[] args) {
        System.out.println("Caclula el promedio de calificaciones");
        Scanner sc = new Scanner(System.in);
        infra miInfra = new infra();

        String nombre = miInfra.introducirNombreAlumno();
        float[] calificaciones = miInfra.introducirCalif();
        float promedio = miInfra.promediocalif(calificaciones);


        System.out.println("El promedio de calificaciones de " + nombre + " es " + promedio);
    }

}