package Day03_DataCastingMAth;

public class C01_DataCasting {
    public static void main(String[] args) {
        //explicit narrowing
        //Java kucuk data tipini buyuk data tipine oto cevirir ama buyuk data tipini kucuk yaparken parantez icinde
        //data turunu yazmak gerekir
        double dbl = 23.8;
        /*int i = dbl;*/ //bunu otomatik yapmaz
        int i = (int)dbl;//

        byte byt = (byte) i;
        System.out.println(i);// virgulden sonrasini yazmaz
        System.out.println(byt);
        i = 130;
        byt = (byte)i;
        System.out.println("130 un byte hali: " + byt);//byte max 127 oldugu icin eksiden devam eder -126
    }
}
