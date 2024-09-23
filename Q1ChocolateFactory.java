import java.util.Arrays;
import java.util.Scanner;

public class Q1ChocolateFactory {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] a = new int[n];
//        for (int i = 0; i < n; i++) {
//            a[i] = sc.nextInt();
//        }
        int n =8;
        int[] a = {4,5,0,1,9,0,5,0};
        int ans[] = Q1ChocolateFactoryHelper(n,a);
        Print.printArrays(n,a);
        Print.printArrays(n,ans);
    }
    public static int[] Q1ChocolateFactoryHelper(int n, int[] a){
        int[] ans = new int[n];
        Arrays.fill(ans,0);
        int j = 0;
        for (int i = 0; i < n; i++) {
            if(a[i] != 0){
                ans[j] = a[i];
                j++;
            }
        }
        return ans;
    }
}
