package baekjoon;

import java.util.Scanner;

public class Ah4999 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        String b = sc.nextLine();
        if (a.length() >= b.length()) {
            System.out.println("go");
        } else {
            System.out.println("no");
        }
    }
}
