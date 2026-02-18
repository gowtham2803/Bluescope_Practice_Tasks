//Find the factorial of a number

class factorial{
    public int fact(int num){
        int val =1;
        for(int i=1;i<=num; i++){
            val = val * i;
        }
        return val;
    }
}

public class FindFactorial{
    public static void main(String [] args){

        factorial f1 = new factorial();
        int res = f1.fact(5);
        System.out.println(res);

    }
}