//Object and void is not related
class Parent1{
    public Object methodOne(){
        return null;
    }
    class Child1 extends Parent1{
        public void methodOne(){
            System.out.println("hello form child..");
        }
    }
}
public class override2 {
    public static void main(String[] args) {
        Parent p = new Child();
//        p.methodOne();
    }
}
