package day02_variables_scanner;

import java.util.Scanner;

public class C06_ScannerUser {
    public static void main(String[] args) {
        /*Kullanicidan ismini soy ismini ve yasini alip asagidaki formatta yazdirin
                Isminiz: John
                Soyisminiz: Turk;
                Yasiniz: 32
                Kaydiniz basariyla tamamlanmistir.
                */
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your first name: ");
        String firstNAme = scan.nextLine();
        System.out.println("Please enter your last name: ");
        String lastNAme = scan.nextLine();
        System.out.println("Please enter your age: ");
        int age = scan.nextInt();
        System.out.println("Isminiz: " + firstNAme +
                            "\nSoyisminiz :"+ lastNAme+ "\n"+//next line gecmek icin kullanilir
                            "\nYasiniz: " + age);
    }
}
