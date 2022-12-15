package day02_variables_scanner;

public class C01_variables01 {
    public static void main(String[] args) {
        Boolean boe = true;//1 bit yer kaplar
        char chr  = 'a'; // herhangi bir karakteri alir sadece bir karakter alir
        byte by = 1; //8 bit -128 ile 217 arasi deger alir
        short sh = 2; // 32.768 ile 32767 arasi deger alir
        int i = 2;// 2.147.483.648 ile 2.147.483.647
        long l = 2;// cok uzun
        long num = 32434234124141241l;//integerin sinirini gecence L of l koymak gerekir
        float num1 = 0.43f;//ondalikli sayi otomatik olarak double kabul eder. f  F koymak gerekir, virgulden sonra 6-7
        //double da virgulden sonra 15
        //double islemde virgulden sonrasi icin yuvarlama vs yapabilir
        double dob = 332;
    }
}
