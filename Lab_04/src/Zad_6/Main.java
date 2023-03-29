package Zad_6;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int arr[];
        arr = CreateArray(5);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Factorial(arr[i]);
        }
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

    public static int Factorial(int n) {
        if(n<1) return 1;
        return Factorial(n-1) * n;
    }

    public static void PrintArray(int arr[]){
        for(int val : arr) System.out.printf("%d ", val);
    }


}
