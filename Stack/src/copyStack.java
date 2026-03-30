import java.util.Scanner;
import java.util.Stack;

public class copyStack {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        Stack<Integer> st = new Stack<>();
        for(int i=1 ;i<=n; i++){
            st.push(scn.nextInt());
        }
        System.out.println(st);

        Stack<Integer> temp = new Stack<>();
        while(!st.isEmpty()) temp.push(st.pop());
        System.out.println(temp);

        Stack<Integer> ans = new Stack<>();
        while(!temp.isEmpty()) ans.push(temp.pop());

        System.out.println(ans);
    }
}
