package Day13_MethodOverLoadingWhile;

public class C04_WhileLoop {
    public static void main(String[] args) {
        //iki basamakli sayilardan 7ile bolunebilenleri yazdirin
        int a = 10;
        while (a<100){
            if((a%7)==0)System.out.print(a + " ");
            a++;
        }
    }
}
