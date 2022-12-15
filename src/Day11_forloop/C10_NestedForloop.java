package Day11_forloop;

public class C10_NestedForloop {
    public static void main(String[] args) {
        /*
        1
        1 2
        1 2 3
        1 2 3 4
         */
        for (int i = 1; i <=4 ; i++) {//kac satir olacagi
            for (int j = 1; j <=i ; j++) {//sutunlarda ne yazilacagi
                System.out.print(j + " ");

            }
            System.out.println();
        }
    }
}
