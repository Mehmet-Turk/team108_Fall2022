package Day15_ScopeArrays;

public class C01_Hastane {
    static String hastaneIsmi = "Yildiz Hastanesi";
    static String hastaneAdresi = "Canlaya/Ankara";

    String personelIsmi;
    String personelAdresi;
    String personelTel;
    int gun;
    boolean isteMi;

    //classin icinde methodlarda kullanilacak variable lar class seviyesinde olusturulur
    //bu variable lar icin iki option vardir
    //static (tum objeler icin tek bir deger alir)
    //instance (her obje icin Java tarafindan cogaltilir

    //Java class level variable lar icin default deger atar
    //non primitive == null
    //sayisal primitive icin 0
    //char icin ''
    //boolean icin false

    //static olan methodlardan static olmayan method ve variable lara ulasilamaz
    //static olmayan variable lara objeler uzerunden ulasilir

    //static variable lara tum methodlardan ulasilabilir tum classda
    //static variable degisirse artik tum objeler icin degisir

    public static void main(String[] args) {
        C01_Hastane p1 = new C01_Hastane();
        System.out.println(p1.personelAdresi);//otomatik olarak null atanir default
        System.out.println(p1.personelIsmi);//otomatik olarak null atanir
        System.out.println(p1.gun);
        System.out.println(p1.isteMi);

        p1.personelIsmi = "ALi";
        p1.personelAdresi = "Nederland";
        p1.personelTel = "068479209";

        C01_Hastane p2 = new C01_Hastane();

        System.out.println(hastaneIsmi);
        System.out.println(p1.hastaneIsmi);

        p2.hastaneIsmi = "Java Hastanesi";
        System.out.println(hastaneIsmi);//ayni
        System.out.println(p1.hastaneIsmi);//ayni
        System.out.println(p2.hastaneIsmi);//ayni static oldugu icin
    }

    public static void method1(){
        System.out.println(hastaneAdresi);

    }
    public void method2(){
        System.out.println(hastaneIsmi);
    }
}
