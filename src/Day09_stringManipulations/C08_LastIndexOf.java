package Day09_stringManipulations;

public class C08_LastIndexOf {
    public static void main(String[] args) {
        String str = "Javayi iyi ogrenmek icin cok calismam lazim cok";
        //ilk a nin indexini bulma
        System.out.println(str.indexOf("a"));
        //son a nin indexi
        System.out.println("====");
        System.out.println(str.lastIndexOf("a"));
        //verilen str da cok kelimesinin kullanimini kontrol edip
        //cok kelimesi kullanilip kullanilmadigini
        //bir kere ya da birden fazla kullanildigini
        //kontrol eden kodu yazdirin

        int firstIndex = str.indexOf("cok");
        int lastIndex = str.lastIndexOf("cok");
        if (!str.contains("cok")) System.out.println("Cok kelimesi kullanilmamis");
        else if (firstIndex == lastIndex) System.out.println("cok kelimesi bir kere kullanilmis");
        else System.out.println("Cok kelimesi birden fazla kullanilmmis");

        System.out.println("====");
        System.out.println(str.lastIndexOf("a", 15));//son inddexi 15 yapar ve sondan basa dogru bakmaya baslar
    }
}
