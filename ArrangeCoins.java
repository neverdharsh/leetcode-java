import java.util.Scanner;

public class ArrangeCoins {
    public static void main (String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of coins: ");
        int n = sc.nextInt();

        int row = 1;
        int count = 0;

        while (n >= row) {
            n -= row;
            count++;
            row++;
        }

        System.out.println("Complete rows: " + count);

        sc.close();
    }
}
