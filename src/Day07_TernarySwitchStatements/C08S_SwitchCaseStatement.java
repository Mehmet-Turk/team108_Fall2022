package Day07_TernarySwitchStatements;

import java.util.Scanner;

public class C08S_SwitchCaseStatement {
    public static void main(String[] args) {
        //kullanicidan iki sayi alin ve kullaniciya istedigi islemi sorun *+-/
        //istedigi islemi yapin
        //bu isaretlerden birini girmezse yanlis islem uyarisi
       int num1 = 20;
       int num2 = 10;
       char islem = '/';
       if (islem =='+' ) System.out.println("Sayilarin toplami: " + (num1 + num2));
       else if (islem == '*') System.out.println("Sayilarin carpimi: " + (num1 * num2));
       else if (islem == '/') System.out.println("Sayilarin bolumu: " + (num1 / num2));
       else if (islem == '-') System.out.println("Sayilarin farki: " + (num1 - num2));
       else System.out.println("Yanlis islem");


       //switch case ile
        System.out.println("=======================");
        switch (islem){
            case '+' :
                System.out.println("Sayilarin toplami: " + (num1 + num2));
                break;
            case '-':
                System.out.println("Sayilarin farki: " + (num1 - num2));
                break;
            case '*':
                System.out.println("Sayilarin carpimi: " + (num1 * num2));
                break;
            case '/':
                System.out.println("Sayilarin bolmu: " + (num1 / num2));
                break;
            default: System.out.println("Yanlis islem");
        }
    }
}
