package Day06_IfElseStatements;

import java.util.Scanner;

public class C05_IfElseExamples {
    public static void main(String[] args) {
        //kullanicidan yas ve cinsiyeti alin
        //kadin 60 ve uzeri erkek 65 yas ve uzeri emekli olabilir
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter gender F/M:");
        char gender = scan.next().charAt(0);
        System.out.println("Please enter age: ");
        int age = scan.nextInt();
        if((gender =='F' || gender == 'k') && age >= 60 && age < 80){
            System.out.println("Emekli olabilir");
        } else if ((gender =='F' || gender == 'f') && age > 18) {
            System.out.println("Emekli olmak icin " + (60 - age) + " yil daha calismalisin");
        } else if ((gender =='M' || gender == 'm') && age >= 65 && age < 80 ) {
            System.out.println("Emekli olabilir");
        } else if ((gender =='M' || gender == 'm') && age > 18) {
            System.out.println("Emekli olmak icin " + (65 - age) + " yil daha calismalisin");
        }else System.out.println("Gecersiz bilgi");
    }
}
