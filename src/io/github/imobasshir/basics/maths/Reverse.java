package io.github.imobasshir.basics.maths;

public class Reverse {
    public static void main(String[] args) {
        System.out.println(reverse(12345));
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
