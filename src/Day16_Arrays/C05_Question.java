package Day16_Arrays;

public class C05_Question {
    public static void main(String[] args) {
        //verilen bir arraydeki pozitif sayilari toplayip sonucu bize donen bir method yaz
        int [] arr = {1, 2, 3, 4, 5, -2, -56};
        System.out.println(arrayToplama(arr));
    }
    public static int arrayToplama(int [] arr){
        int toplam = 0;
        for (int i = 0; i <arr.length ; i++) {
            if(arr[i]>0){
                toplam +=arr[i];
            }
        }
        return toplam;
    }
}
