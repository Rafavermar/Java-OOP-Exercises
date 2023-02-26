package Ejercicio_3_ForEach;// necesitamos sacar el número mas alto de los números:
// 5,8,2,3,7,12,16,24,84

public class Ejercicio_3 {

    public static void main(String[] args){
    int [] arr = new int [] {5, 8, 2,3, 7, 12, 16, 24, 84};
    int max = arr[0];

        for (int j : arr) {
            if (j > max) max = j;
        }
    System.out.println("El número mayor es: " + max);
    }


}

