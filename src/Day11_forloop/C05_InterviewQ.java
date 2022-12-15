package Day11_forloop;

import java.util.Scanner;

public class C05_InterviewQ {
    public static void main(String[] args) {
        //1den baslayip kullanicidan alinan degere kadar tum tam sayilari yazdirin
        //eger sayi 3 bolunen bir sayi ise fizz
        //eger sayi 5 bolunen bir sayi buzz
        //eger hem 3 hem 5 e bolunuyorsa fizzBuzz yazdirin
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi giriniz");
        int end = scan.nextInt();
        for(int i =1;i<=end;i++){
            if(i%5 ==0&&i%3==0) System.out.print("fizzBuzz ");
            else if (i%5 == 0) System.out.print("buzz ");
            else if (i%3==0) System.out.print("fizz ");
            else System.out.print(i + " ");
        }
    }
}
