package Day10_StringManipulations;

public class C04_replaceFirst {
    public static void main(String[] args) {
        String str = "Java heyecandir";
        //eger tum a lari degilde sadece ilk a yi degistirmek istersek

        System.out.println(str.replaceFirst("a", "A"));
        //ilk harf veya rakami & ile degistirin
        System.out.println(str.replaceFirst("\\w", "&"));
    }
}
