package Ejercicio_14_ClaseAbstracta;

public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getPerimetro() {
        return 2 * Math.PI * radio;
    }

    public double getArea() {
        return Math.PI * radio * radio;

    }
}
