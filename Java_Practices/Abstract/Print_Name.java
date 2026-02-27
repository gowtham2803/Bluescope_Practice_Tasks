
abstract class print1{

    public abstract void gowtham();

    public abstract void stark();

    public abstract void guna();

    public abstract void steeve();

}

class print2 extends print1{

    public void gowtham(){
        System.out.println("I am Gowtham");
    }

    public void stark(){
        System.out.println("I am Stark");
    }

    public void guna(){
        System.out.println("I am Guna");
    }

    public void steeve(){
        System.out.println("I am Steeve");
    }
}

public class Print_Name{
    public static void main(String [] args){

        print1 p = new print2();
        p.gowtham();
        p.stark();
        p.guna();
        p.steeve();

    }
}


