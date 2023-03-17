package delta;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double a,b,c;
        System.out.format("Podaj a: ");
        a = inputDouble();
        System.out.format("Podaj b: ");
        b = inputDouble();
        System.out.format("Podaj c: ");
        c = inputDouble();

        if(a==0) {
            System.out.format("A nie może równać się zero");
            return;
        }
        double delta = Delta(a, b, c);
        if(delta < 0) {
            System.out.format("Delta mniejsza od zera \n Brak Rozwiazan");
            return;
        }

        if(delta == 0) {
            System.out.format("Delta równa zero \n Jedno rozwiazanie: x = %f", -b/(2*a));
            return;
        }

        System.out.format("Delta większa od zera \n Dwa rozwiazania: x1 = %f, x2 = %f", (-b-Math.sqrt(delta))/(2*a), (-b+Math.sqrt(delta))/(2*a));
        return;
    }

    public static double inputDouble() {
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }
    public static double Delta(double a, double b, double c) {
        return (b*b) - (4*a*c);
    }
}