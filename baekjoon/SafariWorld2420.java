package baekjoon;

import java.util.Scanner;

public class SafariWorld2420 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long n = sc.nextLong();
        long m = sc.nextLong();
        System.out.println(Math.abs(n-m));
    }
}
