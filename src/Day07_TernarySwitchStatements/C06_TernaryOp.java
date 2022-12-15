package Day07_TernarySwitchStatements;

import java.util.Scanner;

public class C06_TernaryOp {
    public static void main(String[] args) {
      /*  //kullanidan alinan sayinin 5in kati olup olmadigini kontrol et
        Scanner scan = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        int num = scan.nextInt();
        System.out.println(num % 5 ==0 ? "Sayi 5'in kati" : "Sayi 5'in kati degil");*/


        //kullanicidan not alin 50 ustu ise gectin degilse kaldin
       /* Scanner scan1 = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        int num1 = scan1.nextInt();
        System.out.println(num1 > 50 ? "Gectin" : "Kaldin");*/

        //kullanicadan aldigin harf eger kucuk ise buyuk degilse aynen yazdir
       /* Scanner scan1 = new Scanner(System.in);
        System.out.print("Lutfen bir harf giriniz: ");
        char c = scan1.next().charAt(0);
        System.out.println(c >='a' && c <= 'z'? Character.toUpperCase(c) : c);//(char)(c-32)*/

        //kullanicidan aldigin degerin mutlak degerini yazdir
        Scanner scan1 = new Scanner(System.in);
        System.out.print("Lutfen bir sayi giriniz: ");
        int num = scan1.nextInt();
        System.out.println(num<0? num*-1:num);

    }
}
