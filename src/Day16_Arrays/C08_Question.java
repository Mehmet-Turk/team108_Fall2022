package Day16_Arrays;

import java.util.Arrays;

public class C08_Question {
    public static void main(String[] args) {
        //verilen arrayde tum elemanlari bir saga kaydirip sondaki elemani da basa tasiyacak bir method
        //arrayi yeni haliyle kaydedin
        //[2,3,4] ==> [4,2,3]
        int[]arr = {1,3,7,0};
        System.out.println(Arrays.toString(arrayKaydirma(arr)));
    }
    public static int[] arrayKaydirma(int [] arr){
        int ilk = arr[arr.length-1];
        for (int i = arr.length-1; i >=1 ; i--) {
            arr[i] = arr[i-1];
        }
        arr[0] = ilk;
        return arr;
    }
}
