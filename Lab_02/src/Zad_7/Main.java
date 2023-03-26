package Zad_7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = 0;
        System.out.printf("Wpisz Ilosc Elementow: ");
        n = InputInt();
        int arr[] = GetData(n);

        arr = BubbleSort(arr);
        PrintArray(arr);
    }

    public static int InputInt() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static int[] GetData(int n) {
        int arr[] = new int[n];
        int i=0;
        while (i<n) {
            System.out.printf("Wpisz %d liczbę: ", i+1);
            arr[i] = InputInt();
            i++;
        }

        return arr;
    }

    public static int[] BubbleSort(int arr[]) {

        boolean swaped;
        int j = 0;

        do {
            swaped = false;

            for(int i = 0; i < arr.length-1-j; i++) {
                if(arr[i] > arr[i+1]) {
                    int temp = arr[i];
                    arr[i] = arr[i+1];
                    arr[i+1] = temp;
                    swaped = true;
                }
            }
            j++;
        }while (swaped);

        return arr;
    }

    public static void PrintArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) System.out.printf("%d ", arr[i]);
    }

}
