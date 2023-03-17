package Zad_5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String word;
        boolean pol = true;
        System.out.format("Wpisz slowo do sprawdzenia: ");
        Scanner input = new Scanner(System.in);
        word = input.nextLine();

        for (int i=0; i<word.length()/2; i++) {
            if(word.charAt(i) != word.charAt(word.length()-1-i)) {
                pol = false;
                break;
            }
        }

        if(pol) System.out.println("Slowo jest palindromem");
        else System.out.println("Slowo nie jest palindromem");
    }
}
