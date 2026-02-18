//      with parameter without return type


public class With_Parameter_And_Without_Return_Type{

    void year(int yr){
        if(yr%4==0){
            System.out.println("Leep Year");
        }
        else{
            System.out.println("Not Leep Year");
        }
    }
}

public class day21{
    public static void main(String [] args){

        leep l= new leep();
        l.year(2002);

    }
}