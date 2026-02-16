//      without parameter without return type

class Without_Parameter_And_Return_Type{

    void year(){
        int yr = 2000;
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
        l.year();

    }
}