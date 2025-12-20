import java.util.Scanner;

public class updateEvenPosition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();

        String temp="";
        for(int i=0 ; i<str.length();i++){
            if(i%2==0) {
                temp += 'a';
            }else{
                temp+= str.charAt(i);
            }
        }
        System.out.println(temp);
    }
}
