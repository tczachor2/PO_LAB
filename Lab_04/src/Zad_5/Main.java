package Zad_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int arr[];
        arr = CreateArray(8);
        arr = SortArray(arr);
        PrintArray(arr);
    }

    public static int InputInt() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }

    public static int[] CreateArray(int n) {
        int arr[] = new int[n];
        for(int i = 0; i < n; i++) {
            System.out.printf("Wpisz %d liczbe: ", i+1);
            arr[i] = InputInt();
        }
        return arr;
    }

    public static int[] SortArray(int arr[]) {

        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]) {
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        return arr;
    }

    public static void PrintArray(int arr[]){
        for(int val : arr) System.out.printf("%d ", val);
    }

}
