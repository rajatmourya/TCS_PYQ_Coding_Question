import java.util.Scanner;

public class Q2FindNumberOfSunday {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toLowerCase().substring(0,3);
        int n = sc.nextInt();

        String days[] = {"mon","tue","wed","thu","fri","sat","sun"};
        int i = 0;
        for (i = 0; i < days.length; i++) {
            if (days[i].equals(str)){
                break;
            }
        }
        int remainingDayForSunday = 6-i;
        int ans = 1;
        n = n-remainingDayForSunday;
        if(n > 0){
            ans += n/7;
        }
        System.out.println(ans);
    }
}
