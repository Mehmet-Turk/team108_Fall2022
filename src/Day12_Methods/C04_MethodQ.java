package Day12_Methods;

import java.util.Scanner;

public class C04_MethodQ {
    public static void main(String[] args) {
        //kullanicidan iki sayi  ve istedigi islemi alip uygulayan ve sonucu donen method
        System.out.println(hesapMakinesi());
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ilk sayi giriniz:");
        double sayi1= scan.nextDouble();
        System.out.println("Lutfen ikinci sayi giriniz:");
        double sayi2 = scan.nextDouble();
        System.out.println("Lutfen yapmak istediginiz islemi girin:");
        char islem = scan.next().charAt(0);

    }
    public static double hesapMakinesiParametre(double sayi1, double sayi2, char islem){
        switch (islem){
            case '*':
                return sayi1 * sayi2;
            case '/':
                return sayi1 / sayi2;
            case '+':
                return sayi1 + sayi2;
            case '-':
                return sayi1 - sayi2;
            default:
                return 0;
        }

    }
    public static double hesapMakinesi(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen ilk sayi giriniz:");
        double sayi1= scan.nextDouble();
        System.out.println("Lutfen ikinci sayi giriniz:");
        double sayi2 = scan.nextDouble();
        System.out.println("Lutfen yapmak istediginiz islemi girin:");
        char islem = scan.next().charAt(0);
        double sonuc = 1;
        switch (islem){
            case '*':
                return sayi1 * sayi2;
            case '/':
                return sayi1 / sayi2;
            case '+':
                return sayi1 + sayi2;
            case '-':
                return sayi1 - sayi2;
            default:
                return 0;
        }
    }
}
