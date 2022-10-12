package io.github.imobasshir.basics.maths;

public class Palindrome {
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }

    public static boolean isPalindrome(int x) {
        if (x < 0)
            return false;
        if (reverse(x) == x)
            return true;
        return false;
    }

    public static int reverse(int x) {
        int ans = 0;
        while (x > 0) {
            int rem = x % 10;
            ans = ans * 10 + rem;
            x /= 10;
        }
        return ans;
    }
}
