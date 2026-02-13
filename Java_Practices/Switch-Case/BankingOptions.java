// Create a menu-driven program for banking options: deposit, withdraw, check balance, exit.

import java.util.Scanner;
public class BankingOptions{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);

        int bal=1000;
        System.out.println("Your Initial Balance :"+bal);

        boolean running = true;

        while(running){
            System.out.println("1.Deposit");
            System.out.println("2.Withdraw");
            System.out.println("3.Check Balance");
            System.out.println("4.Exit");

            System.out.print("Enter the existing banking options:");
            int op = s.nextInt();

            switch (op) {

                case 1 :
                    System.out.print("Enter the Amount to Deposit : ");
                    int amnt = s.nextInt();
                    bal = bal+amnt;
                    System.out.println("Deposited! Total Balance is : "+ bal);
                    break;
                case 2 :
                    System.out.print("Enter the withdraw Amount :");
                    int wd = s.nextInt();
                    if(wd<bal){
                        bal -= wd;
                        System.out.println("Withdrawd! Your total Balance is :"+bal);
                    }
                    else{
                        System.out.println("Please Enter the Low Amount of below Your balance");
                        System.out.println("Your Current Balance is : "+bal);
                    }
                    break;
                case 3 :
                    System.out.println("Your Current Balance is : "+bal);
                    break;
                case 4 :
                    System.out.println("Thank Yout for Visiting - _ -");
                    break;
                default :
                    System.out.println("Invalid Option");
            }
            running = false;
        }

    }
}
