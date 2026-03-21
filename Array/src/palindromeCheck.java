import java.util.*;

public class palindromeCheck {
    public static void main(String[] args) {
        int[] nums = {2,3,6};
        ArrayList<Integer> ans = new ArrayList<>();


        Arrays.sort(nums);
        int mx = nums[nums.length-1];
        int min = nums[0];

        Set<Integer> set = new HashSet<>();
        for(int ele : nums){
            set.add(ele);
        }

        for(int i=min ; i<mx ; i++){
            if(!set.contains(i)) ans.add(i);
        }
        System.out.println(ans);
    }
}
