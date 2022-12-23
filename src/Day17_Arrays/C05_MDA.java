package Day17_Arrays;

public class C05_MDA {
    public static void main(String[] args) {

        int[][] arr = {{2,3,4}, {3,2,8}, {4,9,0}, {4}};
        MDAToplama(arr);

    }
    public static void MDAToplama(int[][] arr){
        int top = 0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                top+=arr[i][j];

            }

        }
        System.out.println(top);
    }
}
