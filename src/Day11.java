public class Day11 {

    // Q-1
    public static int[] searchRange(int[] nums, int target) {
        int[] ans = {-1, -1};
        int s = 0;
        int e = nums.length - 1;

        // for min
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (nums[m] > target) {
                e = m - 1;
            }
            if (nums[m] < target) {
                s = m + 1;
            }
            if (nums[m] == target) {
                ans[0] = m;
                e = m - 1;
            }
        }

        // for max
        s = 0;
        e = nums.length - 1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (nums[m] > target) {
                e = m - 1;
            }
            if (nums[m] < target) {
                s = m + 1;
            }
            if (nums[m] == target) {
                ans[1] = m;
                s = m + 1;
            }
        }
        return ans;
    }

    // Q-2
    public int singleNonDuplicate(int[] nums) {
        int s = 0;
        int e = nums.length - 1;

        while (s < e) {
            int m = s + (e - s) / 2;
            if (m % 2 == 1) {
                m--;
            }
            if (nums[m] == nums[m + 1]) {
                s = m + 2;
            } else {
                e = m;
            }
        }
        return nums[s];
    }

    // Q-3
    public int search0(int[] nums, int target) {
        int s = 0;
        int e = nums.length - 1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if (nums[m] == target) {
                return m;
            }
            if (nums[s] <= nums[m]) {
                if (nums[m] > target && target >= nums[s]) {
                    e = m - 1;
                } else {
                    s = m + 1;
                }
            } else {
                if (nums[m] < target && target <= nums[e]) {
                    s = m + 1;
                } else {
                    e = m - 1;
                }
            }
        }
        return -1;
    }

     // Q-4
     public boolean search(int[] nums, int target) {
         int s = 0;
         int e = nums.length - 1;

         while (s <= e) {
             int m = s + (e - s) / 2;

             if (nums[m] == target) {
                 return true;
             }
             if (nums[s] == nums[m] && nums[m] == nums[e]) {
                 s++;
                 e--;
             }
             // Left half sorted
             else if (nums[s] <= nums[m]) {
                 if (target >= nums[s] && target < nums[m]) {
                     e = m - 1;
                 } else {
                     s = m + 1;
                 }
             }
             // Right half sorted
             else {
                 if (target > nums[m] && target <= nums[e]) {
                     s = m + 1;
                 } else {
                     e = m - 1;
                 }
             }
             return false;
         }

         return false;
     }

     // Q-5
     public static int findMin(int[] nums) {
         int s = 0;
         int e = nums.length - 1;
         int min = nums[0];
         while (s < e) {
             int mid = s + (e - s) / 2;
             if (nums[mid] <= nums[e] && nums[mid] <= nums[s]) {
                 min = Math.min(min, nums[mid]);
             }
             if (nums[mid] > nums[e]) {
                 s = mid + 1;
             } else {
                 e = mid - 1;
             }
         }

         return Math.min(min, nums[s]);
     }

}
