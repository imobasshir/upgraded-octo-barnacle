package io.github.imobasshir.basics.recursion;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println(fibo(8));
    }

    private static int fibo(int n) {
        if (n < 2) {
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
