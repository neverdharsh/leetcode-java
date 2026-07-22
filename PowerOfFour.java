import java.util.Scanner;

public class PowerOfFour {

    public static boolean isPowerOfFour(int n) {

        if (n <= 0)
            return false;

        while (n > 1) {

            if (n % 4 != 0)
                return false;

            n = n / 4;
        }

        return true;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (isPowerOfFour(n))
            System.out.println(n + " is a power of 4.");
        else
            System.out.println(n + " is not a power of 4.");

        sc.close();
    }
}
