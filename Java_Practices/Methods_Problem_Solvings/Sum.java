//  Sum the two numbers

class sum{

    public int add(int a,int b){
        return a+b;
    }
}

public class Sum{
    public static void main(String [] args){

        sum s1 = new sum();
        int res = s1.add(5,10);
        System.out.println("Total result is : "+res);

    }
}