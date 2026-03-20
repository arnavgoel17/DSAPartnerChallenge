import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Day8 {

    // Q-1
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }

    // Q-2
    public int[] getConcatenation(int[] nums) {
        int n = nums.length;
        int[] ans = new int[2 * n];
        for (int i = 0; i < 2 * n; i++) {
            ans[i] = nums[i % n];
        }
        return ans;
    }

    // Q-3
    public int[] runningSum(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        ans[0] = nums[0];
        for (int i = 1; i < n; i++) {
            ans[i] = ans[i - 1] + nums[i];
        }
        return ans;
    }

    // Q-4
    public int maximumWealth(int[][] accounts) {
        int maxWealth = -1;
        for (int i = 0; i < accounts.length; i++) {
            int wealth = 0;
            for (int j = 0; j < accounts[0].length; j++) {
                wealth += accounts[i][j];
            }
            maxWealth = Math.max(maxWealth, wealth);
        }
        return maxWealth;
    }

    // Q-5
    public int[] shuffle(int[] nums, int n) {
        int k = 0;
        int[] arr = new int[2 * n];
        for (int i = 0; i < n; i++) {
            arr[k++] = nums[i];
            arr[k++] = nums[n + i];
        }
        return arr;
    }

    // Q-6
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n = candies.length;
        List<Boolean> result = new ArrayList<>();
        int maxCandies = 0;
        for (int i = 0; i < n; i++) {
            maxCandies = Math.max(maxCandies, candies[i]);
        }
        for (int i = 0; i < n; i++) {
            result.add(candies[i] + extraCandies >= maxCandies);
        }
        return result;
    }

    // Q-7
    public int numIdenticalPairs(int[] nums) {
        int n = nums.length;
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < i; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
        }
        return count;
    }

    // Q-8
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int n = nums.length;
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (nums[j] < nums[i]) {
                    ans[i]++;
                }
            }
        }
        return ans;
    }

    // Q-9
    public int[] createTargetArray(int[] nums, int[] index) {
        int n = index.length;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            list.add(index[i], nums[i]);
        }
        int[] target = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            target[i] = list.get(i);
        }
        return target;
    }

    // Q-10
    public boolean checkIfPangram(String sentence) {
        int n = sentence.length();
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            char ch = sentence.charAt(i);
            if (!map.containsKey(ch)) {
                map.put(ch, 1);
            }
        }
        return map.size() == 26;
    }

}
