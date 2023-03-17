package Zad_6;

import static Kalkulator.Main.InputInt;

public class Main {
    public static void main(String[] args) {
        int i = 1, num;
        while (true) {
            System.out.println("Podaj liczbę nr." + i + ":");
            num = InputInt();
            if(num < 0) break;
            i++;
        }
    }
}
