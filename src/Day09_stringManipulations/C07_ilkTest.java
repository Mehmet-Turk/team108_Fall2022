package Day09_stringManipulations;

public class C07_ilkTest {
    public static void main(String[] args) {
        //gidiln sitede arama sonucunun 50den fazla oldugunu test edin

        String str = "1-48  of 49 results for nutella";

        int indexOf = str.indexOf("of");
        int indexOfResults = str.indexOf("results");


        String sub = str.substring(indexOf+3, indexOfResults-1);
        System.out.println(sub);

        int subInt = Integer.parseInt(sub);
        if(subInt>50) System.out.println("Nutella arama testi basarili");
        else System.out.println("Yeteri kadar nutella bulunamadi");

    }
}
