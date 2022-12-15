package Day08_StringManipulations;

import java.util.Random;

public class C06_LenghtMethod {
    public static void main(String[] args) {
        String str ="Java her gecen gun daha da guzellesiyor";
        //sondan 3 uncu karakteri yazdirin

        System.out.println(str.charAt(str.length()-3));//y
        System.out.println(str.length());


        //Rastgele bir karakter yazdiralim

        Random rnd = new Random();
         int index = rnd.nextInt(str.length());//random sayi uretmek icin kullanilir
        System.out.println(str.charAt(index));
    }
}
