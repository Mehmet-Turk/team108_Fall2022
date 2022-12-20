package Day16_Arrays;

import java.util.Arrays;

public class C10_NewVariableArray {
    public static void main(String[] args) {
        //verilen bir array e bir elaman ekleyip donen method
        String[] isimler = {"Ali", "Mustafa", "Can", "Ayse"};
        String eklenecekIsim = "Kemal";
        isimler = arrayeElemanEkleme(isimler, eklenecekIsim);
        System.out.println(Arrays.toString(isimler));

    }
    public static String[] arrayeElemanEkleme(String [] arr, String eklenicekEleman){
        String [] temp = new String[arr.length+1];
        for (int i = 0; i < arr.length ; i++) {
            temp[i] = arr[i];
        }
        temp[temp.length-1] = eklenicekEleman;
        return temp;
    }

}
