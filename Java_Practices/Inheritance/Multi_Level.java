//Multi-level Inheeritance

import java.io.*;
class base1{

    public int a, b, c;

    public void initialize(){
        a=100;
        b=50;
    }
}

class base2 extends base1{
    private void addition(){
        c=a+b;
    }

    public void subtraction(){
        c=a-b;
    }
}

class base3 extends base2{
    public void display(){
        System.out.println(" addition result is " + c);
        System.out.println(" subtraction result is " +c);
    }
}


class Multi_Level{
    public static void main(String []args){

        base3 b3=new base3();
        b3.initialize();
        b3.addition();
        b3.subtraction();
        b3.display();

    }
}
