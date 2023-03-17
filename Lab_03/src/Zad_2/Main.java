package Zad_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int sD = 0, sU = 0, lU = 0, lD = 0, cNum;
        for (int i = 0; i < 10; i++) {
            System.out.format("Podaj liczbe nr.%d:", i+1);
            cNum = input.nextInt();
            if(cNum < 0) {
                lU++;
                sU += cNum;
            }else {
                lD++;
                sD += cNum;
            }
        }

        System.out.format("Suma dodatnich: %d \n Liczba Dodatnich: %d \n Suma Ujemnych: %d \n Liczba Ujemnych: %d", sD, lD, sU, lU);

    }
}
