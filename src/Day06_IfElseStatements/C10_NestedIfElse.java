package Day06_IfElseStatements;

import java.util.Scanner;

public class C10_NestedIfElse {
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
        if (kart == 'E' || kart == 'e'){
            if(adet > 10 ) System.out.println("Tebrikler %20 indirim. Toplam fiyat: " + adet*fiyat*0.8);
            else if (adet <= 0) System.out.println("Gecersiz urun adedi");
            else System.out.println("Tebrikler %15 indirim. Toplam fiyat: " + adet*fiyat*0.85);
        } else if (kart == 'H' || kart == 'h') {
            if(adet > 10 ) System.out.println("Tebrikler %15 indirim. Toplam fiyat: " + adet*fiyat*0.85);
            else if (adet <= 0) System.out.println("Gecersiz urun adedi");
            else System.out.println("Tebrikler %10 indirim. Toplam fiyat: " + adet*fiyat*0.9);
        }else System.out.println("hatali kart bilgisi");

    }
}
