//  Write a program to find the value of one number raised to the power of another.

import java.util.Scanner;
public class PowerNummber{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);

        System.out.print("Enter the Base Number :");
        int base = s.nextInt();
        System.out.print("Enter the Power Number :");
        int power = s.nextInt();

        int result = 1;
        int i = 1;
        while(i<=power){
            result = result*base;
            i++;
        }
        System.out.println("The "+base+" power Value is "+result);

    }
}