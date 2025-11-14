class Person{
    public String name ="vikram";
    public  int age = 21;
    public  String address = "Jodhpur";
}
class StudentDetails extends Person{
    public int marks = 56;
    public String grade = "A";

    public void show(){
        System.out.println(name);
        System.out.println(age);
        System.out.println(address);
        System.out.println(marks);
        System.out.println(grade);
    }
}
public class inheritance {
    public static void main(String[] args) {
        StudentDetails s1 = new StudentDetails();
        s1.show();
    }
}
