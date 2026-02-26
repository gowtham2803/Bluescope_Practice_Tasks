
//      Static Keyword

class print{

    public static int num;

    public void print(){
        num=0;
    }

    public static void b(){
        num++;
    }

    public static void c(){
        System.out.println(num);
    }
}

public class Static{
    public static void main(String [] args){

        print p1=new print();
        print p2=new print();
        p1.b();
        p1.c();
        p2.b();
        p2.c();
    }
}