package Day10_StringManipulations;

import java.util.Scanner;

public class C05_Example {
    public static void main(String[] args) {
        /*
        kullanicidan bir culmle alin
        eger cumle ev iceriyorsa "Home Sweet Home" yazdirin
        is geciyorsa "calismak guzeldir"
        ikisini iceriyorsa "hem ev lazim hem is"
        hicbirini icermiyorsa "cok calisman lazim

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir cumle giriniz: ");
        String str = scan.nextLine();
        String cumle = str.toLowerCase();
        if (cumle.contains("ev")&& cumle.contains("is")) System.out.println("hem eve lazim hme is");
        else if (cumle.contains("is")) System.out.println("Calismak guzeldir");
        else if (cumle.contains("ev") ) System.out.println("Home Sweet Home");
        else System.out.println("cok calismam lazim");

    }
}
