// Write a program to check whether a year is leap year or not

import java.io.*;
import java.util.Scanner;

public class IsLeapYear{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);

        System.out.print("Enter the Number :");
        int year = s.nextInt();

        if(year%4==0 && year%100 != 0 || year%400 == 0){
            System.out.println("Yes,This Year is Leap year");
        }
        else{
            System.out.println("No, This is Not Leap Year");
        }

    }
}