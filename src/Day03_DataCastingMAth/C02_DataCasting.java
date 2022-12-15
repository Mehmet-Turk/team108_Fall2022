package Day03_DataCastingMAth;

import java.util.Scanner;

public class C02_DataCasting {
    public static void main(String[] args) {
        System.out.println(23/5);//4 Java virgulden sonrasini siler yuvarlamaz
        double dbl = 27;
        System.out.println(dbl/4);//eger bir tanesi double ise double olarak yazdirir
        //kullanicadan 2 sayi alarak boldur

        Scanner scan = new Scanner(System.in);
        System.out.println("Iki tam sayi giriniz: ");
        int i = scan.nextInt();
        int a = scan.nextInt();
        System.out.println("sayilarin bolumu: " + i/(double)a);//bu sekilde bir tanesini double yaptik virgul sonrasi icin
    }
}
