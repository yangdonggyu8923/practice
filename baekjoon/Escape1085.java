package baekjoon;

import java.util.Scanner;

public class Escape1085 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int w = sc.nextInt();
        int h = sc.nextInt();

        int a = 0;
        int b = 0;
        if(x<w-x){
            a=x;
        }
        else {
            a=w-x;
        }
        if(y<h-y){
            b=y;
        }
        else {
            b=h-y;
        }
        if(a>b){
            System.out.println(b);
        }
        else {
            System.out.println(a);
    }
}}
