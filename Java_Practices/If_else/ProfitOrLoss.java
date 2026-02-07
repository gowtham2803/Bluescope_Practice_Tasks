//  Write a program to calculate profit or loss

import java.util.Scanner;
public class ProfitOrLoss{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);

        System.out.print("Enter the Cost Price :");
        int cp = s.nextInt();
        System.out.print("Enter the Sales price :");
        int sp = s.nextInt();

        int profit,lose;

        if(sp>cp){
            profit = sp - cp;
            System.out.println("Profit is :"+profit);
        }
        else if (sp<cp){
            lose = sp - cp;
            System.out.println("lose is :"+lose);
        }
        else{
            System.out.println("Enter valid price");
        }

    }
}
