package day02_variables_scanner;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number:");
        int number = scan.nextInt();
        System.out.println(number);
        System.out.println("Please enter a name: ");
        String str = scan.next();//next sadece bir kelime alir. nextLine hepsini alir

        System.out.println(str.toUpperCase());
    }
}
