package Ejercicio_2_if_Elself;

import java.util.Scanner;
// Usted alquila vehiculos cobrando por dicho concepto:
// 300 euros para los primeros 300 km de recorrido;
// 200 euros desde 301 km hasta los 1000k kmde recorrido;
// 150 euros para los km que excedan 1000 km
// Introduzca la cantidad de km y calcule la cantidad total a pagar

 public class Ejercicio_2_If_ElseIf {
     public static void main(String[] args) {
         double precio;

         Scanner entrada = new Scanner(System.in);
         System.out.println("Introduzca cuántos km tiene pensado hacer: ");
         double km = entrada.nextDouble();

         if (km < 300) {
             precio = 300;
         } else if (km > 1000) {
             precio = 650;
         } else {
             precio = 500;
         }

         Scanner entrada2 = new Scanner(System.in);
         System.out.println("Desea Factura o ticket? (Factura = 1, Ticket = 2)");
         int factura = entrada2.nextInt();

         double totalSinIva = precio / 1.21;
         double iva = precio - totalSinIva;

         if (factura == 1) {
             System.out.printf("Total factura = %.2f%n", precio);
             System.out.printf("21%% IVA = %.2f%n", iva);
             System.out.printf("Total sin IVA = %.2f%n", totalSinIva);
         } else {
             System.out.printf("Total Ticket = %.2f€%n", precio);
         }


         entrada.close();
         entrada2.close();

     }
 }