//This program calculates total profit and total money saved based on the user's monthly savings percentage.

import java.util.Scanner;

public class HW1Pro3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //Create a new scanner object.

        /* This block to gets input from the user. */
        System.out.print("Enter your monthly salary, for example 3500: ");
        double salary = input.nextDouble();
        System.out.print("Enter the percent of your salary to save, for example 10%: ");
        double savePercentage = input.nextDouble();
        System.out.print("Enter the monthly interest rate, for example 8.25%: ");
        double monthlyInterestRate = input.nextDouble();
        System.out.print("Enter the monthly government support rate, for example 25%: ");
        double monthlySupportRate = input.nextDouble();

        /* This block calculates the values for each month*/
        double monthlySave = ((salary * savePercentage / 100.0) * 100) / 100.0;
        double firstMonth = ((int)(monthlySave * (1 + (monthlySupportRate)/100.0)) * (1 + monthlyInterestRate / 100.0) * 100 / 100.0);
        double secondMonth = ((int)((firstMonth + monthlySave * (1 + (monthlySupportRate)/100.0)) * (1 + monthlyInterestRate / 100 ) * 100 ) / 100.0);
        double thirdMonth = ((int)((secondMonth + monthlySave * (1 + (monthlySupportRate)/100.0)) * (1 + monthlyInterestRate / 100 ) * 100 ) / 100.0);
        double fourthMonth = ((int)((thirdMonth + monthlySave * (1 + (monthlySupportRate)/100.0)) * (1 + monthlyInterestRate / 100 ) * 100 ) / 100.0);
        double fifthMonth = ((int)((fourthMonth + monthlySave * (1 + (monthlySupportRate)/100.0)) * (1 + monthlyInterestRate / 100 ) * 100 ) / 100.0);
        double sixthMonth = ((int)((fifthMonth + monthlySave * (1 + (monthlySupportRate)/100.0)) * (1 + monthlyInterestRate  / 100 ) * 100 ) / 100.0);

        /* This block prints the values for each month */
        System.out.println("After the first month, the account value is " + firstMonth + " TLs.");
        System.out.println("After the second month, the account value is " + secondMonth + " TLs.");
        System.out.println("After the third month, the account value is " + thirdMonth + " TLs.");
        System.out.println("After the fourth month, the account value is " + fourthMonth + " TLs.");
        System.out.println("After the fifth month, the account value is " + fifthMonth + " TLs.");
        System.out.println("After the sixth month, the account value is " + sixthMonth + " TLs.");

        System.out.println("In total, you saved " + (monthlySave * 6) + " TLs and your total profit is " + ((int)((sixthMonth - monthlySave * 6) * 100) / 100.0) + " TLs");
    }
}
