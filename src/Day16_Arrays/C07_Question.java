package Day16_Arrays;

public class C07_Question {
    public static void main(String[] args) {
        //verilen bir Arrayde istenen bir deger olup olmadigini varsa kac defe oldugunu
        //yazdiran method
        int[] arr = {2, 2, 2, 1, 1, 5, 22};
        degerBul(arr, 1);
        degerBul(arr, 8);
    }
    public static void degerBul(int[] arr, int sayi){
        int sayac = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i] == sayi){
                sayac++;
            }

        }
        if( sayac==0) {
            System.out.println("Aranan sayi Arrayde yok");
        }else System.out.println("Aranan sayi Arrayde " + sayac + " kere kullanimistir.");
    }
}
