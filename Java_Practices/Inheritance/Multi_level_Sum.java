//    Exercise: implement multi level inheritance


class values{

    public int num1;
    public int num2;
    public int num3;

    public void students(){

        num1 = 100;
        num2 = 200;
        num3 = 300;

    }
}

class add extends values{
    public void addition(){
        int a = num1 + num2 + num3;
        System.out.println(a);
    }
}

class sub extends add{
    public void subraction(){
        int s = num1 - num2 - num3;
        System.out.println(s);
    }
}

public class Multi_level_Sum{
    public static void main(String [] args){

        sub s1 = new sub();
        s1.addition();
        s1.subraction();
    }
}
