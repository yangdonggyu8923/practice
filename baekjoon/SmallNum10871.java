package baekjoon;

import java.util.Scanner;

public class SmallNum10871 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int x = sc.nextInt();
        for(int i=0; i<n;i++){
            arr[i] = sc.nextInt();
            if(arr[i]<x){
                System.out.printf(arr[i]+" ");
            }

        }



    }
}
