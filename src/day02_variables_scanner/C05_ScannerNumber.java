package day02_variables_scanner;

import java.util.Scanner;

public class C05_ScannerNumber {
    public static void main(String[] args) {
        // kullanicidan sayi alip karesini yazdiran kod
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter a number to be squared: ");
        double number = scan.nextDouble();
        System.out.println("Square of the number is: " + number * number);
    }
}
