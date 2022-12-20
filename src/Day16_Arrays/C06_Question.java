package Day16_Arrays;

public class C06_Question {
    public static void main(String[] args) {
        //bir marketin fiyatlarini tutan bir array var
        // bu fiyatlarin en yuksek ve en dusugunu yazdiran method
        double[] fiyat = {23, 343.4, 12.3, 44.4, 33.2, 98.1};
        enyuksekVeEndusukFiyatBulma(fiyat);

    }
    public static void enyuksekVeEndusukFiyatBulma(double[] db){
        double enBuyuk =db[0];
        double enKucuk =db [0];
        for (int i = 0; i <db.length ; i++) {
            if (db[i]>enBuyuk){
                    enBuyuk = db[i];
                }
            if (db[i]<enKucuk){
                    enKucuk = db[i];
                }

            }


        System.out.println("En yuksek fiyat= " + enBuyuk);
        System.out.println("En yuksek fiyat= " + enKucuk);
    }
}
