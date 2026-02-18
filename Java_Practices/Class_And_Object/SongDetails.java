//      Find the song and song details with using class and object own logic


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

public class SongDetails{
    public static void main(String [] args){

        song s1=new song();
        s1.get();
        System.out.println();
        System.out.println("Enter the next song details");
        System.out.println();

        song s2=new song();
        s2.get();

        System.out.println();
        System.out.println("1st Song display");
        System.out.println();
        s1.display();
        System.out.println();
        System.out.println("2nd Song display");
        System.out.println();
        s2.display();

    }
}
