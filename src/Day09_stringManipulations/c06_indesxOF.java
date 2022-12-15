package Day09_stringManipulations;

import java.util.Scanner;

public class c06_indesxOF {
    public static void main(String[] args) {
        //kullanicidan alinan cumlede "cok" ile baslayan ilk kelimeyi yazdirin
        //eger cok yok ise yok yazdirsin
        Scanner scan = new Scanner(System.in);
        System.out.print("Bir cumle giriniz: ");
        String str = scan.nextLine();
        if (!str.contains("cok")) System.out.println("Cok ile baslayan kelime yok");
        else{
            int indexOfCok = str.indexOf("cok");
            int indexOfBosluk = str.indexOf(" ", indexOfCok + 1);
            System.out.println(str.substring(indexOfCok, indexOfBosluk));
        }

    }
}
