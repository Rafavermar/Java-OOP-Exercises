package Ejercicio_27_Herencia;

public class Main {
    public static void main(String[] args) {
        Developer dev = new Developer("Peter", 35, 1000, "Google");
        Student st = new Student("Alex",16,1.5, "EOI");
        dev.showInfo();
        System.out.println("**************");
        st.showInfo();
    }
}
