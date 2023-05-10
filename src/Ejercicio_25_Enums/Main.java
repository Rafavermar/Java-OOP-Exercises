package Ejercicio_25_Enums;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        Level [] alllevels = Level.values();
        for (Level level:alllevels
             ) {
            System.out.println(level);

        }
    }
}
