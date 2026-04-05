import java.util.Scanner;
import java.util.Stack;

public class RemoveDuplicates {
    public static void main(String[] args) {
        String s = "abbcc";
        Stack<Character> st = new Stack<>();

        for(int i=0 ; i<s.length() ; i++){
            char ch = s.charAt(i);

            if(!st.isEmpty() && st.peek()==ch){
                st.pop();
            }else{
                st.push(ch);
            }
        }
        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            ans.append(st.pop());
        }
        System.out.print(ans.reverse().toString());
    }
}
