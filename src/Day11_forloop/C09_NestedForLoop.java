package Day11_forloop;

public class C09_NestedForLoop {
    public static void main(String[] args) {
        int kisaKenar=5;
        int uzunKenar =8;
        for (int i =1;i<=kisaKenar;i++){//kac sutun olacagini outer loop belirler
            for (int j=1;j<=uzunKenar;j++){//satiri inner loop beliler
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
