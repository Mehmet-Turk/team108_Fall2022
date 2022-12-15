package Day10_StringManipulations;

public class C02_replace {
    public static void main(String[] args) {
        String str =  "Java ogren adana ye";
        System.out.println(str.replace('J', 'j'));
        System.out.println(str);
        System.out.println(str.replace("a", "A"));
        System.out.println(str.replace("Java", "Yazilim"));

        //asagida 10 binden sonuc oldugunu bulun

        String sonuc ="1-16 of over 100,000 results for apple";
        int indexOfOver = sonuc.indexOf("over");
        int indexOfResults = sonuc.indexOf("results");
        String adet = sonuc.substring(indexOfOver + 5, indexOfResults -1);
        System.out.println(adet);
        adet = adet.replace(",", "");
        int adetInt = Integer.parseInt(adet);
        if (adetInt>10000) System.out.println("10 binden fazla sonuc var");
        else System.out.println("10binden az sonuc var");
    }
}
