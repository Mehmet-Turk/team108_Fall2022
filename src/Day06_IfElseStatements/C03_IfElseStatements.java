package Day06_IfElseStatements;

import java.util.Scanner;

public class C03_IfElseStatements {
    public static void main(String[] args) {
        // kullanicidan bir harf isteyin buyuk ise kucuk degilse aynisini yazdir
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a letter");
        char c = scan.next().charAt(0);

        if(c>= 'a' && c <= 'z'){
            System.out.println((char) (c-32));
            System.out.println(Character.toUpperCase(c));

        }else {
            System.out.println(c);
        }
    }
}
