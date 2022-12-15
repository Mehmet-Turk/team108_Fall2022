package Day07_TernarySwitchStatements;

public class C11_SwitchCaseExmp {
    public static void main(String[] args) {
        char harf = 'p';
        switch (harf){
            case 'I':
            case 'i':
                System.out.println("International");
                break;
            case 'S':
            case 's':
                System.out.println("Software");
                break;
            case 'T':
            case 't':
                System.out.println("Testing");
                break;
            case 'Q':
            case 'q':
                System.out.println("International");
                break;
            case 'B':
            case 'b':
                System.out.println("Board");
                break;
            default:
                System.out.println("Hatali giris");
        }
    }
}
