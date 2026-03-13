public class GenerateAllBinaryStringsWithoutConsecutiveOnes {
    public static void printBinary(String s, int n){
        int m = s.length();
        if(m==n){
            System.out.println(s);
            return;
        }
        if(m == 0 || s.charAt(m-1)=='0'){
            printBinary(s+'0',n);
            printBinary(s+'1',n);
        }else{
            printBinary(s+'0',n);
        }
    }
    public static void main(String[] args) {
        int n =5;
        printBinary("",n);
    }
}
