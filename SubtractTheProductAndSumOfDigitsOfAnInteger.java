import java.util.Scanner;

public class SubtractTheProductAndSumOfDigitsOfAnInteger {

    public static int subtractProductAndSum(int n) {

        int product = 1;
        int sum = 0;

        while (n > 0) {

            int digit = n % 10;

            product = product * digit;
            sum = sum + digit;

            n = n / 10;
        }

        return product - sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.println("Result: " + subtractProductAndSum(n));

        sc.close();
    }
}
