package Ejercicio_25_Enums;

public class Main2 {

    public static void main(String[] args) {
        Level level = Level.HARD;
        switch (level){
            case EASY:
                System.out.println(" El nivel es fácil");
                break;
            case NORMAL:
                System.out.println("El nivel es normal");
                break;
            case HARD:
                System.out.println("El nivel es difícil");
                break;
        }
    }
}