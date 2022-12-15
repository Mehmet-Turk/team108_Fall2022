package Day08_StringManipulations;

public class C04_EqualsIgnoreCase {
    public static void main(String[] args) {
        String str1 = "Pazar";
        String str2 = "PAZAR";
        String str3 = "pazar";
        String str4 = "paZaR";
        System.out.println(str1 == str2);
        System.out.println(str2 == str4);
        //java key sensitivedir eger buyuk kucuk onemsiz ise equalsignirecase kullanilir
        System.out.println(str1.equalsIgnoreCase(str2));
        System.out.println(str3.equalsIgnoreCase(str4));
    }
}
