package Day04_IncerementConcanetion;

public class C01_PrePostIncrement {
    public static void main(String[] args) {
        //sayiyi 3 artirin
        int sayi = 1;
        sayi = sayi + 3;
        sayi += 3;
        sayi++;
        System.out.println(sayi);//ayni islemler cikarma carpma ve bolme icin kullanilir


        sayi = 10;
        System.out.println(sayi++);//once yazdirir sonra artirir digerleri icinde ayni -*/
        sayi = 10;
        System.out.println(++sayi);//once artirir sonra yazdirir


    }
}
