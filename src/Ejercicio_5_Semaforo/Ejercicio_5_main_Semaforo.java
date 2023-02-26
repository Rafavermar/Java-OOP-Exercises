package Ejercicio_5_Semaforo;

import Ejercicio_5_Semaforo.Ejercicio_5_Semaforo;

public class Ejercicio_5_main_Semaforo {
    public static void main(String[] arg) {
        Ejercicio_5_Semaforo semaforo1, semaforo2;

        semaforo1 = new Ejercicio_5_Semaforo();
        semaforo2 = new Ejercicio_5_Semaforo(ColorSemaforo.VERDE, false);
        semaforo1.setColor(ColorSemaforo.AMARILLO);
        System.out.println("El Semaforo1 está en color " + semaforo1.getColor().toString());
        System.out.println("El Semaforo2 está en color " + semaforo2.getColor().toString());
    }
}
