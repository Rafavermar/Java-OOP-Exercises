package Ejercicio_8_Interfaz;

public class Triangulo implements Ejercicio_8_Interfaz_b.Figura {
    int base, altura;

    public Triangulo (int base, int altura) {
        this.base = base;
        this.altura = altura;
    }
    public int area() {
        return base * altura /2;
    }
}
