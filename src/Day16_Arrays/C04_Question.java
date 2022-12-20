package Day16_Arrays;

import java.util.Arrays;

public class C04_Question {
    public static void main(String[] args) {
        //verilen String bir arrayde istenen 'a' iceren kelimeleri silip yerine null yazdirin
        String [] str = {"Mehmet", "Ali", "Ayse", "Osman", "Mustafa" };

        for (int i = 0; i < str.length ; i++) {
            if (str[i].contains("a")){

                str[i] = null;
            }

        }
        System.out.println(Arrays.toString(str));

    }
}
