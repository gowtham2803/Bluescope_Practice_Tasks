//  Find the song details with using class and object own logic with ** loop **

import java.util.*;
class song{

    String name;
    String source;
    String format;
    String language;
    int duration;

    public void get(){
        Scanner s=new Scanner(System.in);
        System.out.print("Enter the song Name : ");
        name = s.nextLine();
        System.out.print("Enter the Source of song : ");
        source = s.nextLine();
        System.out.print("Enter the song format : ");
        format = s.nextLine();
        System.out.print("Enter the song language : ");
        language = s.nextLine();
        System.out.print("Enter the song time duration : ");
        duration = s.nextInt();


    }

    public void display(){
        System.out.println("Source   : "+source);
        System.out.println("Format   : "+format);
        System.out.println("Language : "+language);
        System.out.println("Duration : "+duration);
    }
}

public class SongWithLoop{
    public static void main(String [] args){

        song [] obj = new song[3];
        for(int i=0; i<obj.length; i++){
            obj[i]=new song();
            obj[i].get();
            System.out.println();
            System.out.println("Enter the "+i+" song details");
            System.out.println();
        }


        for(int i=0; i<obj.length; i++){
            System.out.println();
            System.out.println((i+1)+" Song display");
            System.out.println();
            obj[i].display();
        }

        obj[0].display();

    }
}