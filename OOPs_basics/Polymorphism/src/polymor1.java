class Calculator{
    public void add(int a, float b){
        System.out.println("int-float argument");
    }
    public void add(float a, int b){
        System.out.println("float-int argument");
    }
}
public class polymor1 {
    public static void main(String[] args) {
        Calculator c = new Calculator();
        c.add(10,25.5f);
        c.add(20.5f,10);
//        c.add(10,20);
    }
}
