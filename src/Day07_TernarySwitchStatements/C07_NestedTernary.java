package Day07_TernarySwitchStatements;

import java.util.Scanner;

public class C07_NestedTernary {
    public static void main(String[] args) {
        //kullanicidan aldigin sayi
        //eger pozitif ise tek cift kontrol et
        //eger negatif ise 3 basamakli kontrol et
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        int num = scan1.nextInt();
        System.out.println(num>0?(num%2==0?"Cift Sayi":"Tek Sayi"):(num<-99 &&num >-999 ? "Uc basamakli" : "Uc basamakli degil"));
    }
}
