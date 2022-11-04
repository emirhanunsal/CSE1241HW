//This program allows you to find out how many gross, dozen and extra eggs you have.

import java.util.Scanner; //It must be imported to get input from the user.

public class HW1Pro2 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in); //Create a scanner object.
        System.out.print("Please enter your total number of eggs: ");
        int totalEggs = input.nextInt(); //Declare the next input value as an int.

        int grossEggs = totalEggs / 144; //Gross number.
        int grossExtras = totalEggs % 144; //Number of the extra eggs from the gross.
        int dozenEggs = grossExtras / 12; //Dozen number.
        int dozenExtras = grossExtras % 12; // Number of the extra eggs from the dozen.

        System.out.println("Your number of eggs is " + grossEggs + " gross, " + dozenEggs + " dozen and " + dozenExtras + ".");
    }
}
