package Ejercicio_24_ModificadoresAcceso;

public class TaxCalculator {
     double rate = 0.1;

   public double getTaxAmount(double price){
        return rate * price;
    }

}
