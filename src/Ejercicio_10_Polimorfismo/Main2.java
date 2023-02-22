package Ejercicio_10_Polimorfismo;

import java.util.ArrayList;

public class Main2 {

    public static void main(String[] args) {
        Persona p1 = new Persona ("Ana", "García Pi", 27);
        Trabajador t1 = new Trabajador("Antonio", "Ramirez Fernández", 18, 1200);
        Trabajador t2 = new Trabajador("Fernanda", "Díaz Solis", 33, 1300);

        ArrayList<Persona> personas = new ArrayList<Persona>();
        personas.add(p1);
        personas.add(t1);
        personas.add(t2);

        for (int i = 0; 1 < personas.size(); i++) {
            personas.get(i).mostrarInformacion();

        }
    }
}
