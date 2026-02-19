//  implement constructor overloading

class cls_reg{

    public String name;
    public int rollno;
    public int age;
    public String address;
    public String domain;

    public void cls_reg(){

        name="Gowtham";
        rollno=101;
        age = 25;
        address = "Chennai";
        domain = "Java";
    }

    public void cls_reg(String n,int r,int a,String ad,String d){
        name=n;
        rollno=r;
        age=a;
        address=ad;
        domain=d;
    }

    public void display(){
        System.out.println("Student Name is    : "+name);
        System.out.println("Student Roll No is : "+rollno);
        System.out.println("Student Age is     : "+age);
        System.out.println("Student Name is    : "+address);
        System.out.println("Student Name is    : "+domain);
    }
}

public class ConstructorOverloading{
    public static void main(String [] args){

        cls_reg c1 = new cls_reg();
        c1.cls_reg();
        c1.display();
        System.out.println();
        cls_reg c2 = new cls_reg();
        c2.cls_reg("guna",102,25,"Chennai","Python");
        c2.display();



    }
}
