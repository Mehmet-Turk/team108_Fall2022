package Day08_StringManipulations;

public class C03_EqualsMethod {
    public static void main(String[] args) {
        String str = "Java";
        String str1 = "Java";
        String str2 = new String("Java");
        String str3 = "Ja";
        String str4 = str3.concat("va");

        System.out.println(str == str2);//ffalse
        System.out.println(str == str1);//true
        //String degerler icin == her zaman dogru sonuc vermeebilir
        //cunku metnin hem degerini hem de referansini karsilastirir.
        //eger sadece String deger karsilastimasi yapilacaksa .equals methodu kullaniliri
        System.out.println();
        System.out.println(str.equals(str4));
        System.out.println(str1.equals(str2));
    }
}
