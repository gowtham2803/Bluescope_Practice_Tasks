// print First 10 multiples of user given number

import java.util.Scanner;
public class FirstTenMultiples{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);

        System.out.print("Enter the multiples Number : ");
        int num = s.nextInt();
        int total = 1;

        for(int i =1; i<=10; i++){
            total = i * num;
            System.out.println(i+" "+"x "+num+" "+"="+" "+total);

        }

    }
}
