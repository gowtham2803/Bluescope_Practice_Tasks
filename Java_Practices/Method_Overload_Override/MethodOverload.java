
//      Method Overloading Basic Syntax

class methodoverloading{

    public void addition(int a, int b){
        System.out.println(a+b);
    }
    public void addition(int a, int b, int c){
        System.out.println(a+b+c);
    }

    public void addition(float a, float b){
        System.out.println(a+b);
    }

    public void addition(int a, float b){
        System.out.println(a+b);
    }

    public void addition(float a, int b){
        System.out.println(a+b);
    }

}

public class MethodOverload{
    public static void main(String [] args){

        methodoverloading m1 = new methodoverloading();
        m1.addition(100,200);
        m1.addition(100,200,300);
        m1.addition(10.5f,20.50f);
        m1.addition(100,20.5f);
        m1.addition(10.3f,200);

    }
}