package Day06_IfElseStatements;

import java.util.Scanner;

public class C11_IfElseStatement {
    public static void main(String[] args) {
        //kullanicidan aldigi urun adedi ve liste fiyatini alin
        //kullaniciya musteri karti olup olmadigini sorun
        // musteri karti var ve 10 urunden fazla aldiysa %20 yoksa %15 indirim
        //musteri karti yoksa 10 urunden fazla aldiysa %15 daha az aldiysa %10 indiri,
        Scanner scan = new Scanner(System.in);
        System.out.println("Aldigininiz urun adedini giriniz: ");
        int adet = scan.nextInt();
        System.out.println("Urunun liste fiyatini giriniz: ");
        double fiyat = scan.nextDouble();
        System.out.println("Musteri kartiniz var mi E/H");
        char kart = scan.next().charAt(0);
        if(adet > 10){
            if (kart == 'E' || kart == 'e' ) System.out.println("Tebrikler %20 indirim! Toplam: " + adet*fiyat*0.8);
            else if (kart == 'h' || kart == 'H') System.out.println("Tebrikler %15 indirim! Toplam: " + adet *fiyat*0.85);
        } else if (adet > 0 ) {
            if (kart == 'E' || kart == 'e' ) System.out.println("Tebrikler %15 indirim! Toplam: " + adet*fiyat*0.85);
            else if (kart == 'h' || kart == 'H') System.out.println("Tebrikler %10 indirim! Toplam: " + adet *fiyat*0.9);
        }else System.out.println("Yanlis adet bilgisi");
    }
}
