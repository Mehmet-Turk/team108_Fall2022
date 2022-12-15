package Day06_IfElseStatements;

import java.util.Scanner;

public class C01_IfelseStatements {
    public static void main(String[] args) {
        // kullanicidan ucgenin kena uzunlularini alip yazdir
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter triangle lengths");
        double l1 = scan.nextDouble();
        double l2 = scan.nextDouble();
        double l3 = scan.nextDouble();
        if(l1 == l2 && l2 == l3 && l1>0){
            System.out.println("Triangle is an equalleteral triangle");
        }else {
            System.out.println("Triangle is not an equaleteral triange");
        }

    }
}
