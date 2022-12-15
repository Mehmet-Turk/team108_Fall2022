package Day07_TernarySwitchStatements;

import java.util.Scanner;

public class C04_Ternary {
    public static void main(String[] args) {
        //ternary basit if statementlar icin kullanilir
        //kullanicidan alinan deger 100den buyuk ise sayiyi iki ile carpin degilse 10 ekleyin
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir sayi giriniz");
        int num = scan.nextInt();
        num =num>100? num*2:num+10;
        System.out.println(num);
    }
}
