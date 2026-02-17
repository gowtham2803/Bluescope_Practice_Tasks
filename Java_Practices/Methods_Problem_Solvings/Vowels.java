//Find the Vowels

import java.util.Scanner;
class vowels{
    Scanner s=new Scanner(System.in);

    public void find(){

        System.out.print("Enter the word or Sentence :  ");
        String input = s.nextLine();
        input = input.toLowerCase();
        int count = 0;

        for(int i=0; i<input.length(); i++){
            char ch = input.charAt(i);
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                System.out.print(ch+"  ");
                count++;
            }
        }

        if(count!=0){
            System.out.println("Totally  "+count+"  "+"is here");
        }
        else{
            System.out.println("No, There is no vowels");
        }

    }
}

public class Vowels{
    public static void main(String [] args){

        vowels v=new vowels();
        v.find();

    }
}
