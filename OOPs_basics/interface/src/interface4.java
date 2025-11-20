interface ICalculator3{
    void add(int a, int b);
    void sub(int a, int b);
}
interface IAdvancedCalculator2{
    void rem(int a, int b);
    void max(int a, int b);
}
class AdvancedCalculator3{
    void mul(int a, int b){
        System.out.println(a*b);
    }
    void div(int a, int b){
        System.out.println(a/b);
    }
}
class CalculatorImpl3 extends AdvancedCalculator2 implements ICalculator2,IAdvancedCalculator2{
    public void add(int a, int b){
        System.out.println(a+b);
    }
    public void sub(int a, int b){
        System.out.println(a-b);
    }
    public void rem(int a, int b){
        System.out.println(a%b);
    }
    public void max(int a,int b){
        System.out.println(Math.max(a,b));
    }
}
public class interface4 {
    public static void main(String[] args) {
        CalculatorImpl3 cal = new CalculatorImpl3();
        cal.add(20,10);
        cal.sub(20,10);
        cal.mul(20,10);
        cal.div(20,10);
        cal.rem(20,10);
        cal.max(20,10);
    }
}
