package baekjoon;

import java.util.Scanner;

public class Receipt25304 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();

        int total = 0;
        for(int i=0; i<n; i++){
            int a = sc.nextInt();
            int b = sc.nextInt();
            total += a*b;
        }
        if (total==x){
            System.out.printf("Yes");
        }
        else {
            System.out.println("No");
        }
    }
}