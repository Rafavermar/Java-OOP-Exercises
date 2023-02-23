import java.io.File;

public class Ejercicio_13_ListarFicherosDirectorio {
    public static void main(String[] args) {
        File directorio = new File("C:\\Users\\rafael.vera\\Documents");

        if (directorio.exists() && directorio.isDirectory()) {
            String[] nombreFicheros = directorio.list();
            for (String nombreFichero : nombreFicheros) {
                System.out.println(nombreFicheros);
            }

        }
        else {
            System.out.println("Lo sentimos, no es un directorio");
        }
    }
}
