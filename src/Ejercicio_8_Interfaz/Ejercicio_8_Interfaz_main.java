package Ejercicio_8_Interfaz;

public class Ejercicio_8_Interfaz_main {

    public static void main( String[] args ) {
        Triangulo t1;
        Rectangulo r1;

        r1 = new Rectangulo(7, 5);
        t1 = new Triangulo(4, 7);
        System.out.println("El area del rectangulo es: " + r1.area());
        System.out.println("El area del triangulo es: " + t1.area());
    }
}
