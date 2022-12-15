package Day06_IfElseStatements;

import java.util.Scanner;

public class CO4_IfElsIF {
    public static void main(String[] args) {
        //ogrenciden notu alip
        //eger 85 ve ustu ise AA
        //eger 65 ve ustu ise BB
        //50 ve ustu ise CC
        //daha dusuk ise DD
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your grade: ");
        double grade = scan.nextDouble();
        if(grade < 0 || grade > 100){
            System.out.println("Gecersiz not");
        } else if (grade >= 85) {
            System.out.println("Notunuz AA");
        } else if (grade >= 65) {
            System.out.println("Notunuz BB");
        } else if (grade >= 50) {
            System.out.println("Notunuz CC");
        } else
            System.out.println("Notunuz DD Kaldiniz");
    }
}
