package Day10_StringManipulations;

public class C10_Forloops {
    public static void main(String[] args) {
        //input olarak verilen baslangic sayisindan baslayip
        //7er arttirarak bitis sayisina kadar yazdir
        //kac tane oldugunu ve toplamlarini
        int a = 34;
        int b = 563;
        int count=0;
        int top = 0;
        for(int i = a; i<=563;i+=7){
            System.out.print(i+ " ");
            count++;
            top += i;
        }
        System.out.println();
        System.out.println(count + " adet sayi var \ntoplamlari: " + top);
    }
}
