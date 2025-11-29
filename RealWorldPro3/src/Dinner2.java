import javax.xml.transform.Source;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Dinner2 {
    public static void main(String[] arrgs){
        Scanner scanner = new Scanner(System.in);


        //Input starts from here
        System.out.println("Enter Bill Amount: ");
        double billAmount = scanner.nextDouble();

        System.out.println("Total Number of Fiends: ");
        int totalFriends = scanner.nextInt();

        System.out.println("Tax Percentage: ");
        double taxPercentage = scanner.nextDouble();

        System.out.println("Tip Percentage: ");
        double tipPercentage = scanner.nextDouble();

        // Calculation
        double taxAmount = (billAmount * taxPercentage) / 100;
        double tipAmount = (billAmount * tipPercentage) / 100;
        double grandTotal = billAmount + taxPercentage + tipPercentage;
        double perPersonShare = grandTotal / totalFriends;
        perPersonShare = Math.ceil(grandTotal / totalFriends);
        grandTotal = Math.floor(grandTotal);

        //Unnecessary stuff

        double funFact = Math.sqrt(totalFriends);
        double billPower = Math.pow(perPersonShare, 2);

        System.out.println("---Bill Details---");
        System.out.println("Total Bill Amount: " + billAmount);
        System.out.println("Total Number of Friends: " + totalFriends);
        System.out.println("Tax Amount: " + taxPercentage);
        System.out.println("Tip Amount: " + tipPercentage);
        System.out.println("Grand Total (Rounded down) " + grandTotal);
        System.out.println("Per Person Share (rounded up) " + perPersonShare);
        System.out.println("   Fun Fact   ");
        System.out.println("Fun Factor (Square root of Friends) " + funFact);
        System.out.println("Bill Power (Share^2) " + billPower);




    }
}
