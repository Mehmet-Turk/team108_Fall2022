package Day11_forloop;

import java.util.Scanner;

public class C01_Forloops {

    public static void main(String[] args) {
        //kullanicidan bir karakter alip ondan sonraki 10 karakteri yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir karakter girin");
        char input = scan.next().charAt(0);
        for(int i = 1; i<=10; i++){
            System.out.print((char)(input + i) + " ");
        }
        C12_Method fakt = new C12_Method();

    }
}
