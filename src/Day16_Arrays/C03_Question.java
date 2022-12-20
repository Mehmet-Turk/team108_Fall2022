package Day16_Arrays;

import java.util.Arrays;

public class C03_Question {
    public static void main(String[] args) {
        //verilen bir integer arraydeki tum elementleri bes arttir
        int [] arr = {2, 4, 6, 8};
        for (int i = 0; i < arr.length ; i++) {
            arr[i]+= 5;

        }
        System.out.println(Arrays.toString(arr));
    }
}
