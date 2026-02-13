// Write a program to enter the numbers till the user wants and at the end it should display the count of positive, negative and zeros entered.

import java.util.Scanner;
public class CountNumbers{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);

        System.out.print("How many times you want to enter :");
        int count = s.nextInt();

        int pn = 0;
        int nn = 0;
        int zeros = 0;

        for(int i=1; i<=count; i++){
            System.out.println("Enter the number :");
            int num = s.nextInt();

            if(num>0){
                pn = pn + 1;
            }
            else if(num<0){
                nn = nn + 1;
            }
            else if(num == 0){
                zeros += 1;
            }
            else{
                System.out.println("Enter the Valid input!");
            }
        }
        System.out.println("Total Positive Numbers :"+pn);
        System.out.println("Total Negative Numbers :"+nn);
        System.out.println("Total Zero Numbers :"+zeros);

    }
}

