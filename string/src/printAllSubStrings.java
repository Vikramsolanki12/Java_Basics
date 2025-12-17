import java.util.Scanner;

public class printAllSubStrings {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = scn.next();

        for(int i=0 ; i<=str.length();i++){
            for(int j=i+1 ; j<=str.length();j++){
                System.out.print(str.substring(i,j)+" ");
            }
        }
    }
}
