package Day13_MethodOverLoadingWhile;

import Day12_Methods.C02_MethodAsal;
import Day12_Methods.C06_StringTersCevirmeMethodu;
import Day12_Methods.C07_Fibonacci;
import Day12_Methods.C08_Palindrome;

public class C01_MethodCall {
    public static void main(String[] args) {
        //ilk 15 fibonacci sayisini yazdirin
        C07_Fibonacci.fibonacci(15);
        //asagida verilen cumleyi terse cevir
        String str ="royiritsalyalok irelsi kamnalluk dohteM";

        String tersStr = C06_StringTersCevirmeMethodu.stringTerseCevirme(str);
        System.out.println(tersStr);

        //asagida verilen cumlenin palindrome olup olmadigini yazdirin
        String str1 = "Java Candir";
        System.out.println(C08_Palindrome.palindrome(str1));

        //asagida verilen sayinin asal olup olmadigini yazdirin
        int sayi = 23;
        boolean sonuc = C02_MethodAsal.asalBulma(sayi);
        if (sonuc) System.out.println("Asal");
        else System.out.println("Asal degil");

    }
}
