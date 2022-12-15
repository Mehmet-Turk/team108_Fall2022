package Day10_StringManipulations;

public class C03_replaceAll {
    public static void main(String[] args) {
        String str = "Ja1va 56Guz,el-dir";
        //fazlaliklardan kurtul
        //bunun icin regex kullanilir

        str = str.replaceAll("\\d", "");
        str = str.replace(" ", "3");
        str = str.replaceAll("\\W", "");//harfler disinda herseyi deigtirmek icin
        str = str.replace("3", " ");
        System.out.println(str);

        //buradaki harf sayisini bulun
        String input = "Ali Can, Merve Yilmaz, Mehmet Turk";
        input = input.replaceAll("\\W", "");
        System.out.println(input);
        int harfSayisi = input.length();
        System.out.println(harfSayisi);

    }
}
