package Day03_DataCastingMAth;

import java.util.Scanner;

public class C03_CharDataCasting {
    public static void main(String[] args) {
        //Char data turunde iki degeri matematik isleme tabi tutarsan Java onun ascii degerini toplar
        System.out.println('a' + 'b'); //195

        // kullanicidan bir char alip onun ascii tabledan 3 sonrasindaki uc karakteri yazdir
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz: ");
        char chr = scan.next().charAt(0);//girilen ilk karakteri alir
        System.out.println("Girilen karakterin sonrasi: " + (char) (chr + 1) + ", " +
                                                            (char) (chr + 2) + ", " +
                                                            (char) (chr + 3));
    }
}
