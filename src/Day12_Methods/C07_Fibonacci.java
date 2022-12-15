package Day12_Methods;

public class C07_Fibonacci {
    public static void main(String[] args) {
        //verilen sayi adedince fibonacci serisinden sayilar yazdiran bir method
        //fibonacci 0 1 1 2 3 5 8 13
        fibonacci(14);
    }
    public static void fibonacci(int sayi){

        if (sayi<=0) System.out.println("Gecersiz sayi");
        else {
            int sayi1= 0;
            int sayi2 = 1;
            int sayi3 =0;
            System.out.print(sayi1 + " " + sayi2 + " ");
            for (int i = 0; i <=sayi ; i++) {
                sayi3 =sayi1+sayi2;
                System.out.print(sayi3 + " ");
                sayi1=sayi2;
                sayi2=sayi3;
            }
            System.out.println();
        }
    }
}
