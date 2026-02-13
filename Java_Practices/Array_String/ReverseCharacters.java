//      Reverse a Characters
public class ReverseCharacters{
    public static void main(String [] args){

        String name = "STARK";
        String reverse = "";

        for(int i=name.length() - 1; i>=0; i--){
            reverse = reverse + name.charAt(i);
        }

        for (int i= 0; i<reverse.length(); i++){
            System.out.println(reverse.charAt(i));
        }

    }
}