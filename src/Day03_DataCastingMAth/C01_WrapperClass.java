package Day03_DataCastingMAth;

public class C01_WrapperClass {
    public static void main(String[] args) {
        //wrapper classlar stringten sayiya cevirmek icin kullanilir
        String str = "123";
        String str1 = "456";
        System.out.println(str + str1);
        int strInt = Integer.parseInt(str);
        int str1Int = Integer.parseInt(str1);
        System.out.println(strInt + str1Int);//eger rakam olursa hata verir

        char a = '$';
        System.out.println(Character.isDigit(a));
        System.out.println(Character.isAlphabetic(a));
        System.out.println(Character.isLetter(a));

        //Wrapper classlarda casting olmaz
        short s = 4;
        int i = s;
        //bunu yapmaz
        Short s1 = 5;
        //Integer t = (Integer) s1;
    }
}
