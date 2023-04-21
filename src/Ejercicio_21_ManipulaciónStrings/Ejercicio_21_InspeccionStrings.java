package Ejercicio_21_ManipulaciónStrings;

public class Ejercicio_21_InspeccionStrings {
    public static void main(String[] args) {
        String s1 = "Hola Mundo";
        String s2 = "";
        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());
        System.out.println(s1.contains("hola")); //es case Sensitive
        System.out.println(s1.equals("Hola Mundo"));
        System.out.println(s1.equalsIgnoreCase("hola mundo"));
    }
}
