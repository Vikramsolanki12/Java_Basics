import java.util.*;

public class pascalTriangle {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();

        List<List<Integer>> ans = new ArrayList<>();

        for(int i =0 ; i<n ; i++){
            List<Integer> l = new ArrayList<>();
            for(int j=0 ;j<i;j++){
                if(j==0 || j==i) l.add(1);
                else l.add(ans.get(i-1).get(j)+ans.get(i-1).get(j-1));
            }
            ans.add(l);
        }
        for(int i=0;i<ans.size();i++){
            List<Integer> x = ans.get(i);
            for(int j=0 ;j<x.size();j++){
                System.out.print(x.get(j)+" ");
            }
            System.out.println();
        }
    }
}
