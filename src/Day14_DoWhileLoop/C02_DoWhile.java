package Day14_DoWhileLoop;

import java.util.Scanner;

public class C02_DoWhile {
    public static void main(String[] args) {
        //kullanicidan istedigi kadar sayi alin ve toplayin
        //kullanici 0 girerse islemi bititein
        Scanner scan = new Scanner(System.in);
        int toplam = 0;
        int girilenSayi = 0;
        do {
            System.out.println("Bir sayi girin:");
            girilenSayi = scan.nextInt();
            toplam +=girilenSayi;

        }while (girilenSayi!=0);
        System.out.println("Toplam: " + toplam);
    }
}
