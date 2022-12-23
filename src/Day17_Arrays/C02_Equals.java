package Day17_Arrays;

import java.util.Arrays;

public class C02_Equals {
    public static void main(String[] args) {
        int[] arr1 = {2,3,4};
        int[] arr2 = {3,2,4};
        System.out.println(Arrays.equals(arr1, arr2));//indexleride kontrol eder
        Arrays.sort(arr1);//eger sortlarsak indexlerin anlami kalmaz be true doner
        Arrays.sort(arr2);
        System.out.println(Arrays.equals(arr1, arr2));
    }
}
