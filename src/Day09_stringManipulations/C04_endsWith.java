package Day09_stringManipulations;

import java.util.Scanner;

public class C04_endsWith {
    public static void main(String[] args) {
        String str = "Java ogrenen issiz kalmaz";

        System.out.println(str.endsWith("kalmaz"));
        System.out.println("===");
        System.out.println(str.endsWith("Java ogrenen issiz kalmaz"));
        System.out.println(str.endsWith(""));


        //Soru: kullanicidan e mail alip
        //mail @ icermiyorsa "gecersiz mail"
        // mail @gmail.com icermiyorsa "mail gmail olmali
        // mail @gmail.com ile bitmiyorsa "mailde yazim hatasi var" yazdir
        System.out.println("=========");
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen mail adresinizi girin");
        String mail = scan.nextLine();
        if (!mail.contains("@")) System.out.println("Gecersiz mail");
        if (!mail.contains("@gmail.com")) System.out.println("Mail gmail olmali");
        if (!mail.endsWith("@gmail.com")) System.out.println("Mailde yazim hatasi var");
    }
}
