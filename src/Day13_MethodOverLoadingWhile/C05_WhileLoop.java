package Day13_MethodOverLoadingWhile;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {
        //kullanici toplama uzere iki sayi alin
        //girilen sayilarin toplami 500 olur veya gecerse
        //"bu kadar sayi yeter" deyip toplami yazdrin

        //forloop ile yaparsak
        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        int toplam = 0;
        /*for (int i = 1; i <10000 ; i++) {
            System.out.println("Bir sayi giriniz:");
            sayi = scan.nextInt();
            toplam+=sayi;
            if (toplam>=500) {
                System.out.println("Bu kadar sayi yeter toplam: " + toplam + " oldu");
                break;
            }

        }*/
        //while loop ile yaparsak
        while (toplam <500) {
            System.out.println("Bir sayi giriniz:");
            sayi = scan.nextInt();
            toplam += sayi;
            if (toplam >= 500) {
                System.out.println("While ile Bu kadar sayi yeter toplam: " + toplam + " oldu");

            }
        }
    }
}
