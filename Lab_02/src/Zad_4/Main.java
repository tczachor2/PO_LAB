package Zad_4;

import java.util.Scanner;

public class Main {
    static int arr[] = new int[10];
    public static void main(String[] args) {
        Run();
    }

    public static void Run() {
        while(true) {
            Menu();
            System.out.format("Wybor: ");
            int wybor = InputInt();
            switch (wybor) {
                case 1:
                    arr = EnterData();
                    break;
                case 2:
                    ElementSum(arr);
                    break;
                case 3:
                    ElementProduct(arr);
                    break;
                case 4:
                    ElementAvg(arr);
                    break;
                case 5:
                    ElementMin(arr);
                    break;
                case 6:
                    ElementMax(arr);
                    break;
                case 7:
                    Close();
                    break;
                default:
                    System.out.println("Wpisz wlasciwa wartosc!");
                    break;
            }
        }
    }
    public static void Menu() {
        System.out.println("\n1. Wpisz Dane");
        System.out.println("2. Wyswietl Sume Elementow");
        System.out.println("3. Wyswietl Iloczyn Elementow");
        System.out.println("4. Wyswietl Srednia Elementow");
        System.out.println("5. Wyswietl Minimalna Wartosc");
        System.out.println("6. Wyswietl Maksymalna Wartosc");
        System.out.println("7. Wyjdz");
    }
    public static int InputInt() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    public static String InputString() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    public static int[] EnterData() {
        int arr[] = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.printf("Podaj %d liczbę: ", i+1);
            arr[i] = InputInt();
        }
        return arr;
    }
    public static void ElementSum(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Suma: " + sum);
    }

    public static void ElementProduct(int arr[]) {
        int sum = 1;
        for (int i = 0; i < arr.length; i++) {
            sum *= arr[i];
        }
        System.out.println("Iloczyn: " + sum);
    }

    public static void ElementAvg(int arr[]) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Srednia: " + sum/arr.length);
    }

    public static void ElementMin(int arr[]) {
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(min > arr[i]) min = arr[i];
        }
        System.out.println("Min: " + min);
    }

    public static void ElementMax(int arr[]) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if(max < arr[i]) max = arr[i];
        }
        System.out.println("Min: " + max);
    }

    public static void Close() {
        char symbol;
        System.out.println("Czy napewno chcesz wyjsc? \n Wpisz [T] lub [t]");
        symbol = InputString().charAt(0);
        if(symbol == 'T' || symbol == 't') System.exit(0);
    }
}
