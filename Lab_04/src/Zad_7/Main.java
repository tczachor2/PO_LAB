package Zad_7;


public class Main {
    public static void main(String[] args) {
        String arr1[] = {"Ala", "Ma", "Kota"};
        String arr2[] = {"Ala", "Ma", "Kota"};

        if(CompareArrays(arr1, arr2)) System.out.println("Tablice sa identyczne");
        else System.out.println("Tablice nie sa identyczne");

    }

    public static boolean CompareArrays(String arr1[], String arr2[]) {
        if(arr1.length != arr2.length) return false;

        for (int i = 0; i < arr1.length; i++) {

            if(arr1[i].length() != arr2[i].length()) return false;

            for (int j = 0; j < arr1[i].length(); j++) {

                if(arr1[i].charAt(j) != arr2[i].charAt(j)) return false;

            }
        }

        return true;
    }

}
