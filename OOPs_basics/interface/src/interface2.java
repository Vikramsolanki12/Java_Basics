interface ICalculator1{
    void add(int a, int b);
    void sub(int a, int b);
}
interface IAdvancedCalculator{
    void mul(int a, int b);
    void div(int a, int b);
}
class CalculatorImpl1 implements ICalculator1, IAdvancedCalculator{
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void sub(int a, int b){
        System.out.println(a-b);
    }
    public void mul(int a, int b){
        System.out.println(a*b);
    }
    public void div(int a, int b){
        System.out.println(a/b);
    }
}
public class interface2 {
    public static void main(String[] args) {
        CalculatorImpl1 cal = new CalculatorImpl1();
        cal.add(20,10);
        cal.sub(20,10);
        cal.mul(20,10);
        cal.div(20,10);
    }
}
