package Day17_Arrays;

import java.util.Arrays;

public class C01_BinarySearch {
    public static void main(String[] args) {
        int [] arr = {2,3,5,2,1,7,5,9,8};
        System.out.println(Arrays.binarySearch(arr, 3));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[1, 2, 2, 3, 5, 5, 7, 8, 9]
        System.out.println(Arrays.binarySearch(arr, 3));
        System.out.println(Arrays.binarySearch(arr, 6));//6 yok ama eger olsaydi 7inci sirada olacakti  -7 doner
    }
}
