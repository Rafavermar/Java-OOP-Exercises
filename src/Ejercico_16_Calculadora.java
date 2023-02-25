import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejercico_16_Calculadora {
    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        float num1;
        float num2;
        System.out.println("Introduza número: ");
        num1 = sc.nextFloat();
        System.out.println("Introduzca número 2: ");
        num2 = sc.nextFloat();

        System.out.println("Seleccione la operación: ");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                float suma = num1 + num2;
                System.out.println("El resultado es: " + suma);
                break;
            case 2:
                float resta = num1 - num2;
                System.out.println("El resultado es: " + resta);
                break;
            case 3:
                float multiplicacion = num1 * num2;
                System.out.println("El resultado es: " + multiplicacion);
                break;
            case 4:
                String division = String.valueOf(num1 / num2);
                String res = num2 == 0 ? "No es posible dividir entre cero" : "El resultado es: " + division;

                System.out.println(res);
                break;
            default:
                System.out.println("Introduzca una opción válida");
        }
    }
}
