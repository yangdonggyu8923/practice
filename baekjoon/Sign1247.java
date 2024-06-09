package baekjoon;

import java.math.BigInteger;
import java.util.Scanner;

public class Sign1247 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            int n = sc.nextInt();

            BigInteger s = BigInteger.ZERO;
            for (int j=0; j<n; j++) {
                s = s.add(sc.nextBigInteger());
            }

            if (s.compareTo(BigInteger.ZERO) < 0) {
                System.out.println("-");
            } else if (s.compareTo(BigInteger.ZERO) > 0) {
                System.out.println("+");
            } else {
                System.out.println(0);
            }
        }

    }
}
