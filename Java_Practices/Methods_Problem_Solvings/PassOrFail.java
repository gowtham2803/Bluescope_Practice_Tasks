//Find pass or Fail

import java.util.Scanner;
class school{
    public String passorfaill(int a){

        if(a>=35){
            return "Pass";
        }
        else{
            return "Fail";
        }

    }
}


public class PassOrFail{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the total mark : ");
        int mark = s.nextInt();

        school s1 = new school();
        String res = s1.passorfaill(mark);
        System.out.println(res);

    }
}