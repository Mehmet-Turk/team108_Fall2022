package Day16_Arrays;

import java.util.Arrays;

public class C13_BinarySearch {
    public static void main(String[] args) {
        //binary tree javanin kullandigi ozel bir siralama yontemidir
        //binarysearch methodu binary tree ozelligini kullandigi icin siralama yapmadan kullanmak yanlis
        //sonuc doner. dolayisiyla once sort yapmak gerekir
        int[] arr = {3,4,2,6,89,1,90};
        System.out.println(Arrays.binarySearch(arr, 1));


        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//[1, 2, 3, 4, 6, 89, 90]
        System.out.println(Arrays.binarySearch(arr, 3));//aranan elemanin indexini doner
        System.out.println(Arrays.binarySearch(arr, 0));//eger bulamazsa eger olsaydi kacinci sirada olacaksa
        //onun eksi halini doner -4 -6 gibi doner
        System.out.println(Arrays.binarySearch(arr, 5));//-
    }
}
