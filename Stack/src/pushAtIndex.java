import java.util.Scanner;
import java.util.Stack;

public class pushAtIndex {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        Stack<Integer> st = new Stack<>();
        for(int i=1 ; i<=n ; i++){
            st.push(scn.nextInt());
        }
        int x = scn.nextInt();
        int idx = scn.nextInt();

        Stack<Integer> temp = new Stack<>();
        while(st.size()>idx+1){
            temp.push(st.pop());
        }
        st.push(x);
        while(!temp.isEmpty()){
            st.push(temp.pop());
        }

        while(!st.isEmpty()){
            System.out.print(st.pop()+" ");
        }
    }
}
