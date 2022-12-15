package Day13_MethodOverLoadingWhile;

import java.util.Scanner;

public class C06_SifreKontrolu {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sifre isteyin ve asagidaki sartlari kontrol edin
        ve kullaniciya duzeltmesini soyleyin eger kullanici dogru girdiyse sifre basariyla kaydedildi
        ilk harf kucuk olmali
        son karakter rakam olmali
        sifre bosluk icermemeli
        uzunlugu en az 10 olmali
         */
        //sifre kontrolunu bir methodda yapin sonucu true false olarak dondurun
        //main methodda donen sonucu kontrol edin basariyla olusturldu yazincaya kadar devam edin
        Scanner scan = new Scanner(System.in);
        boolean tekrar = true;
        String sifre ="";
        while (tekrar){
            System.out.println("Lutfen sifre giriniz: ");
            sifre = scan.next();
            if (sifreKontrolu(sifre)){
                System.out.println("Sifre basarili");
                //break;
                tekrar = false;
            }
        }
    }
    public static boolean sifreKontrolu(String sifre){
        int count = 0;
        if (!(sifre.charAt(0)<='z'&&sifre.charAt(0)>='a')) {
            System.out.println("Ilk harf kucuk olmali");
            count++;
        }
        if(!(sifre.charAt(sifre.length()-1)>='0' && sifre.charAt(sifre.length()-1)<='9' )){
            System.out.println("Son karakter rakam olmali");
            count++;
        }
        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
            count++;
        }
        if (sifre.length()<=9){
            System.out.println("Sifre en az 10 karakter olmali");
            count++;
        }
        if (count==0){return true;}
        else {return false;}
    }
}
