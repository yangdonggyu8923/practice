package baekjoon;


import java.util.Scanner;
import java.math.BigInteger;

public class BigIntAdd10757 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        BigInteger a = new BigInteger(in.next());
        BigInteger b = new BigInteger(in.next());

        a = a.add(b);

        System.out.println(a);
    }
}
