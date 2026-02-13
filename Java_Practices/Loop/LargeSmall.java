// 21. Write a program to enter the numbers till the user wants and at the end the program should display the largest and smallest numbers entered

import java.util.Scanner;
public class LargeSmall{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);

        System.out.print("How many inputs you want ? :");
        int count = s.nextInt();
        int small = 0;
        int large = 0;

        for(int i=1;i<=count;i++){
            System.out.print("Enter the number : ");
            System.out.print(" ");
            int num=s.nextInt();
            if(num!=0){
                if(small>num){
                    small = num;
                }
                else{
                    large = num;
                }
            }

        }
    }
