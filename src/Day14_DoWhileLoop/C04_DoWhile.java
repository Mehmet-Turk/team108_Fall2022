package Day14_DoWhileLoop;

import java.util.Scanner;

public class C04_DoWhile {
    public static void main(String[] args) {
        //kullanicidan bir tam sayi isteyin ve sayinin tamkare olup olmadigini bulun
        Scanner scan = new Scanner(System.in);
        int girilenSayi = 0;
        do {
            System.out.println("Bir tam sayi giriniz: ");
            girilenSayi = scan.nextInt();
            for (int i = 1; i <100 ; i++) {
                if (Math.sqrt(girilenSayi)==i) System.out.println("Sayi tam kare");

            }
        }while (girilenSayi!=0);
    }
}
