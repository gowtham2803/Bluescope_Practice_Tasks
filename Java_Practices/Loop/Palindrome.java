//   Check the Number is Palindrome or not

import java.util.Scanner;
public class loop{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);

        System.out.print("Enter the number ; ");
        int num = s.nextInt();
        int val = num;
        int reverse = 0;

        for (; num!=0; num=num/10){
            int digit = num % 10;
            reverse = reverse * 10 + digit;
        }
        System.out.println(reverse);

        if(val==reverse){
            System.out.println("Palindrome");
        }
        else{
            System.out.println("Not a Palindrome");
        }

    }
}