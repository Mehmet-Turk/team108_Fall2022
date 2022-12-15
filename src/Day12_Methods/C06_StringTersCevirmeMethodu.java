package Day12_Methods;

public class C06_StringTersCevirmeMethodu {
    public static void main(String[] args) {
        //aldigi stringi terse ceviren method yaz
        System.out.println(stringTerseCevirme("rivec sreT"));
    }
    public static String stringTerseCevirme(String str){
        String tersStr = "";
        for (int i= str.length()-1;i>=0;i--){
            tersStr+=str.charAt(i);
        }
        return tersStr;
    }
}
