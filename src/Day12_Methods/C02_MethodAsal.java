package Day12_Methods;

public class C02_MethodAsal {
    public static void main(String[] args) {
        //verilen bir sayinin asal olup olmadigini true false olarak donduren method
        System.out.println(asalBulma(9));
        boolean asalMi59 = asalBulma(59);
        System.out.println(asalMi59);
    }
    public static boolean asalBulma(int a){
       boolean asalMi= true;
        for (int i = 2; i < a ; i++) {
            if(a%i==0){
                asalMi=false;
                break;
            }
        }
        return asalMi;
    }
}
