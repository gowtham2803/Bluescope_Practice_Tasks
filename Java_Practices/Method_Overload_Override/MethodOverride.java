//      Method Overloading

class methodoverloading{

    public String gowtham(int age, String lan1, String lan2){

        if(age!=0 && lan1.equals("java") && lan2.equals("python")){
            return "Good";
        }
        else{
            return "bad";
        }
    }
    public String guna(int age, String lan1, String lan2, String lan3){

        if(age!=0 && lan1.equals("java") && lan2.equals("python") && lan3.equals("dotnet")){
            return "Super";
        }
        else if(age!=0 && lan1.equals("java") && lan2.equals("python") && lan3.equals("no")){
            return "Good";
        }
        else if(age!=0 && lan1.equals("java") && lan2.equals("no") && lan3.equals("no")){
            return "Average";
        }
        else{
            return "bad";
        }
    }

    public String suren(float percentage, float cgpa){

        if(percentage > 80.50 && cgpa >= 5.5){
            return "Good";
        }
        else{
            return "bad";
        }
    }
    public String yogi(int mark, float cgpa){

        if(mark > 300 && cgpa >= 8.00){
            return "Good";
        }
        else{
            return "bad";
        }
    }

}

public class MethodOverride{
    public static void main(String [] args){

        methodoverloading m1 = new methodoverloading();
        String r = m1.gowtham(12,"java","python");
        String re = m1.guna(25,"java","python","dotnet");
        String res = m1.suren(85.65f,6.5f);
        String resu = m1.yogi(485,9.5f);
        System.out.println(r+method.name);
        System.out.println(re);
        System.out.println(res);
        System.out.println(resu);


    }
}
