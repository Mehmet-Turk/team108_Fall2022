package day02_variables_scanner;

import java.util.Scanner;

public class C10_Scanner {
    public static void main(String[] args) {
        // kullanicidan bir double alip toplamini ve carpimini
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a ondalikli: ");
        double db = scan.nextDouble();
        System.out.println("Please an integer");
        int i= scan.nextInt();
        System.out.println("Plus: "+ (i+db));
        System.out.println("multiplication: "+ (db*i));
    }
}
