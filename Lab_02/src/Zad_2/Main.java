package Kalkulator;

import java.util.Scanner;

public class Main {
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
                    Suma();
                    break;
                case 2:
                    Roznica();
                    break;
                case 3:
                    Iloczyn();
                    break;
                case 4:
                    Iloraz();
                    break;
                case 5:
                    Potega();
                    break;
                case 6:
                    Pierwiastek();
                    break;
                case 7:
                    funTryg();
                    break;
                case 8:
                    Close();
                    break;
                default:
                    System.out.println("Wpisz wlasciwa wartosc!");
                    break;
            }
        }
    }
    public static void Menu() {
        System.out.println("1. Suma");
        System.out.println("2. Roznica");
        System.out.println("3. Iloczyn");
        System.out.println("4. Iloraz");
        System.out.println("5. Potega");
        System.out.println("6. Pierwiastek");
        System.out.println("7. Wartosci Trygonometryczne");
        System.out.println("8. Wyjdz");
    }
    public static int InputInt() {
        Scanner input = new Scanner(System.in);
        return input.nextInt();
    }
    public static double InputDouble() {
        Scanner input = new Scanner(System.in);
        return input.nextDouble();
    }
    public static String InputString() {
        Scanner input = new Scanner(System.in);
        return input.nextLine();
    }
    public static void Suma() {
        double a,b;
        System.out.format("Wpisz a: ");
        a = InputDouble();
        System.out.format("Wpisz b: ");
        b = InputDouble();
        System.out.format("%f + %f = %f", a,b,a+b);
    }
    public static void Roznica() {
        double a,b;
        System.out.format("Wpisz a: ");
        a = InputDouble();
        System.out.format("Wpisz b: ");
        b = InputDouble();
        System.out.format("%f - %f = %f", a,b,a-b);
    }
    public static void Iloczyn() {
        double a,b;
        System.out.format("Wpisz a: ");
        a = InputDouble();
        System.out.format("Wpisz b: ");
        b = InputDouble();
        System.out.format("%f * %f = %f", a,b,a*b);
    }
    public static void Iloraz() {
        double a,b;
        System.out.format("Wpisz a: ");
        a = InputDouble();
        System.out.format("Wpisz b: ");
        b = InputDouble();
        System.out.format("%f / %f = %f", a,b,a/b);
    }
    public static void Potega() {
        double a,b;
        System.out.format("Wpisz a: ");
        a = InputDouble();
        System.out.format("Wpisz b: ");
        b = InputDouble();
        System.out.format("%f ^ %f = %f", a,b,Math.pow(a,b));
    }
    public static void Pierwiastek() {
        double a;
        System.out.format("Wpisz a: ");
        a = InputDouble();
        System.out.format("sqrt(%f) = %f", a,Math.sqrt(a));
    }
    public static void funTryg() {
        double a;
        System.out.format("Wpisz a: ");
        a = InputDouble();
        System.out.format("Cos(%f) = %f, Sin(%f) = %f, Tg(%f) = %f", a, Math.cos(a), a, Math.sin(a), a, Math.tan(a));
        return;
    }
    public static void Close() {
        char symbol;
        System.out.println("Czy napewno chcesz wyjsc? \n Wpisz [T] lub [t]");
        symbol = InputString().charAt(0);
        if(symbol == 'T' || symbol == 't') System.exit(0);
        else return;
    }
}
