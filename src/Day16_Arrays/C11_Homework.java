package Day16_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class C11_Homework {
    public static void main(String[] args) {
        //kullanicidan isimler alip varolan bir arraye C10 daki methodu kullanarak kullanici eklemeye
        //devam ettikce devam edim
        //kullanici Q ya basinca Arrayin son halini dondurun
        String[] isimler = {"Ali", "Mustafa", "Can", "Ayse"};
        isimler = isimAlma(isimler);
        System.out.println(Arrays.toString(isimler));
    }
    public static String[] isimAlma(String[] array){
        Scanner scan = new Scanner(System.in);
        String eklenecekIsim = null;
        /*while (!eklenecekIsim.equals("Q")){
            System.out.println("Lutfen bir isim giriniz: ");
            eklenecekIsim = scan.next();
            array = C10_NewVariableArray.arrayeElemanEkleme(array, eklenecekIsim);
        }*/
        do {
            System.out.println("Lutfen bir isim giriniz: ");
            eklenecekIsim = scan.next();
            if (eklenecekIsim.equals("Q"))break;
            array = C10_NewVariableArray.arrayeElemanEkleme(array, eklenecekIsim);
        }while (!eklenecekIsim.equals("Q"));
        return array;
    }
}
