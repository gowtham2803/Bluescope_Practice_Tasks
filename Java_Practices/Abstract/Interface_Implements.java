//Interface and Implements methods

interface sam1{
    public void displaydate();
}
interface sam2{
    public void displaymonth();
    public void displayyear();
}

class displays implements sam1,sam2{
    public void displaydate(){
        System.out.println("date");
    }
    public void displaymonth(){
        System.out.println("month");
    }
    public void displayyear(){
        System.out.println("year");
    }
}

public class Interface_Implements{
    public static void main(String [] args){

        displays d=new displays();
        d.displaydate();
        d.displaymonth();
        d.displayyear();

    }
}