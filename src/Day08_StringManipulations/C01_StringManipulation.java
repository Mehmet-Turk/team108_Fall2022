package Day08_StringManipulations;

import java.util.Scanner;

public class C01_StringManipulation {
    public static void main(String[] args) {
        //kullanicidan bir gun ismi al
        //gun eger haftaici ise "Bugun calisma gunu tatile daha ... gun var
        //girilen gun haftasonu ise "Simdi dinlenme zamani"
        Scanner scan = new Scanner(System.in);
        System.out.println("Bir gun girin: ");
        String day = scan.next();
        String dayLower = day.toLowerCase();
        switch (dayLower){
            case "pazartesi":
                System.out.println("Girilen Pazartesi tatile 5 gun var");
                break;
            case "dinsdag":
                System.out.println("Girilen SALI tatile 4 gun var");
                break;
            case "carsamba":
                System.out.println("Girilen CARSAMBA tatile 3 gun var");
                break;
            case "persembe":
                System.out.println("Girilen PERSEMBE tatile 2 gun var");
                break;
            case "cuma":
                System.out.println("Girilen CUMA tatile 1 gun var");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("Girilen gun HAFTASONU IYI TATILLER");
                break;
            default:
                System.out.println("yanlis bilgi girisi");
        }

    }
}
