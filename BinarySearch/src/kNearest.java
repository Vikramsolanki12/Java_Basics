import java.util.*;

public class kNearest {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int k =4;
        int x=3;

        int n = arr.length;

        Arrays.sort(arr); // REQUIRED

        List<Integer> ans = new ArrayList<>();

        // Case 1: x <= smallest element
        if (x <= arr[0]) {
            for (int i = 0; i < k; i++) {
                ans.add(arr[i]);
            }
            System.out.print(ans);
            return;
        }

        // Case 2: x >= largest element
        if (x >= arr[n - 1]) {
            for (int i = n - k; i < n; i++) {
                ans.add(arr[i]);
            }
            System.out.print(ans);
            return;
        }

        // Binary search for lower bound
        int lb = n;
        int lo = 0, hi = n - 1;

        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (arr[mid] >= x) {
                lb = mid;
                hi = mid - 1;
            } else {
                lo = mid + 1;
            }
        }

        int i = lb - 1;
        int j = lb;

        // Two-pointer selection
        while (k > 0 && i >= 0 && j < n) {
            if (Math.abs(arr[i] - x) <= Math.abs(arr[j] - x)) {
                ans.add(arr[i--]);
            } else {
                ans.add(arr[j++]);
            }
            k--;
        }

        while (k > 0 && i >= 0) {
            ans.add(arr[i--]);
            k--;
        }

        while (k > 0 && j < n) {
            ans.add(arr[j++]);
            k--;
        }

        Collections.sort(ans);
        System.out.print(ans);
    }
}
