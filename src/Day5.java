import java.util.ArrayList;
import java.util.List;

public class Day5 {

    // Q-1
    private static boolean isPalindrome(int num) {
        String str = String.valueOf(num);
        int s = 0;
        int e = str.length() - 1;
        while (s < e) {
            if (str.charAt(s) != str.charAt(e)) {
                return false;
            }
            s++;
            e--;
        }
        return true;
    }

    // Q-2
    private static int getHCF(int num1, int num2) {
        for (int i = Math.min(num1, num2); i > 0; i--) {
            if (num1 % i == 0 && num2 % i == 0) {
                return i;
            }
        }
        return -1;
    }
    private static int getLCM(int num1, int num2) {
        int hcf = getHCF(num1, num2);
        return num1 * num2 / hcf;
    }

}
