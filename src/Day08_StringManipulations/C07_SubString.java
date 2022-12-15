package Day08_StringManipulations;

public class C07_SubString {
    public static void main(String[] args) {
        String str = "Java ogren, isi kap";

        System.out.println(str.length());//karakter sayisi
        //metnin tam ortasindaki karakter nedir

        System.out.println(str.charAt(str.length()/2));//n
        //son karakteri yazdirin
        System.out.println(str.charAt(str.length()-1));//p

        //charAt medthodu sadece bir karakteri almak icin kullanilir eger metnin bir parcasini almak istersek
        //subString methodunu kullaniriz subString methodu String bir deger doner

        //"ogren" kelimesini yazdirin
        //subString methodunda ilk index dahil son index harictir
        System.out.println(str.substring(5, 10));//ogren

        //java' yi yazdir
        System.out.println(str.substring(0, 4));//Java
         //kap yazdir
        System.out.println(str.substring(str.length()-3));//eger tek index verirsek o indexten baslar sona ka
        //kadar yazdirir
        System.out.println(str.substring(16,19));
        //J harfini yadir
        System.out.println(str.substring(0,1));
        //9. index buyuk harf yazdir
        System.out.println(str.substring(9,10).toUpperCase());

        System.out.println(str.substring(5,5));//hicbirsey yazdirmaz
        System.out.println("======");

        //System.out.println(str.substring(4,3));//IndexOutOfBoundEx vrerir
        System.out.println(str.substring(str.length()));//hicbirsey yazdirmaz
    }
}
