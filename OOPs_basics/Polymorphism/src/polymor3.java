class Sample1{
    public void methodOne(String s){
        System.out.println("String version....");
    }
    public void methodOne(StringBuffer o){
        System.out.println("StringBuffer version...");
    }
    public void methodOne(Object o){
        System.out.println("Object version...");
    }
}
public class polymor3 {
    public static void main(String[] args) {
        Sample1 s = new Sample1();
        s.methodOne(new String("vikram"));
        s.methodOne(new StringBuffer("vikram"));
//        s.methodOne(null);
    }
}
