//      This keyword

class teacher{

    String name = null;

    teacher(){
        System.out.println("hello teacher");
    }
    public void setname(String name){
        System.out.println(name);
    }

}

public class This{
    public static void main(String [] args){

        teacher t=new teacher();
        t.setname("malar");
        System.out.println(t.name);

    }
}