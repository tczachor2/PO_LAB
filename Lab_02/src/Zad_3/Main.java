package Zad_3;

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
                    ShowData(arr);
                    break;
                case 3:
                    ShowRevData(arr);
                    break;
                case 4:
                    ShowOddIdData(arr);
                    break;
                case 5:
                    ShowEvenIdData(arr);
                    break;
                case 6:
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
        System.out.println("2. Wyswietl Dane");
        System.out.println("3. Wyswietl Dane W Odwroconej Kolejnosci");
        System.out.println("4. Wyswietl Dane O Nie Parzystych Indeksach");
        System.out.println("5. Wyswietl Dane O Parzystych Indeksach");
        System.out.println("6. Wyjdz");
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
    public static void ShowData(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("%d ", arr[i]);
        }
    }
    public static void ShowRevData(int arr[]) {
        for (int i = arr.length-1; i > 0; i--) {
            System.out.printf("%d ", arr[i]);
        }
    }
    public static void ShowOddIdData(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if(i%2==0) System.out.printf("%d ", arr[i]);
        }
    }
    public static void ShowEvenIdData(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            if(i%2==1) System.out.printf("%d ", arr[i]);
        }
    }
    public static void Close() {
        char symbol;
        System.out.println("Czy napewno chcesz wyjsc? \n Wpisz [T] lub [t]");
        symbol = InputString().charAt(0);
        if(symbol == 'T' || symbol == 't') System.exit(0);
    }
}
