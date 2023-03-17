package Zad_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n, i = 0, sum = 0;
        Scanner input = new Scanner(System.in);
        System.out.format("Podaj liczbe studentow: ");
        n = input.nextInt();
        while (i < n) {
            System.out.format("Podaj liczbe punktow dla %d studenta: ", i+1);
            sum += input.nextInt();
            i++;
        }
        System.out.println("Sredni wynik: " + sum/n);
    }
}