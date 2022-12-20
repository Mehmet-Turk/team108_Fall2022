package Day16_Arrays;

import java.util.Arrays;

public class C12_ArraySort {
    public static void main(String[] args) {
        //verilen bir array i natural ordera gore siralayin yazdirin
        //bu kucukten buyuge siralar
        String[] isimler = {"ali", "Mustafa", "Can", "Ayse"};
        System.out.println(Arrays.toString(isimler));
        Arrays.sort(isimler);//listeyi siralayip kendi icinde kaydeder
        System.out.println(Arrays.toString(isimler));//once buyuk harfler en son kucuk harfler siralar
        int [] arr = {1, 2, 3, 4, 5, -2, -56};
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));//kucukten buyuge siralar
        //eger buyukten kucuge siralamak istersek gecici bir array kullanarak yapabilriz

    }
}
