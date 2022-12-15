package Day07_TernarySwitchStatements;

import java.util.Scanner;

public class C01_IfElseIf {
    public static void main(String[] args) {
        //kullanicidan bir tam sayi alin
        //sayi rakam ise girilen sayi rakam
        //sayi iki basamakliysa iki basamakli
        //sayi iki basamaktan buyukse buyuk sayi
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int num = scan.nextInt();
        if (num < 10 && num >=0) System.out.println("Girilen sayi rakam");
        else if (num >9 && num <=99) System.out.println("iki basamakli sayi");
        else if (num >=100) System.out.println("Buyuk sayi");
    }
}
