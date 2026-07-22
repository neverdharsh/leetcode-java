import java.util.Scanner;

public class ExcelColumnTitle {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter column number: ");
        int columnNumber = sc.nextInt();

        StringBuilder result = new StringBuilder();

        while (columnNumber > 0) {

            columnNumber--;

            result.append((char) ('A' + (columnNumber % 26)));

            columnNumber /= 26;
        }

        System.out.println("Excel Column Title: " + result.reverse().toString());

        sc.close();
    }
}
