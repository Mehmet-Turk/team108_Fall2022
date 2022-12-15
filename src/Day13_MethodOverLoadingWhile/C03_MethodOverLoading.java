package Day13_MethodOverLoadingWhile;

public class C03_MethodOverLoading {
    public static void main(String[] args) {
        toplama('a','b');//toplama islemini ascii degerlerine gore yapar ve en uyumlu methodu kullanir
        toplama(4.2,2);
    }
    public static void toplama(int a, double b){
        System.out.println("Double ve int sayilarin toplami: " + (a+b));
    }
    public static void toplama(double a, double b){
        System.out.println("Double sayilarin toplami: " + (a+b));
    }
}
