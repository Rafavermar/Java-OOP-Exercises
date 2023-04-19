package Ejercicio_20_Switch_Case;

import java.util.Scanner;

public class switchCase_b {
    public static void main(String[] args) {
        /**
         * Recibir un número y decir que día de la semana es
         * 1 -> Domingo
         * 2 -> Lunes ...
         */

        System.out.println("Introduce número entre 1 y 7");
        Scanner sc = new Scanner(System.in);
        int dia = sc.nextInt();
        switch (dia){
            case 1:
                System.out.println("El dia es domingo");
                break;
            case 2:
                System.out.println("El dia es lunes");
                break;
            case 3:
                System.out.println("el dia es martes");
                break;
            case 4:
                System.out.println(("el dia es miercoles"));
                break;
            case 5:
                System.out.println(("el dia es jueves"));
                break;
            case 6:
                System.out.println(("El dia es viernes"));
                break;
            case 7:
                System.out.println(("El dia es sabado"));
                break;
            default:
                System.out.println("El numero introducido no es válido");
                break;

        }
    }
}
