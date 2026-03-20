import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Q-1
        System.out.println("Enter your number: ");
        int num = sc.nextInt();
        boolean even = num % 2 == 0;
        System.out.println("The number is " + (even ? "even" : "odd"));

        // Q-2
        String name = sc.next();
        System.out.println("Hello " + name + ", welcome to the DSA Challenge!");

        // Q-3
        int P = sc.nextInt();
        int T = sc.nextInt();
        int R = sc.nextInt();
        double S = P * T * R / (double) 100;
        System.out.println("Simple Interest: " + S);

        // Q-7
        int n = sc.nextInt();
        int a = 0;
        int b = 1;
        System.out.println(a);
        System.out.println(b);
        for (int i = 2; i < n; i++) {
            int c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }

        // Q-8
        String str = sc.next();
        int s = 0;
        int e = str.length() - 1;
        boolean pal = true;
        while (s < e) {
            if (str.charAt(s) != str.charAt(e)) {
                pal = false;
                break;
            }
            s++;
            e--;
        }
        System.out.println(pal ? "Palindrome" : "Not a Palindrome");

        // Q-9
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        List<Integer> list = getArmstrongNums(num1, num2);
        System.out.println(list);
    }

    private static List<Integer> getArmstrongNums(int num1, int num2) {
        List<Integer> list = new ArrayList<>();
        for (int i = num1; i <= num2; i++) {
            int temp = i;
            int digits = 0;
            while (temp > 0) {
                temp = temp / 10;
                digits++;
            }
            temp = i;
            int sum = 0;
            while (temp > 0) {
                sum += (int) Math.pow(temp % 10, digits);
                temp = temp / 10;
            }
            if (sum == i) {
                list.add(i);
            }
        }
        return list;
    }
}
