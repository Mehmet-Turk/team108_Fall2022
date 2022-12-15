package Day11_forloop;

public class C06_forloopInterviewQ {
    public static void main(String[] args) {
        //Stringi terse cevirme
        String str = "rivec sret unuB";
        String newStr ="";
        for (int i=str.length()-1;i>=0;i--){
            newStr = newStr + str.charAt(i);
            System.out.print(str.charAt(i));
        }
        System.out.println();
        System.out.println(newStr.toUpperCase());
    }
}
