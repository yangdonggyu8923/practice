package baekjoon;

import java.util.Scanner;

public class Cake17256 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ax = sc.nextInt();
        int ay = sc.nextInt();
        int az = sc.nextInt();
        int cx = sc.nextInt();
        int cy = sc.nextInt();
        int cz = sc.nextInt();

        System.out.print((cx-az)+" "+(cy/ay)+" "+(cz-ax));
    }
}
