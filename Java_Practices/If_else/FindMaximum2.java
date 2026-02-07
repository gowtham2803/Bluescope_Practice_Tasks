//  Write a program to find maximum between two numbers

import java.io.*;
import java.util.Scanner;

public class FindMaximum2{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the 1st Number");
        int num1 = s.nextInt();

        System.out.println("Enter the 2nd Number");
        int num2 = s.nextInt();

        if(num1>num2){
            System.out.println("The Biggest number is  :"+num1);
        }
        else{
            System.out.println("The Biggest number is  :"+num2);
        }

    }
}