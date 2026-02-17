//Reverse a String

class reverse{

    String name = "GOWTHAM";

    public void rev(){

        for(int i=name.length()-1; i>=0; i--){
            //for(int j=0; j<name.length; j++){
            System.out.print(name.charAt(i)+"  ");
        }
    }
}

public class ReverseString{
    public static void main(String [] args){

        reverse r1 = new reverse();
        r1.rev();

    }
}