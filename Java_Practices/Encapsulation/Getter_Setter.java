//  Set & Get Methods( For getting private variables )

class students{

    private int rollno;
    private String name;

    public void setsr(int rollno){
        this.rollno = rollno;
    }
    public int getsr(){
        return this.rollno;
    }

    public void setsn(String name){
        this.name = name;
    }
    public String getsn(){
        return this.name;
    }

}

public class Getter_Setter{
    public static void main(String [] args){

        students s=new students();
        s.setsr(101);
        s.setsn("STARK");
        int res = s.getsr();
        String resu = s.getsn();

        System.out.println(res);
        System.out.println(resu);
    }
}