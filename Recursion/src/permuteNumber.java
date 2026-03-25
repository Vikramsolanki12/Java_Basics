import java.util.ArrayList;

public class permuteNumber {
        static ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        public static void printPermute(int i, ArrayList<Integer> ans, int[] nums, boolean[] used) {

            if (ans.size() == nums.length) {
                arr.add(new ArrayList<>(ans));
                return;
            }

            for (int j = 0; j < nums.length; j++) {

                if (used[j]) continue;

                ans.add(nums[j]);
                used[j] = true;

                printPermute(j + 1, ans, nums, used);

                ans.remove(ans.size() - 1); // backtrack
                used[j] = false;
            }
        }

        public static void main(String[] args) {
            int[] nums = {1, 2, 3, 4};
            ArrayList<Integer> ans = new ArrayList<>();
            boolean[] used = new boolean[nums.length];

            printPermute(0, ans, nums, used);

            System.out.println(arr);
        }
}
