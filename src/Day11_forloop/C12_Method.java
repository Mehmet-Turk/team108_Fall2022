package Day11_forloop;

public class C12_Method {
    public static int fk(int i){
        int fak=1;
        for (int j = 1; j <=i ; j++) {
            fak *= j;

        }

        return fak;
    }
    public static void main(String[] args) {

        System.out.println(fk(5));
        System.out.println(fk(3));

    }

}
