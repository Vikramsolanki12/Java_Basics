class Parent{
    public void property(){
        System.out.println("land+cash+gold");
    }
    public void marry(){
        System.out.println("relative girl");
    }
}
class Child extends Parent{
    public void marry(){
        System.out.println("some other girl");
    }
}
public class override {
    public static void main(String[] args) {
        Parent p1 = new Parent();
        p1.property();
        p1.marry();

        System.out.println();

        Child c1 = new Child();
        c1.property();
        c1.marry();

        System.out.println();

        Parent p2 = new Child();
        p2.property();
        p2.marry();
    }
}
