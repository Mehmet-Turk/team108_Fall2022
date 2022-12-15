package Day11_forloop;

public class C02_Forloops {
    public static void main(String[] args) {
        //input olarak verilen String degerin
        //indexi tek olanlari kucuk
        //indexi cift olanlari buyuk yazdir
        String str = "Java candir, Selenium heyecandir";
        for(int i=0;i<str.length();i++){
            System.out.print(i%2==0
                                    ? str.substring(i,i+1).toUpperCase()
                                    :str.substring(i,i+1).toLowerCase());
        }
    }
}
