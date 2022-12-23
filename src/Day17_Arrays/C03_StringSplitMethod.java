package Day17_Arrays;

import java.util.Arrays;

public class C03_StringSplitMethod {
    public static void main(String[] args) {
        String str ="Java her gecen gun guzellesiyor";
        String[] arr = str.split(" ");//verilen stringe gore stringi boler verilen stringi yok eder ve array olarak doner
        System.out.println(Arrays.toString(arr));

        System.out.println(Arrays.toString(str.split("")));//tum elementleri boler

    }
}
