package Day17_Arrays;

public class C06_MDA {
    public static void main(String[] args) {
        //verilen iki katli arrayin tum elementlerini yazdiran method
        String [][] arr = {{"Ali", "Veli"}, {"Ahmet", "Mustafa"}, {"Murat", "Hasan"}};
        String aranan = "a";
        arananElementleriYazdirma(arr, aranan);
    }
    public static void arananElementleriYazdirma(String[][] arr, String str){
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
                if(arr[i][j].contains(str)){
                    System.out.print(arr[i][j] + " ");

            }

        }
    }
}}
