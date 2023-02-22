// habría que crear una clase separada de Public interface Figura

public class Ejercicio_8_Interfaz {
}
 public interface Figura {
    int area = 0;
 }

 public class Rectangulo implements Figura{
    int ancho, alto;

    public Rectangulo (int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }
    public int area() {
        return ancho * alto;
    }
 }

 public class Triangulo implements Figura {
    int base, altura;

    public Triangulo (int base, int altura) {
    this.base = base;
    this.altura = altura;
    }
    public int area() {
        return base * altura /2;
     }
 }

 public class Main {

    public static void main(String[] args) {
        Rectangulo r1 = new.Rectangulo(7, 5);
        Triangulo t1 = new.Triangulo(4, 7);
        System.out.println("El area del rectangulo es: " + r1.area());
        System.out.println("El area del triangulo es: " + t1.area());
    }
 }



