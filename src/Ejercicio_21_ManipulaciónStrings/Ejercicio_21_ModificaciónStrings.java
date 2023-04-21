package Ejercicio_21_ManipulaciónStrings;

public class Ejercicio_21_ModificaciónStrings {
    public static void main(String[] args) {
        String s1 = "Hola Mundo";
        System.out.println(
                s1.concat(" bienvenido")
                        .toUpperCase()
                        .replace(" ", "_")
        );
       /* String s2 = s1.concat(" bienvenido");
        String s3 = s1.toLowerCase();
        String s4 = s1.toUpperCase();
        String s5 = s2.replace(" ","_");

        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);

        */
    }
}
