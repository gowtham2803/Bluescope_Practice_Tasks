//  Write a program to display the day name for a given number (1-7).

import java.util.Scanner;
public class DisplayTheDay{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);

        System.out.print("Enter the Number of weekday :");
        int num=s.nextInt();

        switch (num) {

            case 1 : System.out.println("Sunday"); break;
            case 2 : System.out.println("Monday"); break;
            case 3 : System.out.println("Tuesday"); break;
            case 4 : System.out.println("Wednesday"); break;
            case 5 : System.out.println("Thursday"); break;
            case 6 : System.out.println("Friday"); break;
            case 7 : System.out.println("Saturday"); break;
            default : System.out.println("Enter below 7 Bcoz only 7 days i a week");
        }

    }
}