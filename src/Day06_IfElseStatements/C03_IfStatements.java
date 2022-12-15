package Day06_IfElseStatements;

import java.util.Scanner;

public class C03_IfStatements {
    public static void main(String[] args) {
        //kullanicadan bir karakter isteyip buyuk harf olup olmadigini yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a character: ");
        char c = scan.next().charAt(0);
        if(c >= 'A' && c <='Z'){
            System.out.println("Buyuk Harf");
        }else {
            System.out.println("Buyuk harf degil");
        }
    }
}
