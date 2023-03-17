import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int a,b;

        Scanner input = new Scanner(System.in);

        System.out.println("Imie: " + name() + "\nWiek: " + age());

        System.out.println("Wpisz a: ");
        a = input.nextInt();
        System.out.println("Wpisz b: ");
        b = input.nextInt();

        sum(a,b);

        System.out.println(even(5));

        System.out.println(divisible(15));

        System.out.println(cubed(3));

        System.out.println(sqrt(4));

        System.out.println("Wpisz a: ");
        a = input.nextInt();
        System.out.println("Wpisz b: ");
        b = input.nextInt();

        if(a>b) {
            int temp = a;
            b = a;
            a = temp;
        }

        System.out.println(ct(randNum(a,b), randNum(a,b), randNum(a,b)));

    }


    public static int randNum(int min, int max) {
        Random rand = new Random();;

        int randomNum = rand.nextInt((max - min) + 1) + min;

        return randomNum;
    }
    // 1
    public static String name() {
        return "Tomasz";
    }

    public static int age() {
        return 20;
    }

    // 2
    public static void sum(double a,double b) {
        System.out.println(a + "+" + b +"="+ (a+b));
    }

    // 3
    public static boolean even(double num) {
        return num%2==0;
    }

    // 4
    public static boolean divisible(double num) {
        return num%3==0&&num%5==0;
    }

    // 5
    public static double cubed(double num) {
        return  num*num*num;
    }

    // 6
    public static double sqrt(double num) {
        return Math.sqrt(num);
    }

    // 7
    public static boolean ct(double a, double b,double c) {
        if((a+b)>c && (b+c)>a && (a+c)>b) return true;
        else return false;
    }
}
