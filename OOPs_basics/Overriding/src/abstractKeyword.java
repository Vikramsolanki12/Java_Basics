abstract class Parent4{
    public abstract void methodOne();
}
class Child4 extends Parent4{
    public void methodOne(){
        System.out.println("child class methodone()");
    }
}
public class abstractKeyword {
    public static void main(String[] args) {
        Parent4 p = new Child4();
        p.methodOne();
    }
}
