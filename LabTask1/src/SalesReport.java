import java.util.Scanner;

public class SalesReport {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 3; i++) {
            System.out.println("Region " + i);

            for (int j = 1; j <= 5; j++) {
                System.out.print("Enter sales for Representative " + j + ": ");
                int sales = sc.nextInt();

                int stars = sales / 10;

                System.out.print("Representative " + j + ": ");
                for (int a = 1; a <= stars; a++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            System.out.println();
        }
    }
}
