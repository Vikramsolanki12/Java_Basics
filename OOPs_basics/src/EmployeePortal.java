class Employee{
    private String eid;
    private  String ename;
    private int eage;
    private  String eaddress;

    //set eid
    public void setEid(String eid){
        this.eid=eid;
    }
    //set ename
    public void setEname(String ename){
        this.ename=ename;
    }
    //set eage
    public void setEage(int eage){
        this.eage=eage;
    }
    // set eaddress
    public void setEaddress(String eaddress){
        this.eaddress=eaddress;
    }

    //get eid
    public String getEid(){
        return eid;
    }
    //get name
    public String getEname(){
        return ename;
    }
    // get eage
    public int getEage(){
        return eage;
    }
    //get eaddress
    public String getEaddress(){
        return eaddress;
    }

}
public class EmployeePortal {
    public static void main(String[] args) {
        Employee e1 = new Employee();
        e1.setEid("14A");
        e1.setEname("vikram");
        e1.setEage(21);
        e1.setEaddress("Jodhpur");

        String eid = e1.getEid();
        System.out.println(eid);

        String ename = e1.getEname();
        System.out.println(ename);

        int eage = e1.getEage();
        System.out.println(eage);

        String eaddress = e1.getEaddress();
        System.out.println(eaddress);
    }
}
