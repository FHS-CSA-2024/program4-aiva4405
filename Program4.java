//Youre on your own!
//Jk ask for help if you need it (but also look at previous programs!!)

import java.util.Scanner;

public class Program4 {
    public static void main(String[] args) {
        // Declare variables
        int firstNum = 0;
        int secondNum = 0;
        int thirdNum = 0;
        int fourthNum = 0;
        int sum = 0;
        double average = 0.0;
        Scanner scanText = new Scanner(System.in);
        
        // Tell user what to put
        System.out.println("Enter the first number: ");
        
        // Store the input
        firstNum = scanText.nextInt();
        
        System.out.println("Enter the second number: ");
        secondNum = scanText.nextInt();
        System.out.println("Enter the third number: ");
        thirdNum = scanText.nextInt();
        System.out.println("Enter the fourth number: ");
        fourthNum = scanText.nextInt();
        
        // Sum them and store the sum
        sum = firstNum + secondNum + thirdNum + fourthNum;
        
        // Average them and store the average
        average = (double)sum / 4;
        
        // Output the data
        System.out.println("The sum of the four numbers is " + sum);
        System.out.println();
        System.out.println("The average of the four numbers is " + average);
    }
}


//Paste console output below:
/*
Enter the first number: 
475
Enter the second number: 
821
Enter the third number: 
369
Enter the fourth number: 
562
The sum of the four numbers is 2227

The average of the four numbers is 556.75

*/
