package Day06_IfElseStatements;

import java.util.Scanner;

public class C02_IfElseStatements {
    public static void main(String[] args) {
        //kullanicidan ucgenin uzunuklarini al ikiz kenar ucgen mi
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter triangle lengths");
        double l1 = scan.nextDouble();
        double l2 = scan.nextDouble();
        double l3 = scan.nextDouble();
        if((l1 == l2 && l1 != l3) ||
                (l3 == l1 && l3 != l2 ) ||
                (l2 == l1 && l2 != l3)){
            System.out.println("Triangle is an ikiz kenar");
        }else {
            System.out.println("Triangle is not an ikizkenar degil");
        }

    }
    }

