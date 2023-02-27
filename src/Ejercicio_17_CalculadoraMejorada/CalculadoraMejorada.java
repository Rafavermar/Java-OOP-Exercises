package Ejercicio_17_CalculadoraMejorada;
import java.util.Scanner;
public class CalculadoraMejorada {

    public float operacionSuma (float num1, float num2){
        return num1 + num2;
    }

    public float operacionResta (float num1, float num2) {
        return num1-num2;
    }

    public float operacionMultiplicacion (float num1, float num2) {
        return num1 * num2;
    }

    public float operacionDivision (float num1, float num2) {
        return num1 / num2;
    }

    public void menu() {
        System.out.println("Seleccione la operación: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
    }

    public float[] introducirNumero() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca el primer número: ");
        float num1 = sc.nextFloat();
        System.out.println("Introduzca el segundo número: ");
        float num2 = sc.nextFloat();
        float[] numeros = {num1, num2};
        return numeros;
    }

}
