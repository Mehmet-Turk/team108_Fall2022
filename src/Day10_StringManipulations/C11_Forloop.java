package Day10_StringManipulations;

public class C11_Forloop {
    public static void main(String[] args) {
        //verilen sayinin faktoriyeli bul
        int input = 5;
        int carpim = 1;
        for(int i =1;i<=input;i++){
            carpim *= i;
        }
        System.out.println("Faktoriyel: " + carpim);

    }
}
