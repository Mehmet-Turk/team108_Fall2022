package Day10_StringManipulations;

public class C08_forLoop {
    public static void main(String[] args) {
        //birden 1000e kadar olan sayilari yan yana yazdir en son toplamlaridida yazdir
        int top = 0;

        for (int i =1; i<=1000;i++){
            System.out.print(i+ " ");
           //top = top + i;
            top += i;
        }
        System.out.println();
        System.out.println("Toplam: " + top);
    }
}
