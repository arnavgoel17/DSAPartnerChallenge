import java.util.*;

public class Day10 {

    // Q-1
    public boolean isPerfectSquare(int num) {
        if (num == 1) {
            return true;
        }
        int s = 1;
        int e = num;
        int ans = 0;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if ((long) m * m == num) {
                return true;
            } else if ((long) m * m < num) {
                ans = m;
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return ans * ans == num;
    }

    // Q-2
    public int arrangeCoins(int n) {
        if (n < 2) {
            return n;
        }
        int s = 1;
        int e = n;
        int ans = 0;
        while (s <= e) {
            int m = s + (e - s) / 2;
            long levels = (long) m * (m + 1) / 2;
            if (levels == n) {
                return m;
            } else if (levels < n) {
                ans = m;
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return ans;
    }

    // Q-3
    public char nextGreatestLetter(char[] letters, char target) {
        int s = 0;
        int e = letters.length - 1;
        if ((int) target > (int) letters[e]) {
            return letters[0];
        }
        int ans = 0;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if ((int) letters[m] > (int) target) {
                ans = m;
                e = m - 1;
            } else {
                s = s + 1;
            }
        }
        return letters[ans];
    }

    // Q-4
    public int findKthPositive(int[] arr, int k) {
        int i = 0;
        int j = 1;
        while (k > 0 && i < arr.length) {
            if (arr[i] != j) {
                k--;
                j++;
            } else {
                i++;
                j++;
            }
        }
        j += k;
        return j - 1;
    }

    // Q-5
    public int searchInsert(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (nums[mid] == target) {
                return mid;
            }
            if (nums[mid] < target) {
                start = mid + 1;
            }
            if (nums[mid] > target) {
                end = mid - 1;
            }
        }
        return start;
    }

    // Q-6
    public int peakIndexInMountainArray(int[] arr) {
        int s = 0;
        int e = arr.length - 1;

        while (s <= e) {
            int m = s + (e - s) / 2;
            if (arr[m] > arr[m + 1] && arr[m] > arr[m - 1]) {
                return m;
            } else if (arr[m] > arr[m + 1]) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return -1;
    }

    // Q-7
    public int countNegatives(int[][] grid) {
        int mL = grid.length;
        int n = grid[0].length;
        int count = 0;
        for (int i = 0; i < mL; i++) {
            int s = 0;
            int e = n - 1;
            int ans = n;
            while (s <= e) {
                int m = s + (e - s) / 2;
                if (grid[i][m] < 0) {
                    ans = m;
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            }
            count += n - ans;
        }
        return count;
    }

    // Q-8
    public int[] intersection(int[] nums1, int[] nums2) {
        int i = 0;
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            map.put(num, 0);
        }
        for (int num : nums2) {
            if (map.containsKey(num)) {
                if (map.get(num) == 0) {
                    list.add(num);
                    map.put(num, 1);
                }
            }
        }
        int[] arr = new int[list.size()];
        for (int num : list) {
            arr[i++] = num;
        }
        return arr;
    }

    // Q-9
    public int[] intersect(int[] nums1, int[] nums2) {
        int i = 0;
        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int num : nums1) {
            int n = map.getOrDefault(num, 0);
            map.put(num, n + 1);
        }
        for (int num : nums2) {
            if (map.containsKey(num)) {
                int n = map.get(num);
                if (n > 0) {
                    list.add(num);
                    map.put(num, n - 1);
                }
            }
        }
        int[] arr = new int[list.size()];
        for (int num : list) {
            arr[i++] = num;
        }
        return arr;
    }

    // Q-10
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        // x - y = diff / 2;
        Set<Integer> set = new HashSet<>();
        int alice = 0;
        int bob = 0;
        for (int num : aliceSizes) {
            set.add(num);
            alice += num;
        }
        for (int num : bobSizes) {
            bob += num;
        }
        int t = (alice - bob) / 2;
        for (int num : bobSizes) {
            if (set.contains(num + t)) {
                return new int[] {num + t, num};
            }
        }
        return new int[] {-1, -1};
    }

    // Q-11
    public boolean checkIfExist(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int num : arr) {
            if ((num % 2 == 0 && set.contains(num / 2)) || set.contains(num * 2)) {
                return true;
            }
            set.add(num);
        }
        return false;
    }

}
