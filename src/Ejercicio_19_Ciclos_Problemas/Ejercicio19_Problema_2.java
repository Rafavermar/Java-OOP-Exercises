package Ejercicio_19_Ciclos_Problemas;

import java.util.Random;
import java.util.Scanner;

public class Ejercicio19_Problema_2 {
    public static void main(String[] args) {
     /*
    Desarrolle un programa que pida al usuario adivinar un número entre 0 y 10.
    El número se debe generar aleatoriamente.
    El usuario tiene 3 intentos para adivinar el número.
    -Generar el número random entre 0 y 10.
    -Pedir al usuario que intente adivinar y validr si acertó.
    -Validar el número de intentos.
     */

     Random r = new Random();
     int randNum = r.nextInt(11);
     Scanner sc = new Scanner(System.in);
     int userNum = -1;
     int intentos = 3;

     while(userNum != randNum) {
         System.out.println("Adivina el numero aleatorio entre 0 y 10: ");
         userNum = sc.nextInt();
         if (userNum != randNum) {
             intentos--; //intentos = intentos -1
             System.out.println("Fallaste... intentos restantes: " + intentos);
             if(intentos == 0){
                 System.out.println("Perdiste");
                 System.out.println(("EL numero aleatorio era: " + randNum));
                 break;
             }
         }else {
             System.out.println("Ganaste!");
         }
     }

    }

}
