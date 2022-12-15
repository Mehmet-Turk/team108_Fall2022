package Day14_DoWhileLoop;

public class C03_DoWhile {
    public static void main(String[] args) {
        //verilern karakterler dahil arasindaki karakterleri yazidir
        char bas = 'f';
        char bit =  'm';
        do {
            System.out.print(bas + " ");
            bas = (char) (bas + 1);

        }while (bas<=bit);
    }
}
