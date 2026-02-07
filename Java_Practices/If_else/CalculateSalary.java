//  Write a program to input basic salary of an employee and calculate its Gross salary according to following:

import java.util.Scanner;
public class CalculateSalary{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);

        System.out.print("Enter the Basic Salary :");
        int bs = s.nextInt();
        float hra,da;

        if(bs<=10000){
            hra = bs*0.20f;
            da = bs*0.80f;
        }
        else if (bs<=20000){
            hra = bs*0.25f;
            da = bs*0.90f;
        }
        else{
            hra = bs*0.30f;
            da = bs*0.99f;
        }
        System.out.println("Take Home is :"+(bs+hra+da));

    }
}
