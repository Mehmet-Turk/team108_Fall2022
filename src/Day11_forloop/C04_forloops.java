package Day11_forloop;

import java.util.Scanner;

public class C04_forloops {
    public static void main(String[] args) {
        //kullanicidan alinan baslangic verisinden bitis verisine kadar olan sayilarin topla
        //eger bitis degeri baslagic degerinden kucuk ise islemi bitir
        Scanner scan = new Scanner(System.in);
        System.out.println("BAslangic degerini girin:");
        int start = scan.nextInt();
        System.out.println("Bitis degerini girin");
        int end = scan.nextInt();
        int top= 0;
        if (end < start) System.out.println("Bitis degeri daha kucuk oldugu icin islem bitti");
        else  {for (int i = start;i<=end;i++){
            top+=i;
        }
            System.out.println("Toplam: "+ top);

        }
    }
}
