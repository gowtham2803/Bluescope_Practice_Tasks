//  Write a program to find maximum between three numbers

import java.io.*;
import java.util.Scanner;

public class FindMaximum3{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);

        System.out.print("Enter the 1st Number :");
        int num1 = s.nextInt();
        System.out.print("Enter the 2nd Number :");
        int num2 = s.nextInt();
        System.out.print("Enter the 3rd Number :");
        int num3 = s.nextInt();

        if(num1>num2 && num1>num3){
            System.out.println("The Biggest Number is :"+num1);
        }
        else if(num2>num1 && num2>num3){
            System.out.println("The Biggest Number is :"+num2);
        }
        else{
            System.out.println("The biggest Number is :"+num3);
        }

    }
}
