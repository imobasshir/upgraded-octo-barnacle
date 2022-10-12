package io.github.imobasshir.basics.maths;

public class Armstrong {
    public static void main(String[] args) {
        System.out.println(armstrongNumber(153));
    }

    private static boolean armstrongNumber(int n) {
        // code here
        int sum = 0;
        int temp;
        temp = n;
        while (n != 0) {
            int rem = n % 10;
            int m = (rem * rem * rem);
            sum = sum + m;
            n /= 10;
        }
        if (sum == temp) {
            return true;
        } else return false;
    }
}
