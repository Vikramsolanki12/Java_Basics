interface ICalculator{
    void add(int a, int b);
    void sub(int a, int b);
    void mul(int a, int b);
    void div(int a, int b);
}
class CalculatorImpl implements ICalculator{
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
public class interface1 {
    public static void main(String[] args) {
        CalculatorImpl cal = new CalculatorImpl();
        cal.add(20,10);
        cal.sub(20,10);
        cal.mul(20,10);
        cal.div(20,10);
    }
}
