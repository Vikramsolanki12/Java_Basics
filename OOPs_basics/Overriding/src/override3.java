class Parent2{
    public Object methodOne(){
        return null;
    }
}
class Child2 extends Parent2{
    public String methodOne(){
        System.out.println("hello from child..");
        return null;
    }
}
public class override3 {
    public static void main(String[] args) {
        Parent2 p = new Child2();
        p.methodOne();
    }
}
