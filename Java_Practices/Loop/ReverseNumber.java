Print the reverse of a given number

import java.util.Scanner;
public class ReverseNumber{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);

        System.out.print("Enter the number to Reverse : ");
        int num = s.nextInt();
        int reverse = 0;

        for(; num!=0; num = num / 10){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
        }
        System.out.println("The Reversed Number is : "+reverse);

    }
}
