//      without parameter with return type

public class Without_Parameter_And_With_Return_Type{

    String year(){
        int yr = 2001;
        if(yr%4==0){
            return "Leep Year";
        }
        else{
            return"Not Leep Year";
        }
    }
}

public class day21{
    public static void main(String [] args){

        leep l= new leep();
        String res = l.year();
        System.out.println(res);

    }
}
