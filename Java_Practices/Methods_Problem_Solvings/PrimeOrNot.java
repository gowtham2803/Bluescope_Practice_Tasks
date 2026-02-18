//  Check is a number Prime or Not ?

import java.util.*;
class prime_or_not{
    Scanner s = new Scanner(System.in);

    int num;

    public String check(){
        System.out.println("Enter the number :");
        num = s.nextInt();

        if(num<=1){
            return "Not Prime";
        }
        for (int i=2; i<=num; i++){
            if(num % i == 0){
                return "Not Prime";
            }
            else{
                return "Prime";
            }
        }

    }
}


public class PrimeOrNot{
    public static void main(String [] args){

        prime_or_not pot = new prime_or_not();
        String res = pot.check();
        System.out.println(res);

    }
}