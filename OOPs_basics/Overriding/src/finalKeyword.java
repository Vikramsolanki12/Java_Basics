class Parent3{
    public final void methodOne(){
        System.out.println("parent class mehtod one");
    }
}
class Child3 extends Parent3{
    public void methodOne(){
        System.out.println("child class method one");
    }
}
public class finalKeyword {
    public static void main(String[] args) {
        Parent3 p = new Child3();
        p.methodOne();
    }
}
