package Zad_4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String arr[] = new String[5];
        for(int i = 0; i < arr.length; i++) {
            System.out.printf("Wpisz %d słowo: ", i+1);
            arr[i] = InputString();
        }


        for(int i = arr.length-1; i >= 0; i--) {

            for(int j = arr[i].length()-1; j >= 0; j--) {

                System.out.printf("%s", arr[i].charAt(j));

            }

            System.out.printf("\n");

        }

    }

    public static String InputString() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }

}
