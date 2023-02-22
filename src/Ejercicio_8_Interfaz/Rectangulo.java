package Ejercicio_8_Interfaz;

public class Rectangulo implements Ejercicio_8_Interfaz_b.Figura {
    int ancho, alto;

    public Rectangulo (int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    public int area() {
        return ancho * alto;
    }
}

