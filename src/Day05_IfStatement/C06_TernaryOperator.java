package Day05_IfStatement;

import java.util.Scanner;

public class C06_TernaryOperator {
    public static void main(String[] args) {
        //Kullanicidan iki sayi alip buyuk olani yazdir
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter two numbers");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int max = (a<b)? b : a;
        System.out.println(max);
    }
}
