import java.util.*;

public class Day12 {

    // Q-1
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];
        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }
        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));
        StringBuilder result = new StringBuilder();
        for (String str : arr) {
            result.append(str);
        }
        return result.toString();
    }

    // Q-2
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[k - nums.length];
    }

    // Q-3
    public int findDuplicate(int[] nums) {
        int slow = nums[0];
        int fast = nums[0];
        do {
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (fast != slow);
        slow = nums[0];
        while (slow != fast) {
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }

    // Q-4
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> arr = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        int k = 0;
        int n = nums.length;
        while (k < n) {
            if (nums[k] != nums[nums[k] - 1]) {
                int temp = nums[k];
                nums[k] = nums[temp - 1];
                nums[temp - 1] = temp;
            } else {
                k++;
            }
        }
        for (int i = 0; i < n; i++) {
            if (nums[i] != i + 1) {
                arr.add(nums[i]);
            }
        }
        return arr;
    }
}
