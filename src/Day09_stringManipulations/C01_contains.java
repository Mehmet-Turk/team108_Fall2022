package Day09_stringManipulations;

public class C01_contains {
    public static void main(String[] args) {
        String str = "Java ogren, mutlu ol";
        System.out.println(str.contains("mutlu"));

        //char squence
        System.out.println(str.contains("j"));//sadece var mi yok mu diye kontrol eder kac tane var bilmez
        System.out.println(str.contains(""));
    }
}
