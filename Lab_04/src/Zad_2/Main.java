package Zad_2;

import java.lang.annotation.ElementType;

public class Main {
    public static void main(String[] args) {
        int arr1[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0};
        int arr2[] = {1, 3, 5, 7, 9};
        PrintEvenArrEl(arr1, arr2);
    }

    public static void PrintEvenArrEl(int[]... args) {
        for (int i = 0; i < args.length; i++) {
            System.out.printf("\n Elementy %d Tablicy: ",i+1);
            for(int j = 0; j < args[i].length; j+=2) System.out.printf("%d ", args[i][j]);
        }
    }

}
