package Day05_IfStatement;

import java.util.Scanner;

public class C01_IfStatement {
    public static void main(String[] args) {
        //kullanicidan aldiginiz notu harf notuna ceviren kodu yazin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen puaninizi girin: ");
        double not = scan.nextDouble();
        if (not <= 0 && not < 50  ){
            System.out.println("Notunuz DD. Kaldiniz");
        }
        if (not > 49 && not < 65  ){
            System.out.println("Notunuz CB.");
        }
        if (not > 64 && not<=85  ){
            System.out.println("Notunuz BB.");
        }
        if (not >84){
            System.out.println("Notunuz AA.");
        }
    }
}
