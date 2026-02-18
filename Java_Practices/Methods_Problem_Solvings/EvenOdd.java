//Even	or odd

import java.util.Scanner;
class find{
    public void evenorodd(int a){

        if(a%2==0){
            System.out.println("even");
        }
        else{
            System.out.println("Odd");
        }
    }
}

public class EvenOdd{
    public static void main(String [] args){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter A number :");
        int num = s.nextInt();
        find f1 = new find();
        f1.evenorodd(num);

    }
}