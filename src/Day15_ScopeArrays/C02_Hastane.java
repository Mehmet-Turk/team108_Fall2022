package Day15_ScopeArrays;

public class C02_Hastane {
    static String hastaneIsmi = "Yildiz Hastanesi";
    static String hastaneAdresi = "Canlaya/Ankara";

    String personelIsmi  = "Personel";
    String personelAdresi = "Adres";
    String personelTel = "Telefon";

    public static void main(String[] args) {
        C02_Hastane p1= new C02_Hastane();

        C02_Hastane p2 = new C02_Hastane();
        p1.personelIsmi = "Hasan";
        p2.personelAdresi = "Altindag";
        p2.hastaneIsmi = "Java Hastanesi";

        System.out.println(p1.personelAdresi);//Adres
        System.out.println(p2.personelTel);//Telefon
        System.out.println(p1.hastaneIsmi);//Java Hastanesi
    }
}
