package Day09_stringManipulations;

public class C05_indexOf {
    public static void main(String[] args) {
        String str = "Java ile kodlama cok kolay";

        //str cok iceriyormu
        System.out.println(str.contains("cok"));
        //kullanicidan aldigimiz cumle "cok" ile baslayan ilk kelimeyi yazdirin

        System.out.println(str.indexOf('a'));//a' nin indexini bulur
        System.out.println(str.indexOf("J"));// J nin indexini bulur

        System.out.println(str.indexOf("cok"));//string

        System.out.println(str.indexOf("a", 5));//5inci indexten sonraki ilk a nin indexini verir

        // ikinci o nun indexini yazdirin
        int indexO = str.indexOf('o') + 1;
        System.out.println("======");
        System.out.println(str.indexOf('o', indexO));
    }
}
