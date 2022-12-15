package Day04_IncerementConcanetion;

public class C02_PrePostIncrement {
    public static void main(String[] args) {
        int a = 10;
        int b = a++;
        int c = ++a;
        System.out.println(a + ", " + b + ", " + c );//12, 10, 12

        int x = 20;
        int y = ++x;
        int z = y++;
        System.out.println(x + ", " + y + ", " + z );//21, 22, 21

        int k = 30;
        System.out.println(k++);//30
        System.out.println(++k);//32
        System.out.println(k++);//32
        System.out.println(k);//33

        int i = 40;
        int s = i++;
        int p = --s;
        int l = --i;
        System.out.println(i + ", " + s + ", " + p + "," + l );//p41,
    }
}
