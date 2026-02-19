//  Mehod Overriding
class print1{

    public void gowtham(){
        System.out.println("Hii");
    }

    public void stark(){
        System.out.println("Hello");
    }
}
class print2 extends print1{

    public void gowtham(){
        System.out.println("vanakkam");
    }

    public void stark(){
        System.out.println("fsjkbjlsh");
    }
}

public class MethodOverRideTask{
    public static void main(String [] args){

        print1 p = new print2();
        p.gowtham();
        p.stark();

    }
}