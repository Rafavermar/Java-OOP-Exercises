package Ejercicio_1;

import java.util.Scanner;

// Una institución social tiene centro de salud, comedor infantil, escuela infantil y asilo de ancianos.
// La instittución recibe anualmente una DONACIÓN que la reparte de la siguiente manera:
// 25% centro salud, 35% comedor, 25% escuela infantil, 15% asilo
// diseñar algoritmo que efectue reparto de la donación
public class Ejercicio_1 {
    public static void main(String[] args) {
        double donacion;
        double centro;
        double comedor;
        double escuela;
        double asilo;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Donación Anual: ");
        donacion = entrada.nextDouble();

        centro = donacion * 0.25;
        comedor = donacion * 0.35;
        escuela = donacion * 0.25;
        asilo = donacion * 0.15;

        System.out.println("Centro: " + centro);
        System.out.println("comedor: " + comedor);
        System.out.println("escuela: " + escuela);
        System.out.println("asilo: " + asilo);

        entrada.close();

    }
}