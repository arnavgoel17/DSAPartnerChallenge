import java.util.*;

public class Day9 {
    // Q-1
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int top = 0;
        int bottom = matrix.length - 1;
        int left = 0;
        int right = matrix[0].length - 1;
        while (top <= bottom && left <= right) {
            for (int i = left; i <= right; i++) {
                list.add(matrix[top][i]);
            }
            top++;
            for (int i = top; i <= bottom; i++) {
                list.add(matrix[i][right]);
            }
            right--;
            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    list.add(matrix[bottom][i]);
                }
            }
            bottom--;
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    list.add(matrix[i][left]);
                }
            }
            left++;
        }
        return list;
    }

    // Q-2
    public void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] rows = new boolean[m];
        boolean[] cols = new boolean[n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    rows[i] = true;
                    cols[j] = true;
                }
            }
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (rows[i] || cols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }

    // Q-3
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] answer = new int[n];
        int zeroes = 0;
        int product = 1;
        for (int i = 0; i < n; i++) {
            if (nums[i] == 0) {
                zeroes++;
                continue;
            }
            if (zeroes > 1) {
                break;
            }
            product *= nums[i];
        }
        for (int i = 0; i < n; i++) {
            if (zeroes == 0) {
                answer[i] = product / nums[i];
            } else if (zeroes == 1 && nums[i] == 0) {
                answer[i] = product;
            } else {
                answer[i] = 0;
            }
        }
        return answer;
    }

    // Q-4
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

    // Q-5
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] arr = new int[n - k];
        for (int i = 0; i < n - k; i++) {
            arr[i] = nums[i];
        }
        int p = 0;
        for (int i = 0; i < n; i++) {
            if (i < k) {
                nums[i] = nums[n - k + i];
            } else {
                nums[i] = arr[p++];
            }
        }
    }

    // Q-6
    public int mySqrt(int x) {
        if (x < 2) {
            return x;
        }
        int s = 0;
        int e = x;
        int ans = -1;
        while (s <= e) {
            int m = s + (e - s) / 2;
            if ((long) m * m == x) {
                return (int) m;
            } else if ((long) m * m < x) {
                ans = m;
                s = m + 1;
            } else {
                e = m - 1;
            }
        }
        return ans;
    }

    // Q-7
    int guess(int num) {
        // API call, taking randomly 0 here
        return 0;
    }
    public int guessNumber(int n) {
        int s = 1;
        int e = n;
        while (s <= e) {
            int m = s + (e - s) / 2;
            int w = guess(m);
            if (w == 0) {
                return m;
            } else if (w == -1) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return -1;
    }

    // Q-7
    private boolean isBadVersion(int m) {
        // API call, taking randomly true here
        return true;
    }
    public int firstBadVersion(int n) {
        int s = 1;
        int e = n;
        int ans = 0;
        while (s <= e) {
            int m = s + (e - s) / 2;
            boolean isBad = isBadVersion(m);
            if (isBad) {
                ans = m;
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return ans;
    }

    // Q-8
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        while (left < right) {
            if (numbers[left] + numbers[right] == target) {
                return new int[]{left + 1, right + 1};
            }
            else if (numbers[left] + numbers[right] > target) {
                right--;
            }
            else {
                left++;
            }
        }
        return new int[]{0, 0};
    }

}
