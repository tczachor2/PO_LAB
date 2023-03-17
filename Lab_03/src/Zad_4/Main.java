package Zad_4;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int min = -11, max = 45, a, n, sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.printf("Wpisz n: ");
        n = input.nextInt();

        for (int i=0; i<n; i++) {
            a = RandomInt(min, max);
            if(a%2==0) sum += a;
        }

        System.out.printf("Suma liczb parzystych: %d", sum);

    }
    public static int RandomInt(int min, int max) {
        Random rand = new Random();
        return rand.nextInt(max-min+1)+min;
    }
}
