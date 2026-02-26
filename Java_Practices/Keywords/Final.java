//      Final Keyword

class finalz1{

    int a = 10;

    public void method1(){

        int c = a+500;
        System.out.println("The value is :  "+c);
    }

    public void mehtod2(){

        int c = a+200;
        System.oout.println("The value is :  "+c);
    }
}

class finalz2 extends finalz1{

    public void method1(){

        c = a+1000;
        System.out.println("The value is :  "+c);
    }

    public void mehtod2(){

        c = a+1200;
        System.oout.println("The value is :  "+c);
    }
}


public class Final{
    public static void main(String [] args){

        finalz1 obj = finalz2();
        obj.method1();
        obj.method2();

    }
}
