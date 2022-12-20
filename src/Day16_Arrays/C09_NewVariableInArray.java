package Day16_Arrays;

import java.util.Arrays;

public class C09_NewVariableInArray {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3};
        //arr1 ={3,4,5};
        //arr1 = new int[5];//Java artik arr1 in eski degerlerini degil yenisini point eder
        System.out.println(Arrays.toString(arr1));
        //eger eski degerleri korumak istersek baska bir arrayde tutabiliriz
        int [] temp = new int[arr1.length];
        for (int i = 0; i <arr1.length ; i++) {
            temp[i] = arr1[i];
        }
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(temp));
    }
}
