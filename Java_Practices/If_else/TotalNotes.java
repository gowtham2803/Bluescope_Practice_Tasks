//  Write a program to count total number of notes in given amount

import java.util.Scanner;
public class count TotalNotes{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);

        System.out.print("Enter the Amount :");
        int amt = s.nextInt();

        int n500 = 0,n200 = 0,n100=0,n50=0,n20=0,n10=0,n5=0,n2=0,n1=0;

        if(amt>=500){
            n500 = amt / 500;
            amt = amt - n500 * 500;
        }
        if(amt>=200){
            n200 = amt / 200;
            amt = amt - n200 * 200;
        }
        if(amt>=100){
            n100 = amt / 100;
            amt = amt - n100 * 100;
        }
        if(amt>=50){
            n50 = amt / 50;
            amt = amt - n50 * 50;
        }
        if(amt>=20){
            n20 = amt / 20;
            amt = amt - n20 * 20;
        }
        if(amt>=10){
            n10 = amt / 10;
            amt = amt - n10 * 10;
        }
        if(amt>=5){
            n5 = amt / 5;
            amt = amt - n5*5;
        }
        if(amt>=2){
            n2 = amt / 2;
            amt = amt - n2*2;
        }
        if(amt>=1){
            n1 = amt / 1;
            amt = amt - n1*1;
        }
        else{
            System.out.println("Enter the Valid Amount");
        }

        System.out.println("500 Notes :"+n500);
        System.out.println("200 Notes :"+n200);
        System.out.println("100 Notes :"+n100);
        System.out.println("50 Notes :"+n50);
        System.out.println("20 Notes :"+n20);
        System.out.println("10 Notes :"+n10);
        System.out.println("5 Coins :"+n5);
        System.out.println("2 Coins :"+n2);
        System.out.println("1 Coins :"+n1);

    }
}
