package Day09_stringManipulations;

public class C01_concatenation {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 ="candir";
        System.out.println(str1 + " " + str2);
        String str3 = str1.concat(" ").concat(str2);
        System.out.println(str3);

    }
}
