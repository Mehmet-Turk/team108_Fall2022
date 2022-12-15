package Day10_StringManipulations;

public class C01_NullPointer {
    public static void main(String[] args) {
        String str1 = "";
        String str2 = "    ";
        String str3;
        String str4 = null;//degeri null degildir isareti null dir
        System.out.println(str1.length());
        System.out.println(str2.length());

        System.out.println("==========");
        System.out.println(str1.isEmpty());//true
        System.out.println(str2.isEmpty());//false
        System.out.println("==========");
        System.out.println(str1.isBlank());//true
        System.out.println(str2.isBlank());//true

        //null bir deger degil isaretcidir
        //null pointer: non primitive bir objenin olusturuldugunu ancak deger atanmamistir

        //initialize edilmemis bir variable kullanilamaz calistirmaz
        //System.out.println(str3.length());
        //System.out.println(str3.concat("ali"));

        // ama eger null atarsak initialize edilmis ama degeri olmadigi icin kullanilabilir ama uygun olmasi haline
        //System.out.println(str4.length());//nullPointerException
        System.out.println(str4);//null yazdirir
        //System.out.println(str4.concat("ali"));//NullPointerException
        System.out.println(str4 + "Ali");

    }
}
