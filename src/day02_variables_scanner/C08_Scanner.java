package day02_variables_scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {
        // kullanicidan aldiginiz sayilarin yerlerini degistiren kodu yaziniz
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter number1:");
        double number1 = scan.nextDouble();
        System.out.println("Please enter number2:");
        double number2 = scan.nextDouble();
        double ex;
        ex = number2;//ex = 2
        number2 = number1;// n2 1
        number1 = ex;// n2
        System.out.println(number1);
        System.out.println(number2);

    }
}
