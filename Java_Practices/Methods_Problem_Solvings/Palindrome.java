//  Check if String is a Palindrome (String and Array)

class check{

    public void palindrome(){
        String name = "MalayalaM";
        char [] arr = new char [name.length()];

        int j = 0;
        for(int i=name.length()-1; i>=0; i--){
            arr[j] = name.charAt(i);
            j++;
        }

        String newarr = new String(arr);

        if(name.equals(newarr)){
            System.out.println("Yes, Palindrome");
        }
        else{
            System.out.println("No, Not a Palindrome");
        }
    }
}

public class Palindrome{
    public static void main(String [] args){

        check c=new check();
        c.palindrome();

    }
}