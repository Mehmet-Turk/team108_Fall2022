package Day16_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        //verilen bir string bir arrayin tum elementlerini yazdirin
        String [] str = {"Mehmet", "Ali", "Ayse", "Osman" };
        System.out.println(Arrays.toString(str));
        for (int i = 0; i <str.length ; i++) {
            System.out.print(str[i] + " ");
        }
        System.out.println();
    }
}
