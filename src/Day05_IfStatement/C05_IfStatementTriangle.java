package Day05_IfStatement;

import java.util.Scanner;

public class C05_IfStatementTriangle {
    public static void main(String[] args) {
        //kullanicidan ucgeniin kenar uzunluklarini alip es kenar olup olmadigini bulan kodu
        Scanner scan = new Scanner(System.in);
        System.out.println("ucgenin kenar uzunluklarini giriniz: ");
        double a = scan.nextDouble();
        double b = scan.nextDouble();
        double c = scan.nextDouble();
        if (a==b && b==c && a >0) System.out.println("Ucgen eskenar bir ucgen");
    }
}
