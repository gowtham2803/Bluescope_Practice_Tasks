//  Anagram

public class methods{
    public static void main(String [] args){

        String name1 = "listen";
        String name2 = "silent";
        int len = name1.length();
        int count = 0;

        for(int i=0; i<name1.length(); i++){
            char ch1 = name1.charAt(i);
            for(int j=0; j<name2.length(); j++){
                char ch2 = name2.charAt(j);
                if(ch1==ch2){
                    count++;
                }
            }
        }
        if(len == count){
            System.out.println("Yes, Anagram");
        }
        else{
            System.out.println("No, Not an Anagram");
        }

    }
}