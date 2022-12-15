package Day13_MethodOverLoadingWhile;

public class C02_MethodOverLoading {
    public static void main(String[] args) {
        String str = "Java cok guzel";
        System.out.println(str.substring(5));
        System.out.println(str.substring(2, 5));
        toplama(2,3);
        toplama(1,2,3);
        //parametrelerin data turlerini degistirip ayni isimde farkli methodlar yazabiliriz
    }
    public static void toplama(int a, int b){
        System.out.println("sayilarin toplami: " + (a+b));
    }
    public static void toplama(int a, int b, int c){
        System.out.println("3 sayinin toplami " + (a+b+c));
    }
    public static void toplama(double a, int b){
        System.out.println("sayilarin toplami: " + (a+b));
    }
}
