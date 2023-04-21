package Ejercicio_21_ManipulaciónStrings;

public class Ejercicio_21_ManipulaciónStrings {

    public static void main(String[] args) {
        String s1 = "Hola mundo";
        int longitud = s1.length();
        char c= s1.charAt(1);
        int index = s1.indexOf("o");
        String s2 = s1.substring(0,4);
        String s3 = s1.substring(4);
        System.out.println(longitud);
        System.out.println(c);
        System.out.println(index);
        System.out.println(s2);
        System.out.println(s3);
    }
}
