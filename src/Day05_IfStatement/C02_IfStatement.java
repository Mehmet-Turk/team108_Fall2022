package Day05_IfStatement;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

public class C02_IfStatement {
    public static void main(String[] args) {
        //kullanicidan alinan sayinin
        //pozitif ise poozitif
        //100 ile 999 arasinda ise 3 basamakli
        //3 ile bolunebiliyorsa 3 kati
        //birler basamagi 7 se mukemmel
        //seceneklerden uygun olanlari yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi girininiz: ");
        int i = scan.nextInt();
        if (i > 0 ){
            System.out.println("Sayi pozitif");
        }
        if (i > 99 && i < 1000){
            System.out.println("Sayi 3 basamakli");
        }
        if (i % 3 == 0){
            System.out.println("Sayi 3un kati");
        }
        if (i % 10 == 7 || i % 10 == -7){
            System.out.println("Sayi mukemmel");
        }
    }
}
