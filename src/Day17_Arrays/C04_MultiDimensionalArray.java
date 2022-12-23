package Day17_Arrays;

import java.util.Arrays;

public class C04_MultiDimensionalArray {
    public static void main(String[] args) {
        int[][] arr = {{2,3,4}, {3,2,8}, {4,9,0}, {4}};
        System.out.println(arr.length);
        System.out.println(arr[0].length);

        System.out.println(Arrays.toString(arr[0]));//array oldugu icin Arrays kullanmak lazim

        System.out.println(arr[3][0]);//4 element oldugu icin

        System.out.println(Arrays.toString(arr));//bu referanslari yazar
        System.out.println(Arrays.deepToString(arr));//deep oldugu icin hepsini normal yazar

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                System.out.print(arr[i][j] + " ");

            }

        }
    }
}
