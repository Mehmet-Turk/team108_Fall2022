package Day09_stringManipulations;

public class C03_startsWith {
    public static void main(String[] args) {
        String str = "Java mutluluktur.";
        System.out.println(str.startsWith("Java"));
        System.out.println(str.startsWith("Java mutluluktur."));//hepsini de verebiliriz
        System.out.println(str.startsWith(""));
        System.out.println("=======");

        //
        System.out.println(str.startsWith("m", 5));//5inci index "m" ile mi baslar
        //
    }
}
