//Find the language details with Class and Objects

import java.util.*;
class language{

    String language_name;
    String language_origin;
    int language_age;

    public void details(){
        Scanner s=new Scanner(System.in);

        System.out.println("Enter the Language Name :");
        language_name = s.next();
        System.out.println("Enter the Language Origin Country :");
        language_origin = s.next();
        System.out.println("Enter the Language age :");
        language_age = s.nextInt();
    }

    public void display(){

        System.out.println("Name   : "+" "+language_name);
        System.out.println("Origin : "+" "+language_origin);
        System.out.println("Age    : "+" "+language_age);

    }

}

public class LanguageFind{
    public static void main(String [] args){

        language l1=new language();
        l1.details();
        l1.display();

        language l2=new language();
        l2.details();
        l2.display();


    }
}