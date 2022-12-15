package Day12_Methods;

public class C03_MethodFak {
    public static void main(String[] args) {
        //verilen sayinin 15 ten kucuk olup olmadigini kontrol eden
        //eger 15ten kucukse faktoriyelini hesaplayan yazdiran method
        faktoriyelHesaplam(5);
    }
    public static void faktoriyelHesaplam(int a){
        int carpim = 1;
        if (a < 15){
            for (int i = 1; i <= a; i++) {
                carpim *= i;
            }System.out.println(carpim);
        }else System.out.println("Sayi sinirin disinda");

    }
}
