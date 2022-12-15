package Day15_ScopeArrays;

public class C04_Arrays {
    public static void main(String[] args) {
        int [] arr = {1, 1};//bu sekilde olursa data kadar lenght olur
        int arr2 [] = {3, 5};

        String [] harfler = new String[7];//lenght i deklare etmek gerekir
        harfler[0] = "ALi";
        System.out.println(arr.length);//burada ki length bir method degil variabledir
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(arr2[i]);
        }
        for (int i = 0; i <arr.length ; i++) {
            System.out.println(harfler[i]);
        }



    }
}
