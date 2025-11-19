class Sample{
    public void methodOne(String s){
        System.out.println("String version....");
    }
    public void methodOne(Object o){
        System.out.println("Object version.....");
    }
}
public class polymor2 {
    public static void main(String[] args) {
        Sample s = new Sample();
        s.methodOne("sachin");
        s.methodOne(new Object());
        s.methodOne(null);
    }
}
