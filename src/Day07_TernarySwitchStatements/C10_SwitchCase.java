package Day07_TernarySwitchStatements;

public class C10_SwitchCase {
    public static void main(String[] args) {

        //kullanicidan gun numarasi alip haftasonu olup olmadigi
        int no = 5;

        switch (no){
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
                System.out.println("Haftaici");
                break;
            case 6:
            case 7:
                System.out.println("Haftasonu");
                break;
            default:
                System.out.println("Yanlis gun numarasi");
        }
    }
}
