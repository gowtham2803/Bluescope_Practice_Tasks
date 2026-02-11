//  write a program to Check Whether a Given Number is Prime or Not

import java.util.Scanner;
public class CheckPrime{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);

        System.out.print("Enter the Number  :");
        int num = s.nextInt();
        int count = 0;
        for (int i = 1; i<=num; i++){
            if(num%2==0){
                count = count + 1;
            }
        }
        if (count==2){
            System.out.println("Prime Number");
        }
        else{
            System.out.println("Not Prime Number");
        }

    }
}
