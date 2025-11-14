class PersonDetail{
    public String name;
    public int age;
    public  String address;

    PersonDetail(){
        System.out.println("PersonDetail constructor initialized....");
    }

}
class StudentDetails1 extends PersonDetail{
    public int marks;
    public String grade;

    StudentDetails1(String name, int age, String address, int marks, String grade){
        System.out.println("Student constructor initialized...");
        this.name=name;
        this.age=age;
        this.address=address;
        this.marks=marks;
        this.grade=grade;
        System.out.println("name:"+name);
        System.out.println("age:"+age);
        System.out.println("address:"+address);
        System.out.println("marks:"+marks);
        System.out.println("grade:"+grade);
    }
}
public class constructor {
    public static void main(String[] args) {
        StudentDetails1 s1 = new StudentDetails1("vikram",21,"Jodhpur",99,"A+");
    }
}
