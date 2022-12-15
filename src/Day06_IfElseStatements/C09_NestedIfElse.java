package Day06_IfElseStatements;

import java.util.Scanner;

public class C09_NestedIfElse {
    public static void main(String[] args) {
        //kullanicidan yas ve cinsiyeti alin
        //kadin 60 ve uzeri erkek 65 yas ve uzeri emekli olabilir


        //eger degisken birden fazlaysa degiskenlerden birini oncelige alarak ic ice if yazabiliriz
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter gender F/M:");
        char gender = scan.next().charAt(0);
        System.out.println("Please enter age: ");
        int age = scan.nextInt();
        if (gender == 'F' || gender == 'f'){
            if (age < 18 || age >80) System.out.println("Gecersiz yas");
            else if (age >=60) System.out.println("Emekli olabilirsiniz");
            else System.out.println("Emekli olmak icin " + (60-age) + " yil daha calismalisiniz");
        } else if (gender == 'M' || gender == 'm') {
            if (age < 18 || age >80) System.out.println("Gecersiz yas");
            else if (age >=65) System.out.println("Emekli olabilirsiniz");
            else System.out.println("Emekli olmak icin " + (65-age) + " yil daha calismalisiniz");
        }
    }
}
