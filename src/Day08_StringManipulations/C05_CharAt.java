package Day08_StringManipulations;

public class C05_CharAt {
    public static void main(String[] args) {
        String str = "Java guzeldir";//java da index 0 dan baslar 13 karakter var

        System.out.println(str.charAt(1));//a yi yazdirir
        System.out.println(str.charAt(13-2));//sondan ikinci
        System.out.println(str.toUpperCase().charAt(13-4));//charAt le beraber kullanmak icin method once kullanilir
       //System.out.println(str.charAt(13));//.StringIndexOutOfBoundsException hatasi verir indexten dolayi
        System.out.println(str.length());
    }
}
