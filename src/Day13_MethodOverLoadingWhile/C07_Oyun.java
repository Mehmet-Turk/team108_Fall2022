package Day13_MethodOverLoadingWhile;

import java.util.Random;
import java.util.Scanner;

public class C07_Oyun {
    public static void main(String[] args) {
        /*
        random olarak 1-100 bir sayi olusturun
        kullanicidan bu sayiyi bilmesini isteyin
        kullanici her deger girdiginde tuttugumuz sayi ile karsilastirip tahminini buyuklt/kucuklt
        kullanici tuttugumuz sayiyi bildiginde tahmin sayisini ve
        -3 veya daha az tahminde bildiyse "Vaooowww"
        -4-8 tahminde bildiyse "Aferin"
        - daha fazla tahminde bildiyse "basarisiz"
        yazdirin
         */
        Random random = new Random();
        int tutulanSayi = random.nextInt(100);
        Scanner scan = new Scanner(System.in);
        int girisAdedi=1;
        int girilenSayi=0;
        while(tutulanSayi!=girilenSayi){
            System.out.println("Tahmininizi girin:");
            girilenSayi = scan.nextInt();
            girisAdedi++;
            if (tutulanSayi==girilenSayi){
                if (girisAdedi<=3) System.out.println(girisAdedi + " seferde bildin Vaooow");
                else if(girisAdedi<9) System.out.println(+girisAdedi + " seferde bildin Aferin");
                else System.out.println(girisAdedi + " seferde bildin Basarisiz");
                break;
            } else if (tutulanSayi < girilenSayi) {
                System.out.println("Tahminini Kucult");
                girisAdedi++;
            } else {
                System.out.println("Tahminini buyult");
                girisAdedi++;
            }
        }

    }
}
