package Zad_3;

public class Main {
    public static void main(String[] args) {
        int n=100, sum=0;
        while (n>0) {
            if(n%2==0) sum += n;
            n--;
        }
        System.out.println("Suma: "+sum);
    }
}
