package Ejercicio_18_Ciclos;

public class Foreach {
    public static void main(String[] args) {
        String[] values = {"a", "bb", "ccc"};
        for (int i = 0; i < values.length; i++) {
            System.out.println(values[i]);
        }
        System.out.println("A continuación FOR EACH");
        for (String str : values) {
            System.out.println(str);
        }
    }
}
