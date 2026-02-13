//   Print Three digit Number

public class ThreeDigit
{
    public static void main(String[] args) {
        int [] num = {20,56,555,45,3};

        for(int i = 0; i<num.length; i++){
            if(num[i] <= 999 && num[i] >=100){
                System.out.println("Yes"+" "+num[i]+" "+"This is three digit number");
            }
        }



    }
}