import java.util.Scanner;

public class Dinner {
    public static void main(String[] args){

        double bill = 10000;
        double totalFriends = 9;
        double taxPercentage = 5;
        double tipPercentage = 2.5;
        // Calculation
        double taxAmount = (bill * taxPercentage ) / 100;
        double tipAmount = (bill * tipPercentage) / 100;
        double grandTotal = bill + taxAmount + tipAmount;
        double perPersonShare = grandTotal / totalFriends;
        perPersonShare = Math.ceil(grandTotal / totalFriends);
        grandTotal = Math.floor(grandTotal);
        double funFactor = Math.sqrt(totalFriends);
        double billPower = Math.pow(perPersonShare, 2);

        //output
        System.out.println("---Bill Details---");
        System.out.println(totalFriends);
        System.out.println("Tax Amount: " + taxPercentage);
        System.out.println("Tip Amount: " + tipPercentage);
        System.out.println("Grand Total(Rounded down) " + grandTotal);
        System.out.println("Per Person Share (Rounded up) " + perPersonShare);
        System.out.println("Fun Factor (Square of Friends) " + funFactor);
        System.out.println("Bill Power (Share^2) " + billPower);


    }
}
