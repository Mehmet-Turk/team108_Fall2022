package Day16_Arrays;

import java.util.Arrays;

public class C01_Arrays {
    public static void main(String[] args) {
        String [] str = new String[5];
        int [] arr = {1, 2, 3, 4, 5};
        System.out.println(arr[3]);
        System.out.println(str[3]);

        arr[2] = 10;
        System.out.println(arr);//referansini yazdirir eger tmamaini yazdirmak icin ARRAYS class kullanilir
        System.out.println(Arrays.toString(arr));
     }
}
