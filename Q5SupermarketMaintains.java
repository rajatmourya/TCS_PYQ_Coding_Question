import java.util.Scanner;

public class Q5SupermarketMaintains {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int price = 1;
        while (n != 0){
            price *= n%10;
            n /= 10;
        }
        System.out.println(price + "-> price");
    }
}
