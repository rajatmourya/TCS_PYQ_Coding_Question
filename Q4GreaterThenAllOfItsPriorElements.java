import javax.swing.plaf.synth.SynthTextAreaUI;
import java.util.Scanner;

public class Q4GreaterThenAllOfItsPriorElements {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int ans = 0;
        int maxElement = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if(maxElement < a[i]){
                maxElement = a[i];
                ans += 1;
            }
        }
        System.out.println(ans);
    }
}
