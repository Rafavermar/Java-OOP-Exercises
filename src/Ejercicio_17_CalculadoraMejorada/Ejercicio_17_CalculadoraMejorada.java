package Ejercicio_17_CalculadoraMejorada;


import java.util.Scanner;

public class Ejercicio_17_CalculadoraMejorada {
    public static void main(String[] args) {

        System.out.println("*** CALCULADORA ***");

        Scanner sc = new Scanner(System.in);

        CalculadoraMejorada cal = new CalculadoraMejorada();

        cal.menu();

        int opcion = sc.nextInt();

        float[] numeros = cal.introducirNumero();


        switch (opcion) {
            case 1:
                System.out.println("El resultado es: " + cal.operacionSuma(numeros[0],numeros[1]));
                break;
            case 2:
                System.out.println("El resultado es: " + cal.operacionResta(numeros[0],numeros[1]));
                break;
            case 3:
                System.out.println("El resultado es: " + cal.operacionMultiplicacion(numeros[0],numeros[1]));
                break;
            case 4:
                if (numeros[1] == 0) {
                    System.out.println(" No es posible dividir entre cero");
                } else {
                    System.out.println("El resultado es: " + cal.operacionDivision(numeros[0],numeros[1]));
                }
                break;
            default:
                System.out.println("Introduzca una opción válida");
        }
    }
}
