class Student{
    private int RollNo;
    private String name;
    private String address;

    //set Roll no
    public void setRollNo(int RollNo){
        this.RollNo=RollNo;
    }
    //set name
    public void setName(String name){
        this.name=name;
    }
    //set address
    public void setAddress(String address){
        this.address=address;
    }

    //get Roll no
    public int getRollNo(){
        return RollNo;
    }
    //get name
    public String getName(){
        return name;
    }
    //get address
    public String getAddress(){
        return address;
    }
}
public class StudentPortal {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.setRollNo(28);
        s1.setName("vikram");
        s1.setAddress("jodhpur");

        int rollNo = s1.getRollNo();
        System.out.println(rollNo);

        String name = s1.getName();
        System.out.println(name);

        String address = s1.getAddress();
        System.out.println(address);
    }
}
