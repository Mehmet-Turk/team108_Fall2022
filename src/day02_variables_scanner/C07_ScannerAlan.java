package day02_variables_scanner;

import java.util.Scanner;

public class C07_ScannerAlan {
    public static void main(String[] args) {
        //kullanicadan dikdortgenin iki kenar uzunlugunu alip alanini hesaplayan programini yazin
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter the lenghts: ");
        double l1= scan.nextDouble();
        double l2 = scan.nextDouble();
        System.out.println("Dikdortgenin alani :" + l1*l2);
    }
}
