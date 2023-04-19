package Ejercicio_20_Switch_Case;

import java.util.Scanner;

public class switch_Case {
    public static void main(String[] args) {
        /*
        Recibir un numero entero y decir si es par o impar
        4 % 2 -> 0
        5 % 2 -> 1
         */
        System.out.println("Ingrese un numero entero: ");
        Scanner sc = new Scanner((System.in));
        int num = sc.nextInt();
        int residuo = num % 2;
        switch (residuo){
            case 0:
                System.out.println("El número es par");
                break;
            default:
                System.out.println(("El número es impar"));
                break;

        }
    }
}
