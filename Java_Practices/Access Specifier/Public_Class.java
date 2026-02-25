//      access Specifier


class myclass1{

    public int a ;

    public void method1(){

        a = 100;

    }
}

class myclass2 extends myclass1{
    public void method2(){

        a = 200;

    }
}

public class Public_Class{
    public static void main(String [] args){

        myclass1 m1 = new myclass1();
        m1.method1();
        myclass2 m2 = new myclass2();
        m2.method2();

    }
}