class Demo{
    public void methodOne(int i){
        System.out.println("general method");
    }
    public void methodOne(int... i){
        System.out.println("var-args method");
    }
}
public class polymor5 {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.methodOne(); //var-args method
        d.methodOne(10); //general method
        d.methodOne(10,20); //var-args method
    }
}
