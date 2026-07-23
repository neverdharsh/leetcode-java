import java.util.Scanner;

public class ValidPerfectSquare {

    public static boolean isPerfectSquare(int num) {

        if (num < 1)
            return false;

        int i = 1;

        while ((long) i * i <= num) {
            if ((long) i * i == num)
                return true;
            i++;
        }

        return false;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        if (isPerfectSquare(num))
            System.out.println("True");
        else
            System.out.println("False");

        sc.close();
    }
}
