package Ejercicio_10_Polimorfismo;

public class Trabajador extends Persona {
    private double salario;

    Trabajador(String nombre, String apellido, int edad, double salario){
        super(nombre,apellido,edad);
        this.salario = salario;
    }

    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Salario: " + salario);
    }
}
