public class gcd {
    public  static int hcf(int a , int b){
        if(b%a==0) return a;
        return hcf(b%a,a);
    }
    public static void main(String[] args) {
        int a =97, b=12;
        System.out.println(hcf(a,b));
    }
}
