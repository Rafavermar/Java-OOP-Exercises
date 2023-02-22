public class Ejercicio_6_Persona {
    String nombre;
    String apellidos;
    int edad;
    static int numeroPersonas = 0;

    public Ejercicio_6_Persona(String nombre, String apellidos, int edad) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        numeroPersonas++;
    }

    static void muestraNumeroPersonas() {
        System.out.println("Hay " + numeroPersonas + " personas");
    }
}
