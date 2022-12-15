package Day06_IfElseStatements;

import java.util.Scanner;

public class C07_IfElseIf {
    public static void main(String[] args) {
        // kullanicidan boy kilo bilgisini alip kutle indexi hesaplayin (kilo*1000/(boy*boy))
        //eger 30 ve buyuk ise obez
        //25-30 arasi kilolu
        //20-25 arasi normal
        //20den kucuk ise zayif
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen kg olarak kilonuzu giriniz:");
        double kilo = scan.nextDouble();
        System.out.println("Lutfen boyunuzu cm olarak giriniz:");
        double boy = scan.nextDouble();
        double index = kilo * 10000 / (boy * boy);
        System.out.println("vucud kitle indexini: " + index);
        if (index >= 30) {
            System.out.println("Obez");
        }else if (index >= 25) {
            System.out.println("Kilolu");
        } else if (index >= 20) {
            System.out.println("Normal");
        }else System.out.println("Zayif");
    }
}
