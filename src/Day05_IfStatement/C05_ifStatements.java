package Day05_IfStatement;

import java.util.Scanner;

public class C05_ifStatements {
    public static void main(String[] args) {
        /*kullanicidan bir harf alin ve o harfle baslayan bir ay varsa yazdirin*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir harf giriniz");
        char c = scan.next().charAt(0);
        if (c == 'o' || c== 'O') System.out.println("Ocak");
        if (c == 's' || c== 'S') System.out.println("Subat");
        if (c == 'm' || c== 'M') System.out.println("MArt veya Mayis");
        if (c == 'N' || c== 'n') System.out.println("Nisan");
        if (c == 'h' || c== 'H') System.out.println("Haziran");
        if (c == 'T' || c== 't') System.out.println("Temmuz");
        if (c == 'A' || c== 'a') System.out.println("Aralik veya Agustos");
        if (c == 'e' || c== 'E') System.out.println("Eylul veya ekim");
        if (c == 'k' || c== 'K') System.out.println("kasim");






    }
}
