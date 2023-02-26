package Ejercicio_4;

import Ejercicio_4.Ejercicio_4;

public class Ejercicio_4_main {

    public static void main (String[] args) {
        Ejercicio_4 ejercicio4 = new Ejercicio_4("Programacion", "1PROG", 1);
        Ejercicio_4 ejercicio4b = new Ejercicio_4("Lenguaje de Marcas", "1LMSI", 1);
        ejercicio4b.setCodigo("1LM");
        ejercicio4.setCurso(2);

        System.out.println("La primera asignatura es: " + ejercicio4b.getNombre() + ", con código: " + ejercicio4b.getCodigo());
    }
}
