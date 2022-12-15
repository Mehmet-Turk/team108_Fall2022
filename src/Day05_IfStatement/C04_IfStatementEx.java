package Day05_IfStatement;

import java.util.Scanner;

public class C04_IfStatementEx {
    public static void main(String[] args) {
        //kullanicidan aldigimiz degerler
        //3 ile bolunebiliyorsa 3 e bolunur
        //5 bese bolunebiliyorsa 5  bolunur
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz: ");
        int i = scan.nextInt();
        if (i % 3 == 0) System.out.println("Sayi 3 e tam bolunur");
        //body isaretsiz if calisir ama sadece ; e kadar olan kismi calistirir
        if (i % 5 == 0){
            System.out.println("Sayi 5 e tam bolunur");
        }


    }
}
