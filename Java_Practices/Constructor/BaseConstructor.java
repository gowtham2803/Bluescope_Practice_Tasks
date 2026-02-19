//  Simple Task and Basic syntax code for Constructor

class myclass{

    private int a;
    private int b;
    private int c;

    public myclass(){

        a=100;
        b=200;
    }

    public myclass(int x,int y){
        x=a;
        y=b;
    }

    void addition(){
        c=a+b;
        System.out.println("The result is : "+c);
    }
}

public class BaseConstructor{
    public static void main(String [] args){

        myclass m1 = new myclass(1000,2000);
        m1.addition();

    }
}