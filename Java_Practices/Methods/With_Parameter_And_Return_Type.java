//      With parameter with Return type

class With_Parameter_And_Return_Type{

    String year(int yr){
        if(yr%4==0){
            return "Leep Year";
        }
        else{
            return "Not Leep";
        }

    }
}

public class day21{
    public static void main(String [] args){

        leep l=new leep();
        String res = l.year(2003);
        System.out.println(res);

    }
}