package Day03_DataCastingMAth;

import java.util.Scanner;

public class C04_DataCasting {
    public static void main(String[] args) {
        //kullanicidan bir double bir tam sayi alip bolup sonucu tamsayi olarak yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir double sayi bir tam sayi giriniz: ");
        double d = scan.nextDouble();
        int i = scan.nextInt();
        System.out.println("Tam sayi olarak bolum: " +(int)(d/i));
    }
}
