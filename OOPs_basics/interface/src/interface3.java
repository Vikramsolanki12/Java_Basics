interface ICalculator2{
    void add(int a, int b);
    void sub(int a, int b);
}
class AdvancedCalculator2{
    void mul(int a, int b){
        System.out.println(a*b);
    }
    void div(int a, int b){
        System.out.println(a/b);
    }
}
class CalculatorImpl2 extends AdvancedCalculator2 implements ICalculator2{
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void sub(int a, int b){
        System.out.println(a-b);
    }
}
public class interface3 {
    public static void main(String[] args) {
        CalculatorImpl2 cal = new CalculatorImpl2();
        cal.add(20,10);
        cal.sub(20,10);
        cal.mul(20,10);
        cal.div(20,10);
    }
}
