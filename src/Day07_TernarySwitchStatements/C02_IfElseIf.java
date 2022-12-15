package Day07_TernarySwitchStatements;

import java.util.Scanner;

public class C02_IfElseIf {
    public static void main(String[] args) {
        //kullanicidan bir tam sayi alin
        //eger sayi negatif ise negatif sayi
        //sayi rakam ise girilen sayi rakam
        //sayi iki basamakliysa iki basamakli
        //sayi iki basamaktan buyukse buyuk sayi
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int num = scan.nextInt();
        if (num < 0 ) System.out.println("Negatif sayi");
        else if (num <= 9) System.out.println("Rakam");
        else if (num <= 99) System.out.println("Iki basamakli sayi");
        else System.out.println("Buyuk sayi");
    }
}
