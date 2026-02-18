//  Student Registration

class cls_reg{

    public String name;
    public int rollno;
    public int age;
    public String address;
    public String domain;

    public void stu_details(){

        name = "Gowtham";
        rollno = 101;
        age = 25;
        address = "Chennai";
        domain = "Java";
    }

    public void display(){

        System.out.println("Student name is    : "+name);
        System.out.println("Student Roll No is : "+rollno);
        System.out.println("Student Age is     : "+age);
        System.out.println("Student Address is : "+address);
        System.out.println("Student Domain is  : "+domain);
    }
}

public class StudentRegistration{
    public static void main(String [] args){

        cls_reg c1 = new cls_reg();
        c1.stu_details();
        c1.display();

    }
}