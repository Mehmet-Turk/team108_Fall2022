package Day07_TernarySwitchStatements;

import java.util.Scanner;

public class C05_TernaryOp {
    public static void main(String[] args) {
        //kullanicidan ucgenin kenar uzunluklarini al
        //eskenar ise yazdir ddegilse yazdir
        Scanner scan = new Scanner(System.in);
        System.out.println("UCgenin kenar uzunluklarini giriniz");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        System.out.println(a == b && a == c ? "Eskenar Ucgen" : "Eskenar ucgen degil");
    }
}
