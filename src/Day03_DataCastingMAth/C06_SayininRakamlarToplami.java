package Day03_DataCastingMAth;

import java.util.Scanner;

public class C06_SayininRakamlarToplami {
    public static void main(String[] args) {
        //kullanicinin girdigi sayinin rakamlar toplamini bl
        Scanner scan = new Scanner(System.in);
        System.out.println("Posiive dort basamakli bir sayi girin");
        int i = scan.nextInt();
        int bir = 0;
        int sum = 0;
        bir = i % 10;
        sum = sum + bir;
        i = i / 10;
        bir = i % 10;
        sum = sum + bir;
        i = i / 10;
        bir = i % 10;
        sum = sum + bir;
        i = i / 10;
        bir = i % 10;
        sum = sum + bir;
        i = i / 10;
        System.out.println("Girilen sayinin rakamlar toplami: " + sum);

    }
}
