package Day10_StringManipulations;

import java.util.Scanner;

public class C09_Forloops {
    public static void main(String[] args) {
        //kullanicidan iki sayi al besin katlarini yazdir
        Scanner scan = new Scanner(System.in);
        System.out.println(" iki sayi girin");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int top = 0;
        for (int i =a; i<=b; i++){
            if (i%5==0) System.out.println(i);
            top += i;
        }
        System.out.println(top);
    }
}
