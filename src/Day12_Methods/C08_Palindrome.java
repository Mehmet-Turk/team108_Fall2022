package Day12_Methods;

public class C08_Palindrome {
    public static void main(String[] args) {
        //verilen bir stringin palindrome olup olmadigini yazdirin
        //palindrome: normal ve ters yazilimi ayni olan
        String str = "Bu methodlar guzelmis";
        String tersStr = C06_StringTersCevirmeMethodu.stringTerseCevirme(str);
        if (str.equals(tersStr)) System.out.println("Paliondrome");
        else System.out.println("Palindrome degil");
    }
    public static boolean palindrome(String str){
        String tersStr = C06_StringTersCevirmeMethodu.stringTerseCevirme(str);
        if (str.equals(tersStr)) return true;
        else return false;
    }
}
