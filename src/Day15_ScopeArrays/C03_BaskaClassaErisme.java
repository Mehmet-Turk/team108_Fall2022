package Day15_ScopeArrays;

public class C03_BaskaClassaErisme {
    public static void main(String[] args) {
        /*
        Java OOP konsept cercevesinde diger classlarin uyelerine objeler uzerinden ulasilabilir

         static olarak isaretlenen uyelere method ve variable classIsmi.staticUye seklinde ulasilabilir

        !!! Java runtime programdir
        basinca calisir calistigi surece yapilan islermleri KALICI olarak tutar
        calisma bittiginde HERSEY YOK OLUR



         */
        System.out.println(C02_Hastane.hastaneIsmi);//Yildiz Hastanesi
        C01_Hastane.method1();


        C01_Hastane per1 = new C01_Hastane();
        System.out.println(per1.personelTel);
        System.out.println(per1.hastaneIsmi);

        per1.personelAdresi ="Istanbul";
        per1.personelIsmi = "Tugba";
        per1.hastaneAdresi = "Ordu";



    }
}
