package Ejercicio_26_AbstraccionEncapsulamiento;

public class Main {
    public static void main(String[] args) {
        Book book = new Book();

        book.setTitle("Learning Java");

        book.setAuthor("Deitel & Deitel");

        book.setAvailable(false);


        System.out.println("El titulo es: " + book.getTitle());
        System.out.println(("El autor es: " + book.getAuthor()));


        if(book.isAvailable()){
            System.out.println("El libro está disponible");
        }else{
            System.out.println("El libro no está disponible");
        }

    }

}
