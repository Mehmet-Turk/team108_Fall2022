package Day11_forloop;

public class C08_NestedForLoop {
    public static void main(String[] args) {
        //carpim tablosu
        int sayi=4;
        for (int i=1;i<=sayi;i++){
            for (int a=1;a<=4;a++){
                System.out.print(a*i + " ");
            }
            System.out.println();
        }
    }
}
