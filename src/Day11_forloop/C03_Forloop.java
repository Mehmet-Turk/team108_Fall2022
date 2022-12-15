package Day11_forloop;

public class C03_Forloop {
    public static void main(String[] args) {
        //input olarak verilen sayinin asal olup olmadigini bul
        int input = 9;
        int top =0;
        for (int i=2;i<input;i++){
            if(input%i==0){
                System.out.println("Sayi " + i +" ile bolunuyor asal degil");
                top++;
                break;//kodu durdurmak icin

            }

        }
        if(top==0) System.out.println("Sayi asal");
    }
}
