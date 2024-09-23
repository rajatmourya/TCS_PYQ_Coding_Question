import java.util.Scanner;

public class Q6InternationalROudTableConference {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int ans = 2*fact(n-1);
        System.out.println(ans);
    }
    public static int fact(int n){
        int ans = 1;
        while (n >= 1){
            ans *= n;
            n--;
        }
        return ans;
    }
}
