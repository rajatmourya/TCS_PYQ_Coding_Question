import java.util.Scanner;

public class Q3AirportSecurity {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        int countZero = 0;
        int countOne = 0;
        int countTwo = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] == 0){
                countZero += 1;
            } else if (arr[i] == 1) {
                countOne += 1;
            } else if (arr[i] == 2) {
                countTwo += 1;
            }
        }
        int i = 0;
        int[] ans = new int[n];
        while (countZero > 0){
            ans[i] = 0;
            i++;
            countZero--;
        }

        while (countOne > 0){
            ans[i] = 1;
            i++;
            countOne--;
        }

        while (countTwo > 0){
            ans[i] = 2;
            i++;
            countTwo--;
        }

        for(int e:ans){
            System.out.print(e +" ");
        }
    }
}
