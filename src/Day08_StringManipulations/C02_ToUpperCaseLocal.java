package Day08_StringManipulations;

import java.util.Locale;

public class C02_ToUpperCaseLocal {
    public static void main(String[] args) {
        String str = "Java CANDIR";
        System.out.println(str.toLowerCase());
        str = str.toLowerCase(Locale.forLanguageTag("Tr"));
        System.out.println(str);
        String str1 = "Sevgi insani hayata baglar";
        str1 = str1.toUpperCase(Locale.forLanguageTag("Tr"));
        System.out.println(str1);
    }
}
