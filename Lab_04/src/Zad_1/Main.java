package Zad_1;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int arr[] = RandomArray(30, 10, 50);

        System.out.printf("For");
        ForSumAvg(arr);
        System.out.printf("\n ForEach");
        ForEachSumAvg(arr);
    }

    public static void ForSumAvg(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.printf("Suma Elementow: %d \n Srednia: %f", sum, (float)(sum/arr.length));
    }

    public static void ForEachSumAvg(int arr[]) {
        int sum = 0;
        for (int i : arr) {
            sum += i;
        }
        System.out.printf("Suma Elementow: %d \n Srednia: %f", sum, (float)(sum/arr.length));
    }

    public static int[] RandomArray(int lenght, int min, int max) {
        int arr[] = new int[lenght];
        Random random = new Random();
        for(int i = 0; i < lenght; i++) {
            arr[i] = random.nextInt(max - min)+min;
        }
        return arr;
    }

}
