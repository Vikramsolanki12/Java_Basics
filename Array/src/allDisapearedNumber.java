import java.util.*;
public class allDisapearedNumber {
    public static void main(String[] args) {
        int[] nums = {4,3,2,7,8,2,3,1};
        List<Integer> ans = new ArrayList<>();

        for(int i=0 ; i<nums.length ; i++){
            int idx = Math.abs(nums[i])-1;
            if(nums[idx]>0){
                nums[idx] *= (-1);
            }
        }
        for(int i=0 ; i<nums.length ;i++){
            if(nums[i]>0) ans.add(i+1);
        }
        System.out.println(ans);
    }
}
